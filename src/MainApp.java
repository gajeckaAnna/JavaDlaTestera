public class MainApp {

    public static void main(String[] args) {

        // type of object [name of the class] + name == new object
        User ania = new User();
        ania.firstName = "Ania";
        ania.lastName = "Gajecka";
        ania.email = "gajecka.anna@gmail.com";
        ania.age = 32;
        ania.isAdult = true;
        System.out.println(ania.firstName + " " + ania.lastName);
        ania.getFullName();
        ania.getAllInfo();


        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Brown";
        bartek.email = "bartek@brown.pl";
        bartek.age = 30;
        bartek.isAdult = true;
        System.out.println(bartek.firstName);
        System.out.println(bartek.firstName + " " + bartek.lastName);
    }
}
