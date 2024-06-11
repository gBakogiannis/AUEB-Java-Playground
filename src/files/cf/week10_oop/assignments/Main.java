package files.cf.week10_oop.assignments;

import files.cf.week10_oop.assignments.model.User;
import files.cf.week10_oop.assignments.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User user = new User(2468, "Bakogiannis");
        UserCredentials credentials = new UserCredentials("gbakogiannis", "1357");

        System.out.println("Id: " + user.getId());
        System.out.println("Firstname: " + user.getFirstname());
        System.out.println("Lastname: " + user.getLastname());

        System.out.println("Id: " + credentials.getId());
        System.out.println("Username: " + credentials.getUsername());
        System.out.println("Password: " + credentials.getPassword());
    }
}
