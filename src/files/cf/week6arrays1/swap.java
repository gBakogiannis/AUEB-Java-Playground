package files.cf.week6arrays1;

public class swap {

    public static void main(String[] args) {
        int[] ages = {21, 18};

        swap(ages);
        printArray(ages);
        System.out.println();
        swapInterviewVersion(ages);
        printArray(ages);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void swapInterviewVersion(int[] arr) {
        if (arr.length != 2) return;

        arr[0] += arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] -= arr[1];
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
