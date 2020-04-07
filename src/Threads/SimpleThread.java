package Threads;

class SimpleThread implements Runnable{

    public void run()
    {
        if(Thread.currentThread().isDaemon())
            System.out.println(Thread.currentThread().getName()+"  is daemon thread");
        else
            System.out.println(Thread.currentThread().getName()+"  is user thread");
    }

}