package files.cf.week6arrays1;

public class ArrayShallowCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arrShallowCopy;

        arrShallowCopy = arr;
        arrShallowCopy[0] = 100;

        /*
         * Side effect. arrShallowCopy changes
         * its elements, but arr elements are
         * changed as well. This happens because
         * we copied the reference not the contents
         * of the source array. So, we end up with two
         * reference points to the same array.
         * So, arrShallowCopy is not a 'real' copy,
         * it is a shallow copy.
         */

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
