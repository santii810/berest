package es.uvigo.esei.sgvilar.berest.entities;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TaskNameEntity generated by hbm2java
 */
@Entity
@Getter
@Setter
@Table(name = "task_name", catalog = "metaserver2")
public class TaskNameEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name", length = 500)
    private String name;
    @Column(name = "description", length = 65535)
    private String description;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskName")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "taskName"})
    private Set<TaskEntity> tasks = new HashSet<TaskEntity>(0);

}


