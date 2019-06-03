package es.uvigo.esei.sgvilar.berest.controllers;

import es.uvigo.esei.sgvilar.berest.entities.UserEntity;
import es.uvigo.esei.sgvilar.berest.services.GroupService;
import es.uvigo.esei.sgvilar.berest.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("user")
@RestController
public class UserController {


    @Autowired
    private UserService userService;
    @Autowired
    private GroupService groupService;


    @RequestMapping(
            value = "/view/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<UserEntity> findAll() {
        return userService.findAll();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> save(
            @RequestParam("groupId") int groupId,
            @RequestParam("user") String name,
            @RequestParam("organization") String organization,
            @RequestParam("email") String email,
            @RequestParam("password") String pwd
    ) {
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setPassword(pwd);
        user.setEmail(email);
        user.setOrganization(organization);
        user.setGroup(groupService.findById(groupId));
        UserEntity savedUser = userService.save(user);
        return new ResponseEntity<>("User created " + savedUser.getId(), HttpStatus.CREATED);

    }


}
