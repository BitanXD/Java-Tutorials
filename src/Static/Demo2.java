package Static;

class Mobile2{
    String brand;
    int price;
    static String name;

    public Mobile2(){
        brand = "";
        price = 200;
        System.out.println("In constructor block");
    }

    static{
        name = "Phone";
        System.out.println("In Static Block");
    }
}

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile2");
        /*
        Mobile2 obj = new Mobile2();
        Mobile2 obj1 = new Mobile2();

         */
    }
}
