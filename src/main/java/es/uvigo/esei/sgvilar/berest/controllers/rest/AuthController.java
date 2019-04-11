package es.uvigo.esei.sgvilar.berest.controllers.rest;

import es.uvigo.esei.sgvilar.berest.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("login")
@RestController
public class AuthController {


    @Autowired
    private UserService userService;

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        return "Autenticado " + username + " con pass " + pwd;
    }
}
