package es.uvigo.esei.sgvilar.berest.controllers.entities;

import es.uvigo.esei.sgvilar.berest.entities.TypeEntity;

public class Type {

    private Integer id;
    private String name;
    private String description;


    public Type(TypeEntity typeEntity) {
        this.id = typeEntity.getId();
        this.name = typeEntity.getName();
        this.description = typeEntity.getDescription();
    }
}
