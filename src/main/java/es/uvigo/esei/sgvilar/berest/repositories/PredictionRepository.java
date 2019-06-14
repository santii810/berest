package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.PredictionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PredictionRepository extends PagingAndSortingRepository<PredictionEntity, Integer> {
    Page<PredictionEntity> findAll(Pageable pageable);

}