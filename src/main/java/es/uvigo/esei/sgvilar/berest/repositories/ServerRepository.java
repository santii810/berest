package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import org.springframework.data.repository.CrudRepository;

public interface ServerRepository extends CrudRepository<ServerEntity, Integer> {
    Iterable<ServerEntity> findAll();
}
