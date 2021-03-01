package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectsList {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Dayla", "DeMon", 18));
        users.add(new User("TamaNocnaMara", "Doe", 17));
        users.add(new User("Martantula", "Doe", 17));
        users.add(new User("Andżej", "Tęcza", 27));
        users.add(new User("Marceli", "Wisienka", 14));
        users.add(new User("Stefania", "Grabarz", 89));

        for (User user : users) {
            System.out.println(user.getFirstName());
        }

        //Comparator - interface; comparing - static method; User::getFirstName - method's reference
        Collections.sort(users, Comparator.comparing(User::getFirstName));
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        for (User user : users) {
            System.out.println(user.getFirstName() + ", " + user.getAge() + "(l.)");
        }

    }
}
