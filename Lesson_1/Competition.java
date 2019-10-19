package Lesson_1;  /*_*/

import Lesson_1.Obstacle.Obstacle;
import Lesson_1.Participant.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {
    private String competitionTitle;

    private Obstacle[] obstacles;
    private Participant[] participants;

    private List<Participant> lastWinners = new LinkedList<>();

    public Competition(String competitionTitle){
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition(){
        lastWinners.clear();

        for(Participant participant : participants){
            boolean success = passAllObstacles(participant);
            if(!success) {
                System.out.println("Participant " + participant + " left competition");
            } else {
                lastWinners.add(participant);
            }
        }
    }

    public Iterable<Participant> getLastWinners(){
        return lastWinners;
    }

    private boolean passAllObstacles(Participant participant){
        for (Obstacle obstacle : obstacles) {
        if (!obstacle.passObstecleBy(participant)){
                return false;
            }
        }
        return true;
    }
}

