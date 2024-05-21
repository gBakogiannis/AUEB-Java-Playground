package files.cf.week7;

public class ReplaceDeleteApp {

    public static void main(String[] args) {
        String firstname = "Maria-Hellen";
        String simpleName;
        String nickname;
        String oneName;

        // Replaces dash with whitespace
        simpleName = firstname.replace("-", " ");
        System.out.println(simpleName);

        // Replaces with empty string (string with length() == 0)
        // Thus essentially deletes
        nickname = firstname.replace("-", "");
        System.out.println(nickname);

        // Replaces with empty string - Deletes
        oneName = firstname.replace("-Hellen", "");
        System.out.println(oneName);
    }
}
