package files.cf.week6arrays1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Αρχικοποιεί τον πίνακα διαβάζοντας από ένα αρχείο.
 *
 * @author A. Androutsos
 */
public class PopulateArrayByFile {

    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];
        File intFile = new File("C:/Users/George/IdeaProjects/MyPlayground11/src/files/cf/week6arrays1/MyIntFile.txt");
        Scanner sc = new Scanner(intFile);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        for (int age : ages) {
            System.out.print(age + " ");
        }

        sc.close();
    }
}
