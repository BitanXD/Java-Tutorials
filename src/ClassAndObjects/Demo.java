package ClassAndObjects;

class Computer{
    public void Music(){
        System.out.println("I am Music...");
    }
    public String getPen(int cost){
        return "Ball Pen";
    }
}

class Calculator{
    int num;
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class Student{
    int roll;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args){
        /*
        Computer obj = new Computer();
        obj.Music();
        String result = obj.getPen(10);
        System.out.println(result);

        Calculator ob = new Calculator();
        int sum = ob.add(10,20);
        System.out.println(sum);

         */

        Student s1 = new Student();
        s1.roll = 10;
        s1.name = "Bitan";
        s1.marks = 88;

        Student s2 = new Student();
        s2.roll = 11;
        s2.name = "Sonia";
        s2.marks = 98;

        Student s3 = new Student();
        s3.roll = 12;
        s3.name = "Pudding";
        s3.marks = 81;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Student students[] = new Student[3]; // we are not creating student object here, we are creating an array which can hold student references.
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student obj: students){
            System.out.println(obj.name + " : " + obj.marks);
        }

    }
}
