package files.cf.week7;

import java.util.Arrays;

public class PrintArraysAndHashCodes {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        float[] arr3 = {1, 2, 3};
        int hashCode = Arrays.hashCode(arr);
        int hashCode2 = Arrays.hashCode(arr2);
        float hashCode3 = Arrays.hashCode(arr3);

        System.out.println(arr);
        System.out.println(hashCode);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
    }
}
