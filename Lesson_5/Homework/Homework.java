package Lesson_5.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework {

    private static final int SIZE = /*10000000*/ 10_000_000;
    private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {
//        float[] array1 = createArray(SIZE);
//        measureTime(new Runnable() {
//            @Override
//            public void run() {
//                consistentMethod(array1);
//
//            }
//        }, "consistentMethod");
//
//        float[] array2 = createArray(SIZE);
//        measureTime(new Runnable() {
//            @Override
//            public void run() {
//                parallelMethod(array1);
//
//            }
//        }, "parallelMethod");

        float[] array1 = createArray(SIZE);
        measureTime(() -> consistentMethod(array1), "consistentMethod");

        float[] array2 = createArray(SIZE);
        measureTime(() -> parallelMethod(array2), "parallelMethod");

        if (Arrays.equals(array1, array2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays aren't equal");
        }
    }

    private static void consistentMethod(float[] data) {
        consistentMethod(data, 0);
    }

    private static void consistentMethod(float[] data, int offset) {
        for (int index = 0; index < data.length; index++) {
            float currentValue = data[index];
            data[index] = computeValue(index + offset, currentValue);
        }
    }


    private static void parallelMethod(float[] array) {
        float[] part1 = Arrays.copyOfRange(array, 0, HALF_SIZE);
        float[] part2 = Arrays.copyOfRange(array, HALF_SIZE, array.length);

        Thread thread1 = new Thread(() -> consistentMethod(part1, 0));
        Thread thread2 = new Thread(() -> consistentMethod(part2, HALF_SIZE));

        List<Thread> threads = Arrays.asList(thread1, thread2);
        for (Thread thread : threads){
            thread.start();
        }

        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println("Execution was aborted!");
                e.printStackTrace();
                return;
            }
        }

//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            System.err.println("Execution was aborted!");
//            e.printStackTrace();
//            return;
//        }

        System.arraycopy(part1, 0, array, 0, HALF_SIZE);
        System.arraycopy(part2, 0, array, HALF_SIZE, HALF_SIZE);
    }

    private static float[] createArray(int SIZE) {
        float[] array = new float[SIZE];

//        for (int i = 0; i < array.length; i++){
//            array[i] = 1f;
//        }

        Arrays.fill(array, 1f);
        return array;
    }

    private static float computeValue(int index, float currentValue) {
        return (float)(currentValue * Math.sin(0.2f + index / 5.0) * Math.cos(0.2f + index / 5.0) * Math.cos(0.4f + index / 2.0));
    }

    private static void measureTime(Runnable action, String actionName) {
        long start = System.nanoTime();
        action.run();
        long finish = System.nanoTime();
        long duration = finish - start;
        System.out.printf("Method '%s' took %d ms%n", actionName, TimeUnit.NANOSECONDS.toMillis(duration));
    }
}