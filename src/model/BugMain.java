package model;

import model.Bug;

public class BugMain {
    public static void main(String[] args) {
        Bug beetle = new Bug("This is the bug description", "gajecka.anna@gmail.com", -2);
        beetle.showAllBugInfo();
        System.out.println(beetle.getBugPriority());
        beetle.closeBug();
        beetle.showBugStatus();
        beetle.showAllBugInfo();

        Bug ladybug = new Bug("This is another bug description", "tim@bo.be", 6);
        ladybug.showAllBugInfo();
        System.out.println(ladybug.getBugPriority());


        Bug cockroach = new Bug("That is another bug!", "vincent@mun.be", 3);
        cockroach.showAllBugInfo();

        cockroach.setBugDescription("Too small");
        System.out.println(cockroach.getBugDescription());
        cockroach.setBugDescription("This is a longer bug description.");
        System.out.println(cockroach.getBugDescription());

        cockroach.setBugReportedBy("vincent!mun.be");
        System.out.println(cockroach.getBugReportedBy());
        cockroach.setBugReportedBy("vincent@mun.com");
        System.out.println(cockroach.getBugReportedBy());

        cockroach.setBugPriority(-1);
        cockroach.setBugPriority(6);
        cockroach.setBugPriority(4);
        System.out.println(cockroach.getBugPriority());

    }
}
