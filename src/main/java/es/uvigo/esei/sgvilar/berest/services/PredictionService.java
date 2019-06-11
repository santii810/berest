package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.PredictionEntity;
import es.uvigo.esei.sgvilar.berest.repositories.PredictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {
    @Autowired
    private PredictionRepository predictionRepository;

    public Iterable<PredictionEntity> findAll() {
        return predictionRepository.findAll();
    }


}
