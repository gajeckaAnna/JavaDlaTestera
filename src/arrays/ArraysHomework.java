package arrays;

public class ArraysHomework {

    public static void main(String[] args) {

        // 1. exchange first array element with the last, using 2 variables

        String[] names = {"Ania", "Marta", "Ula", "Tamara"};

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("~~~~~~~~");
        String firstName = names[0];
        String lastName = names[names.length - 1];

        names[0] = lastName;
        names[names.length - 1] = firstName;

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("~~~~~~~~");

        // 2. exchange first array element with the last, using one variables

        char aces[] = {'a', 's', 'x', 'e', 'u', 'l', 's'};
        for (char ace : aces) {
            System.out.println(ace);
        }
        System.out.println("~~~~~~~~");
        char a = aces[0];
        aces[0] = aces[aces.length -1];
        aces[aces.length - 1] = a;

        for (char ace : aces) {
            System.out.println(ace);
        }
        System.out.println("~~~~~~~~");
        // 3. exchange first array element with the last, no extra variables
        int evenNumbers[] = {2, 4, 6, 8, 10};
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        System.out.println("~~~~~~~~");
        evenNumbers[evenNumbers.length - 1] = evenNumbers[evenNumbers.length - 1] + evenNumbers[0];
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        System.out.println("~~~~~~~~");
        evenNumbers[0] = evenNumbers[evenNumbers.length - 1] - evenNumbers[0];
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        System.out.println("~~~~~~~~");
        evenNumbers[evenNumbers.length - 1] = evenNumbers[evenNumbers.length - 1] - evenNumbers[0];
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        System.out.println("~~~~~~~~");

        // 4. Even & odd numbers
        int randomNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int even = 0;
        int odd = 0;
        for (int randomNumber : randomNumbers) {
            if (randomNumber % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Amount of even numbers: " + even + ". Amount of odd numbers: " + odd);

        // 5. Ascending sorting
        int miscNumbers[] = {8, 5, 3, 4, 1, 6, 2, 9, 0, 7};
        int min;

        for (int i = 0; i < miscNumbers.length; i++) {
            min = miscNumbers[i];
            for (int j = i + 1; j < miscNumbers.length; j++) {
                if (miscNumbers[j] < min) {
                    min = miscNumbers[j];
                    miscNumbers[j] = miscNumbers[i];
                    miscNumbers[i] = min;
                }
            }
        }
        for (int miscNumber : miscNumbers) {
            System.out.println(miscNumber);
        }
        System.out.println("~~~~~~~~");

        //6. Descending sorting
        int max;
        for (int i = 0; i < miscNumbers.length; i++) {
            max = miscNumbers[i];
            for (int j = i + 1; j < miscNumbers.length; j++) {
                if (miscNumbers[j] > max) {
                    max = miscNumbers[j];
                    miscNumbers[j] = miscNumbers[i];
                    miscNumbers[i] = max;
                }
            }
        }
        for (int miscNumber : miscNumbers) {
            System.out.println(miscNumber);
        }
        System.out.println("~~~~~~~~");
    }
}
