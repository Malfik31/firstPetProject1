package kg.mega.petproject1.repository;

import kg.mega.petproject1.entity.Role;
import kg.mega.petproject1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUserByRolesContaining(Role role);
}
