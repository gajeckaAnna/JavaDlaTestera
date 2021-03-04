package collections;

import java.util.HashSet;
import java.util.Set;

public class Names {

    public static void main(String[] args) {

        //Set - an unordered collection of objects in which duplicate values cannot be stored
        Set<String> names = new HashSet<>();
        names.add("Ania");
        names.add("Tamara");
        names.add("Marta");
        names.add("Ania");
        names.add("Sabina");
        names.add("Ewelina");
        names.add("Natalia");

        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

    }
}
