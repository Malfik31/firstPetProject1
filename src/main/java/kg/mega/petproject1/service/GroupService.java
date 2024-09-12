package kg.mega.petproject1.service;

import kg.mega.petproject1.entity.Group;
import kg.mega.petproject1.exception.GroupNotFoundException;
import kg.mega.petproject1.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {
    private final GroupRepository groupRepository;

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group save(Group group) {
        return groupRepository.save(group);

    }

    public void delete(Group group) {
        groupRepository.delete(group);
    }

    public Group update(Group group) {
        Long id = group.getId();
        if (groupRepository.existsById(id)) {
            group.setId(id);
            return groupRepository.save(group);
        }
        throw new GroupNotFoundException("Group with id:" + id + "not found");
    }
}

