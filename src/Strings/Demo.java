package Strings;

public class Demo {
    public static void main(String[] args){
        /*
        String name = "Bitan"; // let address = 101
        name = name + " Sarkar"; // this will create a new object and name will point to that object now say 103
        System.out.println("hello " + name);

         */

        // StringBuffer

        StringBuffer sb = new StringBuffer("Bitan");
        System.out.println("Capacity : " + sb.capacity());
        System.out.println("Length : " + sb.length());

        sb.append(" Sarkar");
        String sub = sb.substring(6);
        System.out.println(sub);
        System.out.println(sb);
    }
}
