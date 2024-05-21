package files.cf.week4.part2;

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);

        System.out.println("Sum = " + sum);
    }

    public static int add(int a, int b) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int sum = 0;

        // Εντολές
        sum = a + b;

        // Επιστροφή αποτελέσματος
        return sum;
    }
}
