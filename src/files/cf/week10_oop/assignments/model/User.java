package files.cf.week10_oop.assignments.model;

public class User {
    private long id;
    private String firstname;
    private String lastname;

    // Default Constructor
    public User() {
    }

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Overloaded Constructor
    public User(long id, String lastname) {
        this.id = id;
        this.lastname = lastname;
    }

    // Overloaded Constructor
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
