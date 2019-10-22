package Lesson_3;
                                                 /** CTRL + B       - declaration, usage
                                                     CTRL + Q       - documentation
                                                     CTRL + ALT + B - implementation
                                                     CTRL + F12     - file structure **/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
//        arrayExample();
    arrayListExample();
//    arrayListToArray();
    }

    private static void arrayExample() {
//        int[] arr = new int[3];
        int[] arr = {1, 2, 3, 4};
        int[] arrNew = new int[10];
        System.arraycopy(arr, 0, arrNew, 0, arr.length);
//        int[] arrNew = Arrays.copyOf(arr, 10);
        arr = arrNew;
        arrNew = null;
    }

    /**
     * ArrayList to FoodBasket method
     */

    private static void arrayListToArray(){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
//        arr = list.toArray(new Integer[0]);
        List<Integer> arr2 = Arrays.asList(arr);
    }

    /**
     * ArrayList method
     */

    private static void arrayListExample(){
        ArrayList<String> arrayList = new ArrayList<>();                 // CTRL + B - declaration, usage
        arrayList.add("F");
        System.out.println(arrayList);                                   // CTRL + Q - documentation
        arrayList.add("U");
        System.out.println(arrayList);                                   //CTRL + ALT + B - implementation
        arrayList.add("C");
        System.out.println(arrayList);
        arrayList.add("K");
        System.out.println(arrayList);
        arrayList.add(0,"What the");
        System.out.println(arrayList);

        arrayList.remove("C");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.add(1,"O");
        System.out.println(arrayList);
        arrayList.add(3,"K");
        System.out.println(arrayList);

        System.out.println("arrayList contains F ? " + arrayList.contains("F"));

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
//        List<String> anotherData = new ArrayList<>(arrayList);
        List<String> anotherData = new ArrayList<>(5);
    }
}


