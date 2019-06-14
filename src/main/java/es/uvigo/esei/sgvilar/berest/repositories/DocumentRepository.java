package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.DocumentEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<DocumentEntity, Integer> {

    DocumentEntity save(DocumentEntity document);

    boolean existsByExternalId(String externalId);

    DocumentEntity findByExternalId(String externalId);
}