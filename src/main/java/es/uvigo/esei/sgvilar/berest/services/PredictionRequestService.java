package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.PredictionRequestEntity;
import es.uvigo.esei.sgvilar.berest.repositories.PredictionRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PredictionRequestService {
    @Autowired
    private PredictionRequestRepository predictionRequestRepository;

    public Iterable<PredictionRequestEntity> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return predictionRequestRepository.findAll(pageable);
    }

    public PredictionRequestEntity save(PredictionRequestEntity predictionRequest) {
        return predictionRequestRepository.save(predictionRequest);
    }

}
