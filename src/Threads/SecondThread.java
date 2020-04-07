package Threads;

public class SecondThread implements  Runnable {
    @Override
    public void run() {
        System.out.println("Second thread is Running by Runnable interface");
    }
}
