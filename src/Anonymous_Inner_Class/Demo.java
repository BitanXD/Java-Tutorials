package Anonymous_Inner_Class;

class A{
    int age;
    void show(){
        System.out.println("In A show");
    }
}

public class Demo {
    public static void main(String[] args){
        A obj = new A()
        { // this is the anonymous class
            void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();

    }
}
