package Lesson_3.Homework;

import java.util.Set;

public class PhonebookTest {

    public static void main(String[] args) {
        PhonebookInterface phonebook = new Phonebook();
        phonebook.add("Ivanov", "+7 (999) 547 - 48 - 23");
        phonebook.add("Petrov", "+7 (952) 663 - 23 - 55");
        phonebook.add("Vasiliev", "+7 (952) 552 - 32 - 14");
        phonebook.add("Sidorov", "+7 (921) 231 - 22 - 40");
        phonebook.add("Pavlov", "+7 (931) 100 - 37 - 01");
        phonebook.add("Petrov", "+7 (900) 144 - 22 - 11");
        phonebook.add("Pavlov", "+7 (901) 341 - 33 - 99");

        Set<String> allSurnames = phonebook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phonebook.get(surname);
            System.out.printf("%s: %s%n", surname, phones );
        }
    }
}
