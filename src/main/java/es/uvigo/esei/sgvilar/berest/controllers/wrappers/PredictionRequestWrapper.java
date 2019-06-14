package es.uvigo.esei.sgvilar.berest.controllers.wrappers;

import es.uvigo.esei.sgvilar.berest.entities.DocumentEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PredictionRequestWrapper {
    private List<DocumentEntity> documents;
}
