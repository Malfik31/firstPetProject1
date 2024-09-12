package kg.mega.petproject1.exception;

public class GroupNotFoundException extends RuntimeException {
    public GroupNotFoundException(Long id) {
        super("Group " + id + " not found");
    }
    public GroupNotFoundException(String Name) {
        super("Group " + Name + " not found");
    }
}
