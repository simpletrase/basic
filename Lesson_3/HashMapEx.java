package Lesson_3;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
//        Map<String, String> mapName = new LinkedHashMap<>();      // strict order
//        Map<String, String> mapName = new HashMap<>();            // random order
        Map<String, String> mapName = new TreeMap<>(Comparator.reverseOrder());            // sorting reverse (in constructor)

        mapName.put("Russia", "Moscow");
        mapName.put("France", "Paris");
        mapName.put("Germany", "Berlin");
        mapName.put("Iran", "Tehran");

        mapName.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

//        Map<Person, Integer> salaryByWorker = new HashMap<>();
//        salaryByWorker.put(new Person("Oleg", 27), 100_000 );
//        salaryByWorker.put(new Person("Alexey", 22), 77_000 );
//
//        System.out.println("Alexey salary: " + salaryByWorker.get(new Person("Alexey", 22)));

//        for (Map.Entry<String, String> o : mapName.entrySet()){
//            System.out.println(o.getKey() + " : " + o.getValue());
//        }
//
//        for (String key : mapName.keySet()) {
//            String value = mapName.get(key);
//        }


//        mapName.put("Germany", "Frankfurt");
//        System.out.println("New Germany entry: " + mapName.get("Germany"));
    }
}
