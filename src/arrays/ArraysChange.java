package arrays;

public class ArraysChange {
    public static void main(String[] args) {

        //exchange first array object with the last
        int[] numbers = {1, 2, 3, 4, 5};

        // two extra variables
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        numbers[0] = last;
        numbers[numbers.length - 1] = first;

        for (int number : numbers) {
            System.out.println(number);
        }

        //one extra variable
        int[] moreNumbers = {3, 5, 7, 9, 11, 13};
        int f = moreNumbers[0];
        moreNumbers[0] = moreNumbers[moreNumbers.length - 1];
        moreNumbers[moreNumbers.length - 1] = f;
        for (int i : moreNumbers) {
            System.out.println(i);
        }

        //no extra variables
        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
        for (int number : numbers) {
            System.out.println(number);
        }
        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        for (int number : numbers) {
            System.out.println(number);
        }

        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
        for (int number : numbers) {
            System.out.println(number);
        }

//      How many even and odd numbers are in array?

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Amount of even numbers: " + even + ". Amount of odd numbers: " + odd);

//      Sort the numbers
        int[] mixedNumbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        int min;

        for (int i = 0; i < mixedNumbers.length; i++) {
            min = mixedNumbers[i];
            for (int j = i + 1; j < mixedNumbers.length; j++) {
                if (mixedNumbers[j] < min) {
                    min = mixedNumbers[j];
                    mixedNumbers[j] = mixedNumbers[i];
                    mixedNumbers[i] = min;
                }
            }
        }
        for (int mixedNumber : mixedNumbers) {
            System.out.println(mixedNumber);
        }
    }
}
