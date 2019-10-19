package Lesson_1.Obstacle;  /*_*/

import Lesson_1.Participant.Participant;

public class RunTrack implements Obstacle {

    private int length;

    public RunTrack(int length){

        this.length = length;
    }


    @Override
    public boolean passObstecleBy(Participant participant) {

        if(participant.run() > length) {
            System.out.println("Participant " + participant + " successfully ran a distance");
            return true;
        } else {
            System.out.println("Participant " + participant + " didn't run the distance");
            return false;
        }
    }
}
