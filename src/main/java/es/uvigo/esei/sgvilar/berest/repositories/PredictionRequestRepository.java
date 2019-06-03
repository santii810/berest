package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.PredictionRequestEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PredictionRequestRepository extends PagingAndSortingRepository<PredictionRequestEntity, Integer> {
    Page<PredictionRequestEntity> findAll(Pageable pageable);

    PredictionRequestEntity save(PredictionRequestEntity user);
}

