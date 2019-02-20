package es.uvigo.esei.sgvilar.berest.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "server", schema = "metaserver2")
public class ServerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "servers"})
    private UserEntity user;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "person_of_contact")
    private String personOfContact;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "key")
    private String key;

    @Basic
    @Column(name = "becalm_key")
    private String becalmKey;

    @Basic
    @Column(name = "is_accepted")
    private boolean isAccepted;

}
