package es.uvigo.esei.sgvilar.berest.repositories;

import es.uvigo.esei.sgvilar.berest.entities.ServerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ServerRepository extends CrudRepository<ServerEntity, Integer> {
    Set<ServerEntity> findAll();

    @Query("SELECT ser FROM ServerEntity ser " +
            "INNER JOIN ServerStateEntity state ON (ser.id = state.server.id) " +
            "WHERE state.created IN (SELECT MAX(laststate.created) FROM ServerStateEntity laststate GROUP BY laststate.server ) " +
            "AND state.serverStateName.name = :stateName "
    )
    Set<ServerEntity> findAllByState(@Param("stateName") String stateName);
}
