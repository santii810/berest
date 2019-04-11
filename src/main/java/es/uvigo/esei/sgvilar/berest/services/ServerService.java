package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import es.uvigo.esei.sgvilar.berest.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServerService {
    @Autowired
    private ServerRepository serverRepository;

    public Set<ServerEntity> findAll() {
        return serverRepository.findAll();
    }

    public Set<ServerEntity> findOnlineServers() {
        return serverRepository.findAllByState("Running");
    }
}



