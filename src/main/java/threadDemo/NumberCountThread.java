package threadDemo;

public class NumberCountThread extends Thread{
  //  synchronized at method level
  //  synchronized block
    public  void run(){
        System.out.println(" From  NumberCountThread");
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName() +"count : " +i +
                    " prioryty "+ Thread.currentThread().getPriority());
        }
    }
}
