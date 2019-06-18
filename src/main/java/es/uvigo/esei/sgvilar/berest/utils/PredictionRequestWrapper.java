package es.uvigo.esei.sgvilar.berest.utils;

import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import es.uvigo.esei.sgvilar.berest.entities.DocumentEntity;
import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PredictionRequestWrapper {
    @JsonView(JSONViews.PredictionRequestsWrapperView.class)
    private List<DocumentEntity> documents;
    @JsonView(JSONViews.PredictionRequestsWrapperView.class)
    private List<ServerEntity> servers;
}
