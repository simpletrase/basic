package Lesson_1;  /*_*/

import Lesson_1.Obstacle.RunTrack;
import Lesson_1.Obstacle.Wall;
import Lesson_1.Participant.Cat;
import Lesson_1.Participant.Human;
import Lesson_1.Participant.Participant;
import Lesson_1.Participant.Robot;

import java.util.Random;

public class Homework {

    public static void main(String[] args) {
        System.out.println("Preparing an obstacle");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Start the competition");
        competition.startCompetition();

        System.out.println("The competition is over. These players won: ");
        for (Participant winner : competition.getLastWinners()){
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition(){
        Participant human = new Human("Andrey", 3000, 2);
        Participant cat = new Cat("Boris", 5000, 3);
        Participant robot = new Robot("T-1000", 999999999, 10);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(10));
        RunTrack runTrack = new RunTrack(random.nextInt(5000));

        Competition competition = new Competition("The Hunger Games");
        competition.setParticipants(human, cat, robot);
        competition.setObstacles(runTrack, wall);
        return competition;
    }
}
