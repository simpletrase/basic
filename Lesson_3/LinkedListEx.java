package Lesson_3;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("T");
        System.out.println(linkedList);
        linkedList.add("R");
        System.out.println(linkedList);
        linkedList.add("A");
        System.out.println(linkedList);
        linkedList.add("S");
        System.out.println(linkedList);
        linkedList.add("E");
        System.out.println(linkedList);

        linkedList.addLast("One");
        System.out.println(linkedList);
        linkedList.addFirst("he");
        System.out.println(linkedList);
        linkedList.add(0,"T");
        System.out.println(linkedList);

        linkedList.remove("One");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);



    }
}
