public class User {

    private static int userCounter = 0; // static fields & methods belong to class, not an object!
//    Object's fields

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // Constructor
    // name is the same as class' name
    // it starts with a capital letter
    // doesn't have the return type
    // if we didn't create the constructor in the class, there will always be a default, creating an empty object

    User(String firstName, String lastName, String email, int age){
        // this.object's field = parameter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

//    Methods = describes what the object can do
//    return type + method's name
    void getFullName(){
//        the body of the method
        System.out.println(firstName + " " + lastName);
    }
    void getAllInfo() {
        System.out.println(firstName + " " + lastName + ", " + email + ", " + age + ", " + isAdult);
    }
    int getUserAge(){
        return age;
    }
    boolean isUserAdult(){
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    void greetings(String name){
        System.out.println("Hi " + name + ". Nice to see you!");
    }
    //    method overloading - name can be the same, as long as the number and/or type of parameters are different
    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }
    void howOldAreYou(String name, int userAge){
        System.out.println("Hi " + name + ". You are " + userAge + " years old.");
    }
    int yourAgePlus10(int userAge){
        return userAge + 10;
    }

    public static int getUserCounter() {
        return userCounter;
    }

}
