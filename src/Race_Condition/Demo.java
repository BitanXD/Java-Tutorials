package Race_Condition;

// when two thread are working using the same variable then there might be a case where both thread call the function at the same time.
// and even tho it is called twice it will be updated only once hence we got different results
// to avoid this and to make a thread use the function once at a time use synchronised keyword in the function definition

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
