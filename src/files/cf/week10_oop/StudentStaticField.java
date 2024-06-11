package files.cf.week10_oop;

public class StudentStaticField {
    private static int studentsCount;
    private String firstname;
    private String lastname;

    static {
        studentsCount = 0;
    }

    public StudentStaticField() {}
}
