package kg.mega.petproject1.service;

import kg.mega.petproject1.entity.Role;
import kg.mega.petproject1.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class RoleService {
    private final RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public void delete(Role role) {
        roleRepository.delete(role);
    }

    public Role getById(int id) {
        Optional<Role> role = roleRepository.findById((long) id);
        if (role.isPresent()) {
            return role.get();
        } else throw new RuntimeException("Role not found");
    }
    //исправление
}