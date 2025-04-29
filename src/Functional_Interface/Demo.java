package Functional_Interface;
// Functional Interface is an interface which has only one method
@FunctionalInterface
interface A{
//    public void show(int i);
    public int add(int i, int j);
}
/*
class B implements A{
    public void show(){
        System.out.println("In show");
    }
}

 */

public class Demo {
    public static void main(String[] args) {
//        B obj = new B();
//        obj.show();

//        A obj = new A() {
//            @Override // anonymous inner class
//            public void show() {
//                System.out.println("in show");
//            }
//        };

        A obj = (i, j) -> {
            return i + j;
        };

        A obj1 = (i, j) -> i + j;

        // Lambda expression works only with Functional Interface because only one method can the written or else how would you know which method is to be called.

        int result = obj.add(5, 10);
        int result1 = obj1.add(15, 10);
        System.out.println(result);
        System.out.println(result1);
    }
}
