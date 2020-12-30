public class BugMain {
    public static void main(String[] args) {
        Bug beetle = new Bug("This is the bug description", "gajecka.anna@gmail.com", -2);
        beetle.showAllBugInfo();
        beetle.getBugPriority();
        System.out.println(beetle.bugPriority);
        beetle.closeBug();
        beetle.showBugStatus();
        beetle.showAllBugInfo();

        Bug ladybug = new Bug("This is another bug description", "tim@bo.be", 6);
        ladybug.showAllBugInfo();
        ladybug.getBugPriority();
        System.out.println(ladybug.bugPriority);

        Bug cockroach = new Bug("That is another bug!", "vincent@mun.be",3);
        cockroach.showAllBugInfo();
    }
}
