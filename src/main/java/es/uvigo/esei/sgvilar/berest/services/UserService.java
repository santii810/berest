package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.UserEntity;
import es.uvigo.esei.sgvilar.berest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<UserEntity> findAll() {
        return userRepository.findAll();
    }


}
