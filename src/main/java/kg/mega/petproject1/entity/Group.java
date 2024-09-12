package kg.mega.petproject1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Group {
    @Id
    private Long id;
    private String name;
    private String description;
}
