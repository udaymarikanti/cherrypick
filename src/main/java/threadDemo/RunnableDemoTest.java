package threadDemo;

public class RunnableDemoTest {
    public static void main(String[] args) {
        Runnable numberCountRunnable = new NumberCountRunableThread();
        Thread thread = new Thread(numberCountRunnable,"Runnable Thread MY -1");
        thread.start();

    }
}
