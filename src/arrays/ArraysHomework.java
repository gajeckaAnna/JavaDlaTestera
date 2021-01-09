package arrays;

public class ArraysHomework {

    public static void main(String[] args) {

        // 1. exchange first array element with the last, using 2 variables
        // A. numbers

        int[] numbers = {10, 9, 8, 7, 6};

        for (int number : numbers) {
            System.out.println(number);
        }

        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        numbers[0] = lastNumber;
        numbers[numbers.length - 1] = firstNumber;

        for (int number : numbers) {
            System.out.println(number);
        }
        // B. Names

        String[] names = {"Ania", "Marta", "Ula", "Tamara"};

        for (String name : names) {
            System.out.println(name);
        }

        String firstName = names[0];
        String lastName = names[names.length - 1];

        names[0] = lastName;
        names[names.length - 1] = firstName;

        for (String name : names) {
            System.out.println(name);
        }

        // 2. exchange first array element with the last, using one variables

        char aces[] = {'a', 's', 'e', 'x', 'u', 'l', 's'};
        for (char ace : aces) {
            System.out.println(ace);
        }
        char a = aces[0];
        aces[0] = aces[aces.length -1];
        aces[aces.length - 1] = a;

        for (char ace : aces) {
            System.out.println(ace);
        }
    }
}
