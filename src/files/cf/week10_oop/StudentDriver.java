package files.cf.week10_oop;

/**
 * Prints the Student-class instances' count.
 */
public class StudentDriver {

    public static void main(String[] args) {
        Student alice = new Student();

        System.out.println(Student.getStudentsCount());
    }
}
