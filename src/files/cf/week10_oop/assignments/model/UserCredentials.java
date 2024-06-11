package files.cf.week10_oop.assignments.model;

public class UserCredentials {
    private long id;
    private String username;
    private String password;

    public UserCredentials() {
    }

    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Overloaded Constructor
    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Overloaded Constructor;
    public UserCredentials(long id, String password) {
        this.id = id;
        this.password = password;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
