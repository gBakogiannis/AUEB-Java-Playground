package files.cf.week7;

/**
 * String.equals() just checks for equality
 * or inequality. Not less or greater than.
 */
public class EqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "London";
        String s4 = "ATHENS";

        boolean isEqual;

        isEqual = s1.equals(s2);
        System.out.printf("%s equals %s. -%b%n", s1, s2, isEqual);
        isEqual = s1.equals(s3);
        System.out.printf("%s equals %s. -%b%n", s1, s3, isEqual);
        isEqual = s1.equalsIgnoreCase(s4);
        System.out.printf("%s equals %s. -%b%n", s1, s4, isEqual);
    }
}
