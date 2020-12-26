public class User {

//    Object's fields

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

//    Methods = describes what the object can do
//    return type + method's name
    void getFullName(){
//        the body of the method
        System.out.println(firstName + " " + lastName);
    }
    void getAllInfo() {
        System.out.println(firstName + " " + lastName + ", " + email + ", " + age + ", " + isAdult);
    }
}
