public class Boxing {

    public static void main(String[] args) {

        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean bl;

        int number = 10;

        // autoboxing
        Integer intNumber = new Integer(10);
        Integer intCipher = Integer.valueOf(10);

        //unboxing
        int newNumber = intNumber.intValue();
    }
}
