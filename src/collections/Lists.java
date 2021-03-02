package collections;

import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // dynamic array
        List<String> technicolor = new LinkedList<>();

        //elements (nodes) are linked using pointers and addresses
        technicolor.add("blue");
        technicolor.add("green");
        technicolor.add("yellow");
        technicolor.add("red");

        System.out.println(technicolor);

        technicolor.add(1, "turquoise");
        System.out.println(technicolor);

        technicolor.add(4, "navy blue");
        System.out.println(technicolor);

        technicolor.remove("green");
        technicolor.remove(2);
        System.out.println(technicolor);

    }
}
