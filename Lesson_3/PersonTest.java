package Lesson_3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {
        Map<Person, Integer> salaryByWorker = new TreeMap<>(/*Comparator.comparing(Person::getName)*/);
        Person oleg = new Person("Oleg", 29);
        Person alexey = new Person("Alexey", 23);

        salaryByWorker.put(oleg, 100_000);
        salaryByWorker.put(alexey, 120_000);

        for (Person person : salaryByWorker.keySet()) {
            Integer salary = salaryByWorker.get(person);
            System.out.println("Person" + person.getName() + " : " + salary);
        }
    }
}
