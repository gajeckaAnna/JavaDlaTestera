public class MathOperations {

    public static void main(String[] args) {
        // operatory matematyczne
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        System.out.println(a / b); // = 2
        System.out.println(10.0 / 4.0); // = 2.5

        //Comparison Operators
        //operatory porównania
        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        //operatory logiczne
        // || <- OR
        System.out.println(numOne > numTwo || numOne == 1); // false || true -> true
        System.out.println(numOne > numTwo || numOne != 1); // false || false -> false
        System.out.println(numOne < numTwo || numOne != 1); // true || not checked -> true

        //&& <- AND
        System.out.println(numOne < numTwo && numOne == 1); // true && true -> true
        System.out.println(numOne > numTwo && numOne == 1); // false && true -> false
        System.out.println(numOne > numTwo && numOne != 1); // false && false -> false
    }
}
