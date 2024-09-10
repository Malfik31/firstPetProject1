package kg.mega.petproject1.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userId) {
        super("User with id: " + userId + " not found");
    }
}
