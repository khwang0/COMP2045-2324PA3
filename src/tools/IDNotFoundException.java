package tools;

/**
 * This class has been written for you.
 * 
 * When an ID cannot be found in the UserManagementBot, it throws this exception
 */
public class IDNotFoundException extends Exception {
    public IDNotFoundException(String message) {
        super(message);
    }
}
