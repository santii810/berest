package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.GroupEntity;
import es.uvigo.esei.sgvilar.berest.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public GroupEntity findById(int groupId) {
        return groupRepository.findById(groupId);
    }


}