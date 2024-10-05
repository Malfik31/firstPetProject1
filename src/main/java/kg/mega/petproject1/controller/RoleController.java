package kg.mega.petproject1.controller;

import kg.mega.petproject1.entity.Role;
import kg.mega.petproject1.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getRoles() {
        return roleService.getAll();
    }

    @PutMapping
    public ResponseEntity<?> addRole(@RequestBody Role role) {
        roleService.save(role);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Integer roleId) {
        roleService.deleteById(roleId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable int id) {
        return roleService.getById(id);
    }

    @PostMapping
    public ResponseEntity<?> updateRole(@RequestBody Role role) {
        roleService.save(role);
        return ResponseEntity.ok().build();
    }
}