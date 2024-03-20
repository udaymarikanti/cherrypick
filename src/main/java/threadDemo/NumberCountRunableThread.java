package threadDemo;

public class NumberCountRunableThread implements Runnable{
    public  void run(){
        System.out.println(" From  NumberCountRunableThread");
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName() +"count : " +i +
                    " prioryty "+ Thread.currentThread().getPriority());
        }
    }
}

