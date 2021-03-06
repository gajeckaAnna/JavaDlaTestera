public class Arrays {
    public static void main(String[] args) {

//       [] Arrays - a collection od data of the SAME type
//        Always establish the size of the array at the beginning
//        int[] numbers = new int[10] <- array of ints with 10 rows

        String[] names = new String[5];
//         values: ["Ania", "Tamara", "Marta", "Ula", "Ola"]
//         index:   [0,       1,        2,      3   ,   4]
        System.out.println(names); // [Ljava.lang.String;@1e643faf - object reference
        System.out.println(names[0]); // null

        String[] testTeam = new String[7];
        System.out.println("Array has " + names.length + " string fields.");
        testTeam[0] = "Ania";
        testTeam[1] = "Ingrid";
        testTeam[2] = "Dave";
        testTeam[3] = "Vincent";
        testTeam[4] = "Bart";
        testTeam[5] = "Raf";
        testTeam[6] = "Fabienne";

        String[] devTeam = {"Arno", "Alexander", "Joeri", "Wim", "Simon", "Justin", "Frans"};


////        System.out.println(testTeam[0]);
////        System.out.println(testTeam[1]);
////        System.out.println(testTeam[2]);
////        System.out.println(testTeam[3]);
////        System.out.println(testTeam[4]);
////        System.out.println(testTeam[5]);
////        System.out.println(testTeam[6]);
//
//        System.out.println(testTeam[7]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//        // Index 6 out of bounds for length 6 at Arrays.main(Arrays.java:22)

        // for(counter; condition; changing of the counter)

        for (int i = 0; i < devTeam.length; i++) {
            System.out.println(devTeam[i]);
        }

        for (int i = 0; i < testTeam.length; i++) {
            if (i % 2 ==0) {
                System.out.println(testTeam[i]);
            }
        }

        for (String name: testTeam) {
            System.out.println(name);
        }

        int number = 10;
        System.out.println(number);
        number = number + 1;
        System.out.println(number);

        number += 1;
        System.out.println(number);

        System.out.println(number++); // post-increment, works the NEXT time
        System.out.println(number);

        System.out.println(++number); // pre-increment

//        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    }
}
