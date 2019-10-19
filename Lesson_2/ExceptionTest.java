package Lesson_2;

public class ExceptionTest {
    public static void main(String[] args) {
       int a, b;
       try {
           a = 0;
           b = 10 / a;
           System.out.println("This message will not be displayed");
       } catch (ArithmeticException e){
           System.out.println("Division by zero ERROR " + e.getMessage());
       }
        System.out.println("Program ends");
    }
}
