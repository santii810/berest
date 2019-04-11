package es.uvigo.esei.sgvilar.berest.controllers.rest;

import es.uvigo.esei.sgvilar.berest.entities.TaskEntity;
import es.uvigo.esei.sgvilar.berest.services.TaskService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("tasks")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<TaskEntity> findAll() {
        return taskService.findAll();
    }

}
