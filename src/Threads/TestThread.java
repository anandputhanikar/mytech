package Threads;

public class TestThread {

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        SecondThread secondThread = new SecondThread();
        Thread secThread = new Thread(secondThread);
        secThread.start();
    }
}
