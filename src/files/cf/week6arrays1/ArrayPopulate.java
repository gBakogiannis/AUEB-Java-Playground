package files.cf.week6arrays1;

public class ArrayPopulate {

    public static void main(String[] args) {

        // Array declaration and init
        int[] ages = new int[5];

        // Populate array
        ages[0] = 20;
        ages[1] = 40;
        ages[2] = 27;
        ages[3] = 17;
        ages[4] = 22;

        // Print the array elements
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
