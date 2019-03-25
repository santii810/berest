package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.TaskEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TaskRepository extends CrudRepository<TaskEntity, Integer> {
    Set<TaskEntity> findAll();
}
