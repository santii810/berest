package es.uvigo.esei.sgvilar.berest.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import es.uvigo.esei.sgvilar.berest.services.ServerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Log4j2
@RequestMapping("servers")
@RestController
public class ServerController {


    @Autowired
    private ServerService serverService;

    @JsonView(JSONViews.ServerAndServicesView.class)
    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Set<ServerEntity> findAll() {
        return serverService.findAll();
    }

    @JsonView(JSONViews.ServerAndServicesView.class)
    @RequestMapping(
            value = "/view/online",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Set<ServerEntity> findOnlineServers() {
        return serverService.findOnlineServers();
    }

}
