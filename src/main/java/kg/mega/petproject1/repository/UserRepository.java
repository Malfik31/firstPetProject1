package kg.mega.petproject1.repository;

import kg.mega.petproject1.entity.Role;
import kg.mega.petproject1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>  {
    @Query(value = "select u.* from users u " +
            "join users_roles ur on u.id = ur.user_id "+
            "join role r on r.id  = ur.roles_id " +
            "where r.name = :role ",
            nativeQuery = true)
    List<User> findByRole(String role);
}

//select ... users_roles.user_idjoin role ...