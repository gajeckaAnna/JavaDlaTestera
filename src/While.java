public class While {
    public static void main(String[] args) {

        int i = 10;

//        while (expression) {
//            statement(s)
//        }

        while (i < 20) {
            System.out.println(i);
            i++;
        }
        while (i > 20) {
            System.out.println(i);
            i++;
        }

//        do {
//            statement(s)
//        } while (expression);

        int j = 12;

        do {
            System.out.println("I'm in do!");
            System.out.println(j);
            j++;
        } while (j > 20);
    }
}
