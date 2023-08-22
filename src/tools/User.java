package tools;

/**
 * This class is to store user information. A user has the following attributes (String):
 * - an ID (Discord id), 
 * - a username (Discord username),
 * - a student ID (student number),
 * - a student name (student name),
 * - a registration code (a code that is used to register the user).
 * 
 * This class should have suitable constructor and setter/getter methods.
 */
public class User {
    private String id;
    private String username;
    private String studentID;
    private String studentName;
    private String registrationCode;

    public User() {}
    public User(String studentID, String registrationCode) {
        this.studentID = studentID;
        this.registrationCode = registrationCode;
    }
    public String getID() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getStudentID() {
        return studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getRegistrationCode() {
        return registrationCode;
    }
    public void setID(String id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
