package model;

import model.Bug;

public class BugMain {
    public static void main(String[] args) {

        BugReporter bart = new BugReporter("Bart", "Esbeek", "bart.at.fod.be");
        System.out.println(bart);

        bart.setEmail("bart@fod.be");
        System.out.println(bart);

        BugReporter ania = new BugReporter("Ania", "Gajecka", "gajecka.anna@gmail.com");

        Bug beetle = new Bug("This is the bug description", 2, ania);
        beetle.showAllBugInfo();
        System.out.println(beetle);
        beetle.setBugStatus("unknown");
        beetle.setBugStatus("rejected");
        beetle.showBugReportedBy();
        beetle.closeBug();


        Bug polyphaga = new Bug("Polyphaga", 7, bart);
        polyphaga.showAllBugInfo();

        Bug jewelBeetle = new Bug("", -4, bart);
        jewelBeetle.showAllBugInfo();

        BugReporter vincent = new BugReporter("Vincent", "Marvolo", "vincent.marvolo@fod.be");
        Bug ladybug = new Bug("This is another bug description", 6, vincent);
        ladybug.showAllBugInfo();
        ladybug.getBugPriority();

        Bug cockroach = new Bug("That is another bug!", 3, vincent);
        cockroach.showAllBugInfo();

        cockroach.setBugDescription("Too small");
        System.out.println(cockroach.getBugDescription());
        cockroach.setBugDescription("This is a longer bug description.");
        System.out.println(cockroach.getBugDescription());

//        cockroach.setBugReportedBy("vincent!mun.be");
//        System.out.println(cockroach.getBugReportedBy());
//        cockroach.setBugReportedBy("vincent@mun.com");
//        System.out.println(cockroach.getBugReportedBy());

        cockroach.setBugPriority(-1);
        cockroach.setBugPriority(6);
        cockroach.setBugPriority(4);

    }
}
