package Inheritance;

class Animal{
    void call(){
        System.out.println("Animal is calling...");
    }
}

class Dog extends Animal{
    void call(){
        System.out.println("Dog is calling...");
    }
}

public class Demo {
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();
        a.call();
        d.call();
        Animal a1 = new Dog();
        a1.call();
        // method over-riding example
    }
}
