package Inner_Class;

class A{
    int age;
    void show(){
        System.out.println("In show");
    }
    static class B{
        void config(){
            System.out.println("In Config");
        }
    }
}

public class Demo {
    public static void main(String[] args){
        A obj = new A();
        obj.show();
/*
        A.B obj1 = obj.new B(); // since B is non-static we need to call by the obj of A class.
        obj1.config();

 */
        A.B obj1 = new A.B(); // since we made B class static we can call it by the A.B
        obj1.config();
// outer class cannot be made static only inner class is static

    }
}
