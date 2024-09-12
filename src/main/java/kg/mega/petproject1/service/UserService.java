package kg.mega.petproject1.service;

import kg.mega.petproject1.entity.Role;
import kg.mega.petproject1.entity.User;
import kg.mega.petproject1.exception.UserNotFoundException;
import kg.mega.petproject1.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  UserService implements UserDetailsService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id.toString()));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(User user) {
        Long id = user.getId();
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        throw new UserNotFoundException(id.toString());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
    public List<User> getByRole(String role) {
        return userRepository.findByRole(role);

    }
}
