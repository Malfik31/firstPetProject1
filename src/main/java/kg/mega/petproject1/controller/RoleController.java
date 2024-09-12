package kg.mega.petproject1.controller;
import kg.mega.petproject1.service.RoleService;
import kg.mega.petproject1.entity.Role;
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
        return roleService.findAll();
    }

    @PostMapping
    public Role addRole(@RequestBody Role role) {
        return roleService.save(role);
    }

    @DeleteMapping
    public Role deleteRole(@RequestBody Role role) {
        roleService.delete(role);
        return role;
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable int id) {
        return roleService.getById(id);
    }
    
    @PutMapping
    public Role updateRole(@RequestBody Role role) {
        return roleService.save(role);
    }

}
