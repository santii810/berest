package es.uvigo.esei.sgvilar.berest.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import es.uvigo.esei.sgvilar.berest.entities.PredictionRequestEntity;
import es.uvigo.esei.sgvilar.berest.services.PredictionRequestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@Log4j2
@RequestMapping("predictions")
@RestController
public class PredictionRequestController {


    @Autowired
    private PredictionRequestService predictionRequestService;

    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @JsonView(JSONViews.PredictionRequestsView.class)
    public Page<PredictionRequestEntity> findAll(
            @PageableDefault(sort = {"id"},
                    direction = Sort.Direction.ASC) Pageable pageable
    ) {
        return predictionRequestService.findAll(pageable);
    }


    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> save(
            Map<String, Object> documents
    ) {
        System.out.println(documents);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }


//    public ResponseEntity<String> save(
//            @RequestBody List<DocumentEntity> documents,
//            @RequestBody List<ServerEntity> servers
//    ) {
//
////        PredictionRequestEntity newPrediction = predictionRequestService.save(predictionRequestEntity);
////        return new ResponseEntity<>("User created " + savedUser.getId(), HttpStatus.CREATED);
//        return new ResponseEntity<>("Ok", HttpStatus.OK);
//    }


}
