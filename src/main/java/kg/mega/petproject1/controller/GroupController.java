package kg.mega.petproject1.controller;

import kg.mega.petproject1.entity.Group;
import kg.mega.petproject1.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/group")
public class GroupController {
    private final GroupService groupService;

    @GetMapping
    public List<Group> getAllGroups() {
        return groupService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Group> createGroup(@RequestBody Group group) {
        groupService.create(group);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Group> updateGroup(@RequestBody Group group) {
        groupService.update(group);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public Group deleteById(@PathVariable Long id) {
        groupService.deleteById(id);
        return groupService.findById(id);
    }

    @GetMapping("/{id}")
    public Group getGroupById(@PathVariable Long id) {
        return groupService.findById(id);
    }
}
