package threadDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread.currentThread();
        Thread thread = Thread.currentThread();
        Thread.currentThread().setName("uday");

        String threadName  = Thread.currentThread().getName();
        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread countThread = new NumberCountThread();
        countThread.setName("Count thread 1 : " );
        countThread.start();

        Thread countThread2 = new NumberCountThread();
        countThread2.setName("Count thread 2 : " );
        countThread2.start();
        countThread2.setPriority(5);

        Thread countThread3 = new NumberCountThread();
        countThread3.setName("Count thread 3 : " );
        countThread3.start();
        countThread3.setPriority(10);



    }
}
