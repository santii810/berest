package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.PredictionEntity;
import es.uvigo.esei.sgvilar.berest.repositories.PredictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {
    @Autowired
    private PredictionRepository predictionRepository;

    public Page<PredictionEntity> findAll(Pageable pageable) {
        return predictionRepository.findAll(pageable);
    }


}
