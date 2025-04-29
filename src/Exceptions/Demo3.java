package Exceptions;

class A{
    public void show() throws ClassNotFoundException {
            Class.forName("Exceptions.Calc");

    }
}

public class Demo3 {
    static {
        System.out.println("Class loaded!");
    }
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }catch (ClassNotFoundException e){
//            System.out.println(e);
            e.printStackTrace();
        }


    }
}
