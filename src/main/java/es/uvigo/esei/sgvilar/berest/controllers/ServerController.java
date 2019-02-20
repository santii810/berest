package es.uvigo.esei.sgvilar.berest.controllers;

import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import es.uvigo.esei.sgvilar.berest.services.ServerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("server")
@RestController
public class ServerController {


    @Autowired
    private ServerService serverService;

    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<ServerEntity> findAll() {
        return serverService.findAll();
    }
}
