package kg.mega.petproject2.controller;
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

    @PutMapping
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

    @PostMapping
    public Role updateRole(@RequestBody Role role) {
        return roleService.save(role);
    }
}