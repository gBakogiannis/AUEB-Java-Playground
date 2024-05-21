package files.cf.week7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstname = "Athanassios";
        String lastname = "Androutsos";
        String title = "Dr.";
        String fullName1, fullName2, fullName3, fullName4;

        // + operator is overloaded in Java.
        // When applied to strings is considered concat.
        fullName1 = firstname + lastname;
        fullName2 = title + firstname + lastname;

        fullName3 = firstname.concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);       // method chain

        System.out.printf("Firstname: %s, Lastname: %s%n", firstname, lastname);
        System.out.printf("Full name 1: %s%n", fullName1);
        System.out.printf("Full name 2: %s%n", fullName2);
        System.out.printf("Full name 3: %s%n", fullName3);
        System.out.printf("Full name 4: %s%n", fullName4);
    }
}
