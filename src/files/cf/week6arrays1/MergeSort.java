package files.cf.week6arrays1;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 6, 3, 4, 12, 56, 34, 23, 11};

        int[] merged = mergeSort(arr, 0, arr.length - 1);

        for (int element : merged) {
            System.out.print(element + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int s, int n) {
        // if arr.length <= 1 return arr
        if (n - s <= 0) {
            return new int[] { arr[n] };
        }

        // Choose a pivot -> middle - easy split
        int middle = (n + s) / 2;

        int[] left = mergeSort(arr, s, middle);
        int[] right = mergeSort(arr, middle + 1, n);

        return merge (left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < left.length) && (j < right.length)) {
            if (left[i] > right[j]) {
                merged[k++] = right[j++];
            } else {
                merged[k++] = left[i++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }
}
