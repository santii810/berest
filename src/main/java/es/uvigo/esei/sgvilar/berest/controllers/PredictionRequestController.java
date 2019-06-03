package es.uvigo.esei.sgvilar.berest.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import es.uvigo.esei.sgvilar.berest.entities.PredictionRequestEntity;
import es.uvigo.esei.sgvilar.berest.services.PredictionRequestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("predictions")
@RestController
public class PredictionRequestController {

    @Autowired
    private PredictionRequestService predictionRequestService;

    @JsonView(JSONViews.PredictionRequests.class)
    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<PredictionRequestEntity> findAll(
            @RequestParam("page") int page,
            @RequestParam("size") int size) {
        return predictionRequestService.findAll(page, size);
    }


//    @RequestMapping(
//            value = "/add",
//            method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<String> addUser(
//            @RequestBody UserEntity user
//    ) {
//        UserEntity savedUser = userService.save(user);
//        return new ResponseEntity<>("User created " + savedUser.getId(), HttpStatus.CREATED);
//    }


}
