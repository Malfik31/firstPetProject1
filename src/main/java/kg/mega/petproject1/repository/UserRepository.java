package kg.mega.petproject1.repository;

import kg.mega.petproject1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>  {
}
