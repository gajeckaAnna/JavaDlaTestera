public class MainApp {

    public static void main(String[] args) {

        // type of object [name of the class] + name == new object
        User ania = new User("Ania", "Gajecka", "gajecka.anna@gmail.com", 32); // constructor

        ania.getAllInfo();


//        alt + enter -> menu -> introduce local variable ->

//        int userAge = ania.getUserAge();
//        System.out.println(userAge);
//        boolean userAdult = ania.isUserAdult();
//        System.out.println(userAdult);
//        ania.greetings("Ania");
//        ania.howOldAreYou("Ania", 32);
//        int aniaAgePlus10 = ania.yourAgePlus10(32);
//        System.out.println(aniaAgePlus10);
//        ania.greetings("Ania");
//        ania.greetings(ania.firstName, ania.lastName);

        User bartek = new User("Bartek", "Brown", "bartek@brown.pl", 17);
        bartek.getAllInfo();
    }
}
