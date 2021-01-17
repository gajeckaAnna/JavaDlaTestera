package utils;

public class UtilsApp {

    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();

        String momSaid = stringUtils.getFormattedText("I told you so!");
        System.out.println(momSaid);

        String ania = stringUtils.getFormattedText("Ania");
        System.out.println(ania);

    }
}
