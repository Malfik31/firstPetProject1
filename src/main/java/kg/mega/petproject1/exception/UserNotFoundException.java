package kg.mega.petproject1.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String userId) {
        super("User with id: " + userId+" not found");
    }
}
