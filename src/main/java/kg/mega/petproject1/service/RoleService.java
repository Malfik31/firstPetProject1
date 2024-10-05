package kg.mega.petproject1.service;

import jakarta.persistence.EntityNotFoundException;
import kg.mega.petproject1.entity.Role;
import kg.mega.petproject1.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    public void save(Role role) {
        roleRepository.save(role);
    }

    public void deleteById(Integer id) {
        roleRepository.deleteById(id);
    }

    public Role getById(Integer id) {
        Optional<Role> role = roleRepository.findById(id);
        if (role.isPresent()) {
            return role.get();
        }
        throw new EntityNotFoundException("Role with id: " + id + " not found");
    }
}



