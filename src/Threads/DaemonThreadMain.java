package Threads;

public class DaemonThreadMain {
    public static void main(String[] args){
        SimpleThread st=new SimpleThread();
        Thread th1=new Thread(st,"Thread 1");//creating threads
        Thread th2=new Thread(st,"Thread 2");
        Thread th3=new Thread(st,"Thread 3");

        /**
         * Last updated : January 8th, 2020
         *  NO COMMENTSDaemon thread in java with example
         *
         * PreviousNext
         * Daemon threads are low priority background threads which provide services to user threads. It’s life depends on user threads. If no user thread is running then JVM can exit even if daemon threads are running. JVM do not wait for daemon threads to finish.
         * Daemon threads perform background tasks such as garbage collection, finalizer  etc.
         * The only purpose of daemon thread is to serve user thread so if there are no user threads, there is no point of JVM to run these threads, that’s why JVM exits once there are no user threads.
         * Two method related to daemon thread
         * Public void setDaemon(boolean status) :
         * This method can be used to mark thread as user  or daemon thread. If you put setDaemon(true), it makes thread as daemon.
         *
         * Public boolean isDaemon()
         * This method can be used to check if thread is daemon or not.
         * Daemon Thread example:

         * Please note that you can not convert user thread to daemon thread once it is started otherwise it will throw IllegalThreadStateException.
         */
        th1.setDaemon(true);//now th2 is daemon thread

        th1.start();//starting all threads
        th2.start();
        th3.start();
        th1.start();
        System.out.println("th1 is alive = "+th1.isAlive());
        System.out.println("th2 is alive = "+th2.isAlive());
        System.out.println("th3 is alive = "+th3.isAlive());
    }
}
