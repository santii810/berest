package es.uvigo.esei.sgvilar.berest.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import es.uvigo.esei.sgvilar.berest.entities.PredictionEntity;
import es.uvigo.esei.sgvilar.berest.services.PredictionService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RequestMapping("predictions")
@RestController
public class PredictionController {


    @Autowired
    private PredictionService predictionService;


    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @JsonView(JSONViews.PredictionView.class)
    public List<PredictionEntity> findAll(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)
                    Pageable page) {
        return predictionService.findAll(page).getContent();
    }


}
