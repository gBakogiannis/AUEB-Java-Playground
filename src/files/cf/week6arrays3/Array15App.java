package files.cf.week6arrays3;

public class Array15App {

    public static void main(String[] args) {
        int[][] arr = {{2, 7, 6},
                       {9, 5, 1},
                       {4, 3, 8}};

        System.out.printf("It is%s arr15%n", (isArr15(arr) ? "" : " not"));
    }

    public static boolean isArr15(int[][] arr) {
        int hCount = 0;
        int vCount = 0;
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        int[] vSum = new int[3];
        int[] hSum = new int[3];
        boolean isDiagonal1 = false;
        boolean isDiagonal2 = false;

        if (arr == null) throw new RuntimeException();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                hSum[i] += arr[i][j];
            }

            diagonal1Sum += arr[i][i];
            diagonal2Sum += arr[i][arr.length-i-1];

            vSum[0] += arr[i][0];
            vSum[1] += arr[i][1];
            vSum[2] += arr[i][2];
        }

        for (int num : hSum) {
            if (num == 15) hCount++;
        }

        for (int num : vSum) {
            if (num == 15) vCount++;
        }

        if (diagonal1Sum == 15) isDiagonal1 = true;
        if (diagonal2Sum == 15) isDiagonal2 = true;

        return (hCount == 3 && vCount == 3 && isDiagonal1 && isDiagonal2);
    }
}
