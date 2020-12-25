public class Modulo {
    public static void main(String[] args) {
        // % - modulo - reszta z dzielenia
        System.out.println(10 % 5); // 10 / 5 = 2, nie ma reszty z dzielenia, więc modulo = 0
        System.out.println(10 % 3);
        System.out.println(10 % 4);

        if(9 % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
