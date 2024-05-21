package files.cf.week6arrays3;

public class BitwiseOperatorsApp {

    public static void main(String[] args) {

        System.out.println(XOR(true, true));
        System.out.println(XOR(true, false));
        System.out.println(XOR(false, true));
        System.out.println(XOR(false, false));

        int[] vector = {1, 0, 1};
        int[] vectorOut = complimentByOne(vector);
        for (int element : vectorOut) {
            System.out.print(element + " ");
        }

    }

    /**
     * Implements the logical XOR between two booleans.
     *
     * @param b1        the first boolean
     * @param b2        the second boolean
     * @return          the logical XOR output
     */
    public static boolean XOR(boolean b1, boolean b2) {
        return (b1 && !b2) || (!b1 && b2);
    }

    public static int[] complimentByOne(int[] vector) {
        int[] binOut;

        if (vector == null) throw new IllegalArgumentException();

        binOut = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            binOut[i] = (vector[i] == 0) ? 1: 0;
        }

        return binOut;
    }
}
