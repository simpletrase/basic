package Lesson_2;

import java.util.Scanner;

public class ThrowTest {
    private static double sqrt(double in){
        if (in < 0.0){
//            throw new ArithmeticException("Square root of a negative number doesn't exist");    // CTRL + ALT + M - Create method
            throw new NegativeSquareRootException();
        }
        return Math.sqrt(in);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double in = scanner.nextDouble();
        System.out.println("Root square = " + sqrt(in));
    }
}
