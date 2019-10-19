package Lesson_2;

public class NegativeSquareRootException extends ArithmeticException /*RuntimeException*/ {
    public NegativeSquareRootException(){
        super("Square root of a negative number doesn't exist");
    }
}
