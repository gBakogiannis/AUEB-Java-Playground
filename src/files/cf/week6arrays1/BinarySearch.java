package files.cf.week6arrays1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9};
        int low = 0;
        int high = arr.length - 1;
        int position = -1;

        position = binarySearch(arr, 7, low, high);

        if (position == -1) {
            System.out.println("Value was not found");
        } else {
            System.out.println("Value was found in position " + (position + 1));
        }
    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        int mid = 0;

        if (arr == null) return -1;
        if ((low < 0) || (high > arr.length - 1)) return -1;
        if (high < low) return -1;

        mid = (low + high) / 2;

        if (value == arr[mid]) {
            return mid;
        } else if (value < arr[mid]) {
            return binarySearch(arr, value, low, mid - 1);
        } else {
            return binarySearch(arr, value, mid + 1, high);
        }
    }
}