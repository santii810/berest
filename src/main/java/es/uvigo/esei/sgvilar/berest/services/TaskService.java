package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.TaskEntity;
import es.uvigo.esei.sgvilar.berest.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Set<TaskEntity> findAll() {
        return this.taskRepository.findAll();
    }


}
