package es.uvigo.esei.sgvilar.berest.controllers.rest;

import es.uvigo.esei.sgvilar.berest.entities.UserEntity;
import es.uvigo.esei.sgvilar.berest.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("user")
@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<UserEntity> findAll() {
        return userService.findAll();
    }
}
