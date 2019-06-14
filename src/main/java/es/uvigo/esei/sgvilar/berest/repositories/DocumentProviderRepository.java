package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.DocumentProviderEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocumentProviderRepository extends CrudRepository<DocumentProviderEntity, Integer> {
    DocumentProviderEntity getByName(String name);

}