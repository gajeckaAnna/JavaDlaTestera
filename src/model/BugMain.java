package model;

import model.Bug;

public class BugMain {
    public static void main(String[] args) {

        BugReporter ania = new BugReporter("Ania", "Gajecka", "gajecka.anna@gmail.com");
//        BugReporter vincent = new BugReporter("Vincent", "Marvolo", "vincent.marvolo@fod.be");

        Bug beetle = new Bug("This is the bug description", 2, ania);
        beetle.showAllBugInfo();
//        beetle.closeBug();
        beetle.setBugStatus("rejected");
        beetle.showAllBugInfo();

//        Bug ladybug = new Bug("This is another bug description", 6, vincent);
//        ladybug.showAllBugInfo();
//        System.out.println(ladybug.getBugPriority());
//
//
//        Bug cockroach = new Bug("That is another bug!", 3, vincent);
//        cockroach.showAllBugInfo();
//
//        cockroach.setBugDescription("Too small");
//        System.out.println(cockroach.getBugDescription());
//        cockroach.setBugDescription("This is a longer bug description.");
//        System.out.println(cockroach.getBugDescription());
//
//        cockroach.setBugReportedBy("vincent!mun.be");
//        System.out.println(cockroach.getBugReportedBy());
//        cockroach.setBugReportedBy("vincent@mun.com");
//        System.out.println(cockroach.getBugReportedBy());
//
//        cockroach.setBugPriority(-1);
//        cockroach.setBugPriority(6);
//        cockroach.setBugPriority(4);
//        System.out.println(cockroach.getBugPriority());

    }
}
