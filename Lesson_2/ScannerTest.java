package Lesson_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);          // CTRL + ALT + T   for menu
        /*while (true){                                      // CTRL + SLASH || SHIFT + CTR + SLASH   for comment
            try {
                int digit =  scanner.nextInt();
                int c = 5 / digit;
                System.out.println(c);
            } catch (ArithmeticException e) {
               // e.printStackTrace();
                System.out.println("Division by zero (" + e.getMessage() + ")");
                break;
            } catch (InputMismatchException e){
               // e.printStackTrace();
                System.out.println("Incorrect data format (" + e.getMessage() + ")");
                break;
            } catch (Exception e){
                // e.printStackTrace();
                System.out.println("Unknown ERROR (" + e.getMessage() + ")");
            }
        }
        */
        readFile();

//        try {
//            readFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void readFile() throws IOException {
        try {
            Files.readAllBytes(Paths.get("test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
