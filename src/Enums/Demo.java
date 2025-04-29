package Enums;

enum Status{
    Running, Failed, Pending, Success; // named constants
}

public class Demo {
    public static void main(String[] args){
        Status s = Status.Running; // Status is a class and Running, Failed etc are objects of the class.
        Status s1 = Status.Failed;
        Status s2 = Status.Success;
        System.out.println(s);
        System.out.println(s1.ordinal()); // 1
        System.out.println(s2.ordinal()); // 3

        Status[] ss = Status.values();
        for(Status sItem: ss){
            System.out.println(sItem + ":" + sItem.ordinal());
        }

        Status sc = Status.Pending;

        switch (sc){
            case Running:
                System.out.println("All good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }



    }
}
