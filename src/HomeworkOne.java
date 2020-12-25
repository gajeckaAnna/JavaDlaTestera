public class HomeworkOne {
    public static void main(String[] args) {
//      1. 4 int variables
//      2. Check if the sum of two first ints is even or odd
//      3. Check if the sum of third and four ints is even or odd
//      4. Check if both sums are even or odd

        int numOne = 34;
        int numTwo = 3;
        int numThree = 42;
        int numFour = 16;

        if ((numOne + numTwo) % 2 == 0)
            System.out.println("The sum of " + numOne + " and " + numTwo + " is even." );
        else
            System.out.println("The sum of " + numOne + " and " + numTwo + " is odd." );


        if ((numThree + numFour) % 2 == 0)
            System.out.println("The sum of " + numThree + " and " + numFour + " is even.");
        else
            System.out.println("The sum of " + numThree + " and " + numFour + " is odd.");

        if ((numOne + numTwo) % 2 == 0 && (numThree + numFour) % 2 == 0)
            System.out.println("Both sums are even.");
        else
            System.out.println("Both sums are odd.");
        }
}
