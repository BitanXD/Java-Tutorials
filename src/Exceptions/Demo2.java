package Exceptions;

class BitanException extends Exception{
    public BitanException(String str){
        super(str);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            if(j == 0)
//                throw new ArithmeticException("I dont want to print 0");
                throw new BitanException("I dont want to print 0");
        }
        catch (BitanException e){
            j = 18 / 1;
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
