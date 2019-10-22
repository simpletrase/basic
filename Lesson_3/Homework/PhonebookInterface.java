package Lesson_3.Homework;

import java.util.Set;

public interface PhonebookInterface {

    void add(String surname, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}
