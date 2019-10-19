package Lesson_2.Homework;  /*_*/

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(){
        super("The array should be 4*4 in size");
    }
}
