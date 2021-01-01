public class Strings {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

//      1. equals - compare two objects, if they are exactly the same
        System.out.println(str1.equals(str2));

//      2. equalsIgnoreCase - compare two objects if they are similar
        System.out.println(str1.equalsIgnoreCase(str2));

//      3. toUpperCase - change string to upper case letters
        String s = str1.toUpperCase();
        System.out.println(s);

//      4. toLowerCase - change string to lower case letters
        String l = str1.toLowerCase();
        System.out.println(l);

//      5. startsWith - checks if string starts with given letters
        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

//      6. endsWith - checks if string ends with given letters
        boolean endsWith = str1.endsWith("lo");
        System.out.println(endsWith);

//      7. contains - checks if string contains some given text
        System.out.println(str1.contains("ello"));

//      8. isBlank - checks the length of the string (ignores white spaces)
        System.out.println("       ".isBlank());

//      9. isEmpty - checks if the string is empty (doesn't ignore spaces)
        System.out.println(" ".isEmpty());

//      10. replace
        System.out.println(str1.replace("llo", "QWE"));

//      11. replaceAll - replace given letter in a string to a different given
        System.out.println(str1.replaceAll("l", "x"));

//      12. substring - a subset of another string. In case of substring startIndex is inclusive and endIndex is exclusive
        System.out.println(str1.substring(1,4));

//      13. length - count of total number of characters
        String whiteSpaces = "    white spaces    ";
        System.out.println(whiteSpaces.length());

//      14. strip - strips string of white spaces
        String strip = whiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
