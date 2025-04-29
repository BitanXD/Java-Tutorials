package Encapsulation;

class Human{
    private int age;
    private String name;

    public void set(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}

public class Demo {
    public static void main(String[] args){
        Human obj = new Human();
//        obj.age = 22;
//        obj.name = "Bitan";

        obj.set(22, "Bitan");

        System.out.println("Age: " + obj.getAge());
    }
}
