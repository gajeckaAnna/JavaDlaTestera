package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        //Map interface - represents a mapping between a key and a value
        //is not a subtype of the Collection interface
        //contains unique keys

        Map<Integer, String> names = new HashMap<>();

        names.put(0, "Anita");
        names.put(1, "Tamara");
        names.put(2, "Marta");
        names.put(3, "Anna");
        names.put(4, "Sabina");
        names.put(5, "Natalia");
        names.put(6, "Ewelina");

        System.out.println(names);

        names.put(0, "Ania");
        System.out.println(names);


    }
}
