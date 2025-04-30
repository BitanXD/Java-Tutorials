package Threads;
// in this example we can extend a class that we want to we are replacing the extends thread class with a implements Runnable interface
class X implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Y implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Runnable obj1 = new X();
        Runnable obj2 = new Y();
        Runnable obj3 = () ->
            {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Yo");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.start();

        t2.start();

        t3.start();
    }
}
