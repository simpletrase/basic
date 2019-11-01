package Lesson_5.thread;

public class CreateThreadTest {
    static class MyRunnableClass implements Runnable{

        private int delayInMilli;

        public MyRunnableClass(int delayInMilli){
            this.delayInMilli = delayInMilli;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                try {
                    Thread.sleep(delayInMilli);
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Interrupted from code");
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() + ": new thread: " + i);
                } catch (InterruptedException e){
                    System.out.println("Interrupted from code");
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableClass(100), "1st thread");
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(new MyRunnableClass(100), "2nd thread");
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
//        while (thread1.isAlive()){
//            System.out.println("1st thread is alive");
//            Thread.sleep(10);
//        }
//        System.out.println("1st thread isn't alive. Interrupt 2nd thread");
//        thread2.interrupt();
//
//        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//        Thread thread3 = new Thread(CreateThreadTest::test);
//        thread3.start();
    }

    private static void test() {
        for (int i = 0; i < 10; i++){
            try{
                Thread.sleep(100);
                System.out.println("new thread: " + i);
                System.out.println("thread name: " + Thread.currentThread().getName());
                System.out.println("thread priority: " + Thread.currentThread().getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
