package Lesson_1.Participant;  /*_*/

public class Human implements Participant {

    private  int runLimit;
    private  int jumpLimit;
    private String name;

    public Human(String name, int runLimit, int jumpLimit){

        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }


    @Override
    public int run() {
        return runLimit;
    }

    @Override
    public int jump() {
        return jumpLimit;
    }

    public String toString(){
        return "Human{" +"name= '" + name + '\'' + ", runLimit= " + runLimit + ", jumpLimit= " + jumpLimit + '}';
    }
}
