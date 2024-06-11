package files.cf.week10_oop;

/**
 * Student static fields vs instance fields.
 */
public class Student {
    private static int studentsCount = 0;
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
}
