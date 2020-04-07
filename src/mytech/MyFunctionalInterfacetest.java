package mytech;

public class MyFunctionalInterfacetest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I have implemented functional runnable interface");
            }
        }).start();
    }
}
