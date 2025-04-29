package Final;

class Calculator{ // if we make class final then it cannot be extended further but what if we want to let it extended further... then we make a method final to avoid credit theft
    public final void show(){ // with the final keyword, method over-riding is stopped.
        System.out.println("In Calculator Show");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class AdvanceCalculator extends Calculator{
    /*
    public void show(){
        System.out.println("In Advance Calculator Show");
    }

     */
}


public class Demo {
    public static void main(String[] args){
        final double pi = 3.14; // no one can change the value in the future
        // pi = 10; // this will throw error
        Calculator c1 = new Calculator();
        c1.show();
        c1.add(10,20);

        AdvanceCalculator ac1 = new AdvanceCalculator();
        ac1.show();
        ac1.add(20,30);

        Calculator c2 = new Calculator();
//        c2.add(10,20);
//        c2 = c1;
        System.out.println(c1.equals(c2));
    }
}
