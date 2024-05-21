package files.cf.week4.part2;

import java.sql.SQLOutput;

/**
 * Παραστάσεις floating point.
 */
public class FloatingExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.1F;
        double doubleNum1 = 12.5D;
        double doubleNum2 = 2D;

        float floatResult = 0.0F;
        double doubleResult = 0.0;

        // Αν υπάρχει float οι μικρότερου μεγέθους τύποι
        // μετατρέπονται σε float.
        floatResult = floatNum + intNum;

        // Αν υπάρχει έστω και ένας double,
        // τα intNum και floatNum μετατρέπονται σε double
        doubleResult = doubleNum1 + floatNum * intNum;

        System.out.printf("floatResult = %f%n", floatResult);
        System.out.printf("doubleResult = %f", doubleResult);
    }
}
