package Exceptions;

// Errors :
//    Compile-time error
//    Runtime error
//    Logical error

// Exceptions are runtime errors


public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 10;
        String s = null;

        int[] nums = new int[5];
        try{
            j = 10/i;
            System.out.println(s.length());
            System.out.println(nums[1]);
            System.out.println(nums[4]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("in Finally block");
        }

        System.out.println(j);

        System.out.println("bye-bye");
    }
}
