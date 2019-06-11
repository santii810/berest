package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.PredictionEntity;
import org.springframework.data.repository.CrudRepository;


public interface PredictionRepository extends CrudRepository<PredictionEntity, Integer> {
    Iterable<PredictionEntity> findAll();

}