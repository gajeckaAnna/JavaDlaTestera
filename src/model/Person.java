package model;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public void getFullName() {

        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + ", " + email + ", " + age + ", " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public Person(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }
}
