package arrays;

public class ArraysChange {
    public static void main(String[] args) {

//        exchange first array object with the last
        int[] numbers = {1, 2, 3, 4, 5};

        // two extra variables
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        numbers[0] = last;
        numbers[numbers.length - 1] = first;

        for (int number : numbers) {
            System.out.println(number);
        }

//        one extra variable
        int[] moreNumbers = {3, 5, 7, 9, 11, 13};
        int f = moreNumbers[0];
        moreNumbers[0] = moreNumbers[moreNumbers.length - 1];
        moreNumbers[moreNumbers.length - 1] = f;
        for (int i : moreNumbers) {
            System.out.println(i);
        }


    }
}
