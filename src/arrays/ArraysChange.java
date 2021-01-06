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

    }
}
