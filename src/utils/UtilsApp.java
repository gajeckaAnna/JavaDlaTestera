package utils;

public class UtilsApp {

    public static void main(String[] args) {

       // StringUtils stringUtils = new StringUtils();

        String momSaid = StringUtils.getFormattedText("I told you so!");
        System.out.println(momSaid);

        String ania = StringUtils.getFormattedText("Ania");
        System.out.println(ania);

        System.out.println(WeekUtils.MONDAY);

        // WeekUtils.MONDAY = "Sunday"; //Cannot assign a value to a final variable

    }
}
