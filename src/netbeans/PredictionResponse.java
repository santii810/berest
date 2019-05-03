package generador.de.modelos;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PredictionResponse generated by hbm2java
 */
@Entity
@Table(name="prediction_response"
    ,catalog="metaserver2"
)
public class PredictionResponse  implements java.io.Serializable {


     private Integer id;
     private PredictionRequest predictionRequest;
     private Date created;
     private Date executionTime;
     private String documentsJson;
     private Integer numberOfDocumentsRecived;
     private Integer numberOfPredictions;

    public PredictionResponse() {
    }

	
    public PredictionResponse(PredictionRequest predictionRequest, Date created, Date executionTime) {
        this.predictionRequest = predictionRequest;
        this.created = created;
        this.executionTime = executionTime;
    }
    public PredictionResponse(PredictionRequest predictionRequest, Date created, Date executionTime, String documentsJson, Integer numberOfDocumentsRecived, Integer numberOfPredictions) {
       this.predictionRequest = predictionRequest;
       this.created = created;
       this.executionTime = executionTime;
       this.documentsJson = documentsJson;
       this.numberOfDocumentsRecived = numberOfDocumentsRecived;
       this.numberOfPredictions = numberOfPredictions;
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
    @JoinColumn(name="prediction_request_id", nullable=false)
    public PredictionRequest getPredictionRequest() {
        return this.predictionRequest;
    }
    
    public void setPredictionRequest(PredictionRequest predictionRequest) {
        this.predictionRequest = predictionRequest;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=19)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="execution_time", nullable=false, length=8)
    public Date getExecutionTime() {
        return this.executionTime;
    }
    
    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    
    @Column(name="documents_json")
    public String getDocumentsJson() {
        return this.documentsJson;
    }
    
    public void setDocumentsJson(String documentsJson) {
        this.documentsJson = documentsJson;
    }

    
    @Column(name="number_of_documents_recived")
    public Integer getNumberOfDocumentsRecived() {
        return this.numberOfDocumentsRecived;
    }
    
    public void setNumberOfDocumentsRecived(Integer numberOfDocumentsRecived) {
        this.numberOfDocumentsRecived = numberOfDocumentsRecived;
    }

    
    @Column(name="number_of_predictions")
    public Integer getNumberOfPredictions() {
        return this.numberOfPredictions;
    }
    
    public void setNumberOfPredictions(Integer numberOfPredictions) {
        this.numberOfPredictions = numberOfPredictions;
    }




}

