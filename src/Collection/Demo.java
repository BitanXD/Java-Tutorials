package Collection;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> vals = new TreeSet<>();
        vals.add(110);
        vals.add(220);
        vals.add(30);
        vals.add(45);

//        for (Object val : vals) System.out.println(num);

        System.out.println(vals);
    }
}
