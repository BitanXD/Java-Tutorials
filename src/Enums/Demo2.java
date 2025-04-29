package Enums;

enum Laptop{
    Mackbook(2000), Lenovo(2200), Asus(1800), Hp, Dell(1700);

    private int price;

    private Laptop(){
        price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Mackbook;
        System.out.println(lap);
        System.out.println(lap.getPrice());
        lap.setPrice(3000);
        System.out.println(lap.getPrice());


        for(Laptop lapItem: Laptop.values()){
            System.out.println(lapItem + ": " + lapItem.getPrice());
        }
    }
}
