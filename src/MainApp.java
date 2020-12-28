public class MainApp {

    public static void main(String[] args) {

        // type of object [name of the class] + name == new object
        User ania = new User(); // constructor
        ania.firstName = "Ania";
        ania.lastName = "Gajecka";
        ania.email = "gajecka.anna@gmail.com";
        ania.age = 32;
        ania.isAdult = true;
        System.out.println(ania.firstName + " " + ania.lastName);
        ania.getFullName();
        ania.getAllInfo();
        System.out.println(ania.getUserAge());
//        or
//        alt + enter -> menu -> introduce local variable ->
        int userAge = ania.getUserAge();
        System.out.println(userAge);
        boolean userAdult = ania.isUserAdult();
        System.out.println(userAdult);
        ania.greetings("Ania");
        ania.howOldAreYou("Ania", 32);
        int aniaAgePlus10 = ania.yourAgePlus10(32);
        System.out.println(aniaAgePlus10);
        ania.greetings("Ania");
        ania.greetings(ania.firstName, ania.lastName);


        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Brown";
        bartek.email = "bartek@brown.pl";
        bartek.age = 30;
        bartek.isAdult = true;
        System.out.println(bartek.firstName);
        System.out.println(bartek.firstName + " " + bartek.lastName);
        bartek.getFullName();
        bartek.getAllInfo();
        System.out.println(bartek.yourAgePlus10(bartek.age));
    }
}
