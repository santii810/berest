package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    Iterable<UserEntity> findAll();
}
