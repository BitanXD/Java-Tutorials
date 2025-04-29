package ClassAndObjects;

class Person{
    String name;
    int age;
    int salary;
    Person(String name, int age, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public void print(){
        System.out.println("Hello I am " + this.name + " my age is " + this.age + " and my salary is " + this.salary);
    }
}

class Employee extends Person{
    int empId;
    Employee(String name, int age, int salary, int empId){
        super(name, age, salary);
        this.empId = empId;
        super.name = name;
        super.age = age;
        super.salary = salary;
    }
    public void print(){
        System.out.println("Hello I am " + this.name + " my age is " + this.age + " and my salary is " + this.salary + " and my empId is " + this.empId);
    }
}

public class Intro {
    public static void main(String[] args){
        Person p1 = new Person("Bitan", 23, 25000);
        p1.print();
        Employee e1 = new Employee("Sonia", 22, 30000, 12345);
        e1.print();
    }
}
