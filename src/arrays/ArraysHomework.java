package arrays;

public class ArraysHomework {

    public static void main(String[] args) {

//        // 1. exchange first array element with the last, using 2 variables
//        // A. numbers
//
//        int[] numbers = {10, 9, 8, 7, 6};
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        int firstNumber = numbers[0];
//        int lastNumber = numbers[numbers.length - 1];
//
//        numbers[0] = lastNumber;
//        numbers[numbers.length - 1] = firstNumber;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//        // B. Names
//
//        String[] names = {"Ania", "Marta", "Ula", "Tamara"};
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        String firstName = names[0];
//        String lastName = names[names.length - 1];
//
//        names[0] = lastName;
//        names[names.length - 1] = firstName;
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        // 2. exchange first array element with the last, using one variables
//
//        char aces[] = {'a', 's', 'e', 'x', 'u', 'l', 's'};
//        for (char ace : aces) {
//            System.out.println(ace);
//        }
//        char a = aces[0];
//        aces[0] = aces[aces.length -1];
//        aces[aces.length - 1] = a;
//
//        for (char ace : aces) {
//            System.out.println(ace);
//        }
//        // 3. exchange first array element with the last, no extra variables
//        int evenNumbers[] = {2, 4, 6, 8, 10};
//        for (int evenNumber : evenNumbers) {
//            System.out.println(evenNumber);
//        }
//        evenNumbers[evenNumbers.length - 1] = evenNumbers[evenNumbers.length - 1] + evenNumbers[0];
//        for (int evenNumber : evenNumbers) {
//            System.out.println(evenNumber);
//        }
//        evenNumbers[0] = evenNumbers[evenNumbers.length - 1] - evenNumbers[0];
//        for (int evenNumber : evenNumbers) {
//            System.out.println(evenNumber);
//        }
//        evenNumbers[evenNumbers.length - 1] = evenNumbers[evenNumbers.length - 1] - evenNumbers[0];
//        for (int evenNumber : evenNumbers) {
//            System.out.println(evenNumber);
//        }
//
//        // 4. Even & odd numbers
//        int randomNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        int even = 0;
//        int odd = 0;
//        for (int randomNumber : randomNumbers) {
//            if (randomNumber % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//        System.out.println("Amount of even numbers: " + even + ". Amount of odd numbers: " + odd);

        // 5. Ascending sorting
        int miscNumbers[] = {99, 2, 35, 13, 13, 76};
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
    }
}
