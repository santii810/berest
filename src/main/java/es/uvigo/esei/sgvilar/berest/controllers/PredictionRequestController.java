package es.uvigo.esei.sgvilar.berest.controllers;


import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import es.uvigo.esei.sgvilar.berest.controllers.wrappers.PredictionRequestWrapper;
import es.uvigo.esei.sgvilar.berest.entities.DocumentEntity;
import es.uvigo.esei.sgvilar.berest.entities.PredictionRequestEntity;
import es.uvigo.esei.sgvilar.berest.services.DocumentService;
import es.uvigo.esei.sgvilar.berest.services.PredictionRequestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RequestMapping("predictions")
@RestController
public class PredictionRequestController {


    @Autowired
    private PredictionRequestService predictionRequestService;
    @Autowired
    private DocumentService documentService;

    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @JsonView(JSONViews.PredictionRequestsView.class)
    public List<PredictionRequestEntity> findAll(
            @PageableDefault(sort = {"id"},
                    direction = Sort.Direction.ASC) Pageable pageable
    ) {
        return predictionRequestService.findAll(pageable).getContent();
    }


    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<DocumentEntity>> save(
            @RequestBody PredictionRequestWrapper wrapper
    ) {
        System.out.println(wrapper);
        documentService.saveNotExistents(wrapper.getDocuments());


        //TODO cambiar respuesta
        return new ResponseEntity<List<DocumentEntity>>(wrapper.getDocuments(), HttpStatus.OK);
    }


}
