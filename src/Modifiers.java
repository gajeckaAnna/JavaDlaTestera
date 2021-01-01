import model.Person;

public class Modifiers {

    public static void main(String[] args) {

//        Access modifiers
//        default - works in the same package
//        public - can be accessed in the whole project
//        protected -
//        private -

        Person aniaGajecka = new Person("Anna", "Gajecka", "gajecka.anna@gmail.com", 32);
        System.out.println(aniaGajecka.firstName);
        aniaGajecka.getAllInfo();

    }
}
