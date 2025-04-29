package Interface;

// interface is not there in the memory and hence we cannot have non-final variables

interface A{
    int age = 10; // by default, interface variables are static and final
    String name = "Bitan";
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    void ride();
}

class B implements A, Y{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In Config");
    }

    @Override
    public void ride() {
        System.out.println("Riding...");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}

public class Demo {
    public static void main(String[] args){
        A obj;
//        obj = new A(); this will throw error as we cannot create object of interface
        obj = new B();
        obj.show();
        obj.config();
//        A.name = "Sonia"; this cannot be done as it is final
        System.out.println(A.age);
    }
}

// in interface we can implement multiple interfaces but in abstract class we can extend only one
/*
why do we need interface?
Computer, laptop and Desktop for a developer Example ------

 */

