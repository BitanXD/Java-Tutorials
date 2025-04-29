package Type_Casting;

class A{
    void show1(){
        System.out.println("In show 1 of A");
    }
}

class B extends A{
    void show2(){
        System.out.println("In show 2 of B");
    }
}

public class Demo {
    public static void main(String[] args){
        double val = 3.53;
        int val1 = (int) val;
        System.out.println(val1); // 3

        A objA = new A();
        objA.show1();

        B objB = new B();
        objB.show2();

        A obj = (A) new B(); // up casting
        obj.show1();

        B obj1 = (B) obj; // down casting
        obj1.show2();
    }
}
