package Lesson_2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OutOfMemoryTest {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        try {
            while (true){
                UUID uuid = UUID.randomUUID();
                collection.add(uuid.toString());

            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory");
            System.out.println("String count is " + collection.size());
            e.printStackTrace();
        }
    }
}
