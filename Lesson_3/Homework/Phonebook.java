package Lesson_3.Homework;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook implements PhonebookInterface {

    private final Map<String, Set<String>> phonesBySurname = new TreeMap<>();

    @Override
    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    @Override
    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public Set<String> getAllSurnames() {
        return phonesBySurname.keySet();
    }

    private Set<String> getPhones(String surname){
        Set<String> phones = phonesBySurname.get(surname);
        if (phones == null){
            phones = new HashSet<>();
            phonesBySurname.put(surname, phones);
        }
        return phones;

//        return phonesBySurname.computeIfAbsent(surname, key -> new HashSet<>());
    }
}
