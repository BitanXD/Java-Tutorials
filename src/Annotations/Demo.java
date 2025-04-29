package Annotations;

class A{
    public void showTheDataThatBelongs(){
        System.out.println("In A show");
    }
}

class B extends A{
    @Override
    public void showTheDataThatBelongs(){
        System.out.println("In B show");
    }
}

public class Demo {
    public static void main(String[] args) {
            B obj = new B();
            obj.showTheDataThatBelongs();
    }
}
