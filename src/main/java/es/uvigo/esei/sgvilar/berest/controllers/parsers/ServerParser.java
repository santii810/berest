package es.uvigo.esei.sgvilar.berest.controllers.parsers;

import es.uvigo.esei.sgvilar.berest.controllers.entities.Server;
import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;

import java.util.HashSet;
import java.util.Set;

public class ServerParser {
    public Set<Server> parse(Set<ServerEntity> serverEntities) {
        Set<Server> toret = new HashSet<>();
        for (ServerEntity serverEntity : serverEntities) {
            toret.add(new Server(serverEntity));
        }
        return toret;
    }
}
