package kg.mega.petproject1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "user")
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String username;
    @ManyToMany(mappedBy = "users")
    private List<Role> roles;

}
