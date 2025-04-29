package Abstract;

abstract class Car{
    abstract void drive();
    void music(){
        System.out.println("Playing music...");
    }
}
/*
class Bike{
    void ride(){

    }
}

 */

class BMW extends Car{ // this is also a conrete class as we can create object of it.
    @Override
    void drive() {
        System.out.println("Driving a BMW...");
    }
    void ride(){

    }
}

class Audi extends Car{ // concrete class - we can create object of a concrete class.
    void drive(){
        System.out.println("Driving a Audi...");
    }
}
public class Demo {
    public static void main(String[] args){
        // Car obj = new Car(); // cannot create an object of abstract class
        Car obj = new BMW();
        obj.drive();
        obj.music();

        Audi obj1 = new Audi();
        obj1.drive();
        obj1.music();
    }
}
