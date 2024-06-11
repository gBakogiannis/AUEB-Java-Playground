package files.cf.week10_oop;

public class Scoping {

    public static void main(String[] args) {
        int result;
        int num1 = 1;
        int num2 = 2;

        result = add(num1, num2);

        switch (result) {
            case 1:
                int i = 0;
        }
        System.out.println(result);
    }

    public static int add(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static int div(int a, int b) {
        int result = 0;

        if (b == 0) {
            boolean isZero = true;
            System.out.println("is zero: " + isZero);
            return result;
        }

        return a / b;
    }
}
