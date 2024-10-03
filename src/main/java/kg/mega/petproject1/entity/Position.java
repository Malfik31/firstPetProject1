package kg.mega.petproject1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="positions")
public class Position {
    @Id
    Long id;
    String name;

    @ManyToMany(mappedBy = "positions")
    @JsonBackReference
    List<User> users;


}
