package kg.mega.petproject1.exception;

public class RoleNotFoundException extends RuntimeException {
    public RoleNotFoundException(Long id) {
        super("role with id:" + id + "not found in database");
    }

    public RoleNotFoundException(String name) {
        super("role with name:" + name + "not found in database");
    }
}
