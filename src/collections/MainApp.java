package collections;

import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println(testTeam.size());
        System.out.println(testTeam.isEmpty());
        System.out.println(testTeam.contains("Sasa"));
        System.out.println(testTeam.contains("Ania"));

        ArrayList<String> devTeam = new ArrayList<>();
        devTeam.add("Arno");
        devTeam.add("Alexander");
        devTeam.add("Frans");
        devTeam.add("Wim");
        devTeam.add("Justin");
        devTeam.add("Simon");

        ArrayList<String> analists = new ArrayList<>();
        analists.add("Housseyn");
        analists.add("Simon");

        ArrayList<String> pms = new ArrayList<>();
        pms.add("Luc");
        pms.add("Erwin");

        ArrayList<String> standUp = new ArrayList<>();
        standUp.addAll(testTeam);
        standUp.addAll(devTeam);
        standUp.addAll(analists);
        standUp.addAll(pms);
        System.out.println(standUp);

        standUp.removeAll(pms);
        System.out.println(standUp);

        Collections.sort(standUp);
        System.out.println(standUp);

        Collections.reverse(standUp);
        System.out.println(standUp);


    }
}
