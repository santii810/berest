package es.uvigo.esei.sgvilar.berest.controllers;

import es.uvigo.esei.sgvilar.berest.entities.UserEntity;
import es.uvigo.esei.sgvilar.berest.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("user")
@RestController
public class UserController {


    @Autowired
    private UserService userService;


//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    public UserController(BCryptPasswordEncoder bCryptPasswordEncoder) {
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }


    @GetMapping("/users/")
    public Iterable<UserEntity> getAllUsers() {
        return userService.findAll();
    }
}
