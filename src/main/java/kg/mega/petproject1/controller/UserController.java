package kg.mega.petproject1.controller;

import kg.mega.petproject1.entity.User;
import kg.mega.petproject1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public void getById(@PathVariable Integer id) {
        userService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody User user) {
        userService.create(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.deleteById(id);
    }

    @GetMapping("/role/{roleId}")
    public List<User> getUserByRoleId(@PathVariable("roleId") Integer roleId) {
        return userService.findUserByRoleId(roleId);

    }
}