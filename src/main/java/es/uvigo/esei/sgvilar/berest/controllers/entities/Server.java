package es.uvigo.esei.sgvilar.berest.controllers.entities;

import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import es.uvigo.esei.sgvilar.berest.entities.TypeEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Server {

    private Integer id;
    private String name;
    private String description;
    private Set<Type> types = new HashSet<Type>(0);


    public Server(ServerEntity serverEntity) {
        this.id = serverEntity.getId();
        this.name = serverEntity.getName();
        this.description = serverEntity.getDescription();
        for (TypeEntity typeEntity : serverEntity.getTypeEntities()) {
            types.add(new Type(typeEntity));
        }
    }
}
