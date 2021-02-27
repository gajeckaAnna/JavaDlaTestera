package collections;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<String> testTeam = new ArrayList<>();
        testTeam.add("Fabienne");
        testTeam.add("Vincent");
        testTeam.add("Ania");
        testTeam.add("Sasa");
        testTeam.add("Bart");
        testTeam.add("Raf");
        testTeam.add("Ingrid");
        testTeam.add("Dave");
        testTeam.add("Pieter");
        testTeam.add("David");
        testTeam.add("Nicolas");
        testTeam.add("Marc");

        System.out.println(testTeam);

        for (String name : testTeam) {
            System.out.println(name);
        }

        testTeam.remove(3);
        System.out.println(testTeam);

        testTeam.remove("Nicolas");
        testTeam.remove("David");
        System.out.println(testTeam);

        String name = testTeam.get(5);
        System.out.println(name);

    }
}
