package Static;


class Mobile{
    String Brand;
    int price;
    static String name;

    public void print(){
        System.out.println(this.Brand + " " + this.price + " " + name);
    }
    public static void show(Mobile obj){
        System.out.println(obj.Brand + " " + obj.price + " " + name);
    }
}

public class Demo {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();

        Mobile.name = "SmartPhone";

        obj1.Brand = "Samsung";
        obj1.price = 1700;
//        obj1.name = "SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.Brand = "Apple";
        obj2.price = 1400;
//        obj2.name = "SmartPhone";

//        obj2.name = "Phone";

        obj1.print();
        obj2.print();

        // Static variables are shared by different objects and can be accessed my class_name.static_instance_variable_name

        Mobile.show(obj1);

    }
}
