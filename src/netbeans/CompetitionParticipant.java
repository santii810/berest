package generador.de.modelos;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * CompetitionParticipant generated by hbm2java
 */
@Entity
@Table(name="competition_participant"
    ,catalog="metaserver2"
    , uniqueConstraints = @UniqueConstraint(columnNames={"competition_id", "user_id", "server_id", "server_version_id"}) 
)
public class CompetitionParticipant  implements java.io.Serializable {


     private Integer id;
     private Competition competition;
     private PredictionUpload predictionUpload;
     private Server server;
     private ServerVersion serverVersion;
     private User user;

    public CompetitionParticipant() {
    }

	
    public CompetitionParticipant(Competition competition, Server server, ServerVersion serverVersion, User user) {
        this.competition = competition;
        this.server = server;
        this.serverVersion = serverVersion;
        this.user = user;
    }
    public CompetitionParticipant(Competition competition, PredictionUpload predictionUpload, Server server, ServerVersion serverVersion, User user) {
       this.competition = competition;
       this.predictionUpload = predictionUpload;
       this.server = server;
       this.serverVersion = serverVersion;
       this.user = user;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="competition_id", nullable=false)
    public Competition getCompetition() {
        return this.competition;
    }
    
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="prediction_upload_id")
    public PredictionUpload getPredictionUpload() {
        return this.predictionUpload;
    }
    
    public void setPredictionUpload(PredictionUpload predictionUpload) {
        this.predictionUpload = predictionUpload;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="server_id", nullable=false)
    public Server getServer() {
        return this.server;
    }
    
    public void setServer(Server server) {
        this.server = server;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="server_version_id", nullable=false)
    public ServerVersion getServerVersion() {
        return this.serverVersion;
    }
    
    public void setServerVersion(ServerVersion serverVersion) {
        this.serverVersion = serverVersion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


