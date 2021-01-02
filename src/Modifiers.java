import model.Person;

public class Modifiers {

    public static void main(String[] args) {

//        Access modifiers
//        default - works in the same package
//        public - can be accessed in the whole project
//        protected
//        private - access to the field or method only in a range of the class

        Person aniaGajecka = new Person("Anna", "Gajecka", "gajecka.anna@gmail.com", 32);

        aniaGajecka.getAllInfo();

        System.out.println(aniaGajecka.getEmail());
        aniaGajecka.setEmail("yt.annadayl@gmail.com");
        System.out.println(aniaGajecka.getEmail());

    }
}
