package collections;

import java.util.*;

public class ObejctsSet {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();
        users.add(new User("Dayla", "DeMon", 18));
        users.add(new User("TamaNocnaMara", "Doe", 17));
        users.add(new User("Martantula", "Doe", 17));
        users.add(new User("Andżej", "Tęcza", 27));
        users.add(new User("Marceli", "Wisienka", 14));
        users.add(new User("Stefania", "Grabarz", 89));

        System.out.println(users.size());

        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }

        Set<User> sortedUser = new TreeSet<>(users);

        for (User user : sortedUser) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }

    }
}
