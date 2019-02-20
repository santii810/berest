package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import es.uvigo.esei.sgvilar.berest.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerService {
    @Autowired
    private ServerRepository serverRepository;

    public Iterable<ServerEntity> findAll() {
        return serverRepository.findAll();
    }
}
