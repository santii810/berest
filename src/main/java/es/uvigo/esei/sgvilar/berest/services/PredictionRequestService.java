package es.uvigo.esei.sgvilar.berest.services;


import es.uvigo.esei.sgvilar.berest.entities.PredictionRequestEntity;
import es.uvigo.esei.sgvilar.berest.repositories.PredictionRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PredictionRequestService {
    @Autowired
    private PredictionRequestRepository predictionRequestRepository;

    public Page<PredictionRequestEntity> findAll(Pageable pageable) {
        return predictionRequestRepository.findAll(pageable);
    }

    public PredictionRequestEntity save(PredictionRequestEntity predictionRequest) {
        return predictionRequestRepository.save(predictionRequest);
    }

}
