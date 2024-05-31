package files.cf.week9;

import java.io.*;

public class BufferedReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\George\\IdeaProjects\\" +
                "MyPlayground11\\src\\files\\cf\\week9\\f-reader.txt"))) {
            String line = "";

            while ((line = bf.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(sb);
    }
}
