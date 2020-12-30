public class BugMain {
    public static void main(String[] args) {
        Bug beetle = new Bug("This is the bug description", "gajecka.anna@gmail.com", -2);
        beetle.getAllInfo();
        beetle.getBugPriority();
        System.out.println(beetle.bugPriority);
        beetle.closeBug();
        beetle.getAllInfo();

        Bug ladybug = new Bug("This is another bug description", "tim@bo.be", 6);
        ladybug.getAllInfo();
        ladybug.getBugPriority();
        System.out.println(ladybug.bugPriority);
    }
}
