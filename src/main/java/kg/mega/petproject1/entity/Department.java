package kg.mega.petproject1.entity;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department {
    @Id
    private Long id;
    private String name;
    private String description;
    private String email;
    @ManyToOne
    @JoinColumn(name="head_user_id")
    private User headUser;

    @ManyToOne
    @JoinColumn(name="head_department_id")
    private Department headDepartment;
}
