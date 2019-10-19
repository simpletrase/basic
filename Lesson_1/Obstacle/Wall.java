package Lesson_1.Obstacle;  /*_*/

import Lesson_1.Participant.Participant;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height){

        this.height = height;
    }


    @Override
    public boolean passObstecleBy(Participant participant) {

        if(participant.jump() > height) {
            System.out.println("Participant " + participant + " successfully jumped over the wall");
            return true;
        } else {
            System.out.println("Participant " + participant + " didn't jump over the wall");
            return false;
        }
    }
}
