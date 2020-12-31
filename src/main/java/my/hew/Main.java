package my.hew;

public class Main {

    public static void main(String[] args) {

        HelloThread helloThread = new HelloThread();
        helloThread.start();
        RunnableThread runnableThread = new RunnableThread();
        Thread t1 = new Thread(runnableThread);
        t1.start();

    }

}
