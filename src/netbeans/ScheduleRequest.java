package generador.de.modelos;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ScheduleRequest generated by hbm2java
 */
@Entity
@Table(name="schedule_request"
    ,catalog="metaserver2"
)
public class ScheduleRequest  implements java.io.Serializable {


     private Integer id;
     private RequestEvaluation requestEvaluation;
     private ScheduleAlgorithm scheduleAlgorithm;
     private String name;
     private Date created;
     private Date deadline;
     private Date releasedDate;
     private boolean executed;
     private Integer bestServer;
     private Float bestServerTime;
     private Integer lowestServer;
     private Float lowestServerTime;
     private boolean randomDocuments;
     private boolean randomTypes;
     private Integer numberOfDocumentsToRequest;
     private Integer numberOfTypesToRequest;
     private String exception;
     private Integer totalCharacters;
     private Integer totalWords;
     private Integer totalBytes;
     private Integer partitionSize;
     private Integer timeBetweenRequest;
     private boolean randomTime;
     private boolean createBeforeReleaseDate;
     private String debugInfo;
     private Set<Document> documents = new HashSet<Document>(0);
     private Set<DocumentProvider> documentProviders = new HashSet<DocumentProvider>(0);
     private Set<Type> types = new HashSet<Type>(0);
     private Set<PredictionRequest> predictionRequests = new HashSet<PredictionRequest>(0);

    public ScheduleRequest() {
    }

	
    public ScheduleRequest(RequestEvaluation requestEvaluation, ScheduleAlgorithm scheduleAlgorithm, boolean executed, boolean randomDocuments, boolean randomTypes, boolean randomTime, boolean createBeforeReleaseDate) {
        this.requestEvaluation = requestEvaluation;
        this.scheduleAlgorithm = scheduleAlgorithm;
        this.executed = executed;
        this.randomDocuments = randomDocuments;
        this.randomTypes = randomTypes;
        this.randomTime = randomTime;
        this.createBeforeReleaseDate = createBeforeReleaseDate;
    }
    public ScheduleRequest(RequestEvaluation requestEvaluation, ScheduleAlgorithm scheduleAlgorithm, String name, Date created, Date deadline, Date releasedDate, boolean executed, Integer bestServer, Float bestServerTime, Integer lowestServer, Float lowestServerTime, boolean randomDocuments, boolean randomTypes, Integer numberOfDocumentsToRequest, Integer numberOfTypesToRequest, String exception, Integer totalCharacters, Integer totalWords, Integer totalBytes, Integer partitionSize, Integer timeBetweenRequest, boolean randomTime, boolean createBeforeReleaseDate, String debugInfo, Set<Document> documents, Set<DocumentProvider> documentProviders, Set<Type> types, Set<PredictionRequest> predictionRequests) {
       this.requestEvaluation = requestEvaluation;
       this.scheduleAlgorithm = scheduleAlgorithm;
       this.name = name;
       this.created = created;
       this.deadline = deadline;
       this.releasedDate = releasedDate;
       this.executed = executed;
       this.bestServer = bestServer;
       this.bestServerTime = bestServerTime;
       this.lowestServer = lowestServer;
       this.lowestServerTime = lowestServerTime;
       this.randomDocuments = randomDocuments;
       this.randomTypes = randomTypes;
       this.numberOfDocumentsToRequest = numberOfDocumentsToRequest;
       this.numberOfTypesToRequest = numberOfTypesToRequest;
       this.exception = exception;
       this.totalCharacters = totalCharacters;
       this.totalWords = totalWords;
       this.totalBytes = totalBytes;
       this.partitionSize = partitionSize;
       this.timeBetweenRequest = timeBetweenRequest;
       this.randomTime = randomTime;
       this.createBeforeReleaseDate = createBeforeReleaseDate;
       this.debugInfo = debugInfo;
       this.documents = documents;
       this.documentProviders = documentProviders;
       this.types = types;
       this.predictionRequests = predictionRequests;
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
    @JoinColumn(name="request_evaluation_id", nullable=false)
    public RequestEvaluation getRequestEvaluation() {
        return this.requestEvaluation;
    }
    
    public void setRequestEvaluation(RequestEvaluation requestEvaluation) {
        this.requestEvaluation = requestEvaluation;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="schedule_algorithm_id", nullable=false)
    public ScheduleAlgorithm getScheduleAlgorithm() {
        return this.scheduleAlgorithm;
    }
    
    public void setScheduleAlgorithm(ScheduleAlgorithm scheduleAlgorithm) {
        this.scheduleAlgorithm = scheduleAlgorithm;
    }

    
    @Column(name="name", length=2000)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", length=19)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="deadline", length=19)
    public Date getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="released_date", length=19)
    public Date getReleasedDate() {
        return this.releasedDate;
    }
    
    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    
    @Column(name="executed", nullable=false)
    public boolean isExecuted() {
        return this.executed;
    }
    
    public void setExecuted(boolean executed) {
        this.executed = executed;
    }

    
    @Column(name="best_server")
    public Integer getBestServer() {
        return this.bestServer;
    }
    
    public void setBestServer(Integer bestServer) {
        this.bestServer = bestServer;
    }

    
    @Column(name="best_server_time", precision=12, scale=0)
    public Float getBestServerTime() {
        return this.bestServerTime;
    }
    
    public void setBestServerTime(Float bestServerTime) {
        this.bestServerTime = bestServerTime;
    }

    
    @Column(name="lowest_server")
    public Integer getLowestServer() {
        return this.lowestServer;
    }
    
    public void setLowestServer(Integer lowestServer) {
        this.lowestServer = lowestServer;
    }

    
    @Column(name="lowest_server_time", precision=12, scale=0)
    public Float getLowestServerTime() {
        return this.lowestServerTime;
    }
    
    public void setLowestServerTime(Float lowestServerTime) {
        this.lowestServerTime = lowestServerTime;
    }

    
    @Column(name="random_documents", nullable=false)
    public boolean isRandomDocuments() {
        return this.randomDocuments;
    }
    
    public void setRandomDocuments(boolean randomDocuments) {
        this.randomDocuments = randomDocuments;
    }

    
    @Column(name="random_types", nullable=false)
    public boolean isRandomTypes() {
        return this.randomTypes;
    }
    
    public void setRandomTypes(boolean randomTypes) {
        this.randomTypes = randomTypes;
    }

    
    @Column(name="number_of_documents_to_request")
    public Integer getNumberOfDocumentsToRequest() {
        return this.numberOfDocumentsToRequest;
    }
    
    public void setNumberOfDocumentsToRequest(Integer numberOfDocumentsToRequest) {
        this.numberOfDocumentsToRequest = numberOfDocumentsToRequest;
    }

    
    @Column(name="number_of_types_to_request")
    public Integer getNumberOfTypesToRequest() {
        return this.numberOfTypesToRequest;
    }
    
    public void setNumberOfTypesToRequest(Integer numberOfTypesToRequest) {
        this.numberOfTypesToRequest = numberOfTypesToRequest;
    }

    
    @Column(name="exception", length=65535)
    public String getException() {
        return this.exception;
    }
    
    public void setException(String exception) {
        this.exception = exception;
    }

    
    @Column(name="total_characters")
    public Integer getTotalCharacters() {
        return this.totalCharacters;
    }
    
    public void setTotalCharacters(Integer totalCharacters) {
        this.totalCharacters = totalCharacters;
    }

    
    @Column(name="total_words")
    public Integer getTotalWords() {
        return this.totalWords;
    }
    
    public void setTotalWords(Integer totalWords) {
        this.totalWords = totalWords;
    }

    
    @Column(name="total_bytes")
    public Integer getTotalBytes() {
        return this.totalBytes;
    }
    
    public void setTotalBytes(Integer totalBytes) {
        this.totalBytes = totalBytes;
    }

    
    @Column(name="partition_size")
    public Integer getPartitionSize() {
        return this.partitionSize;
    }
    
    public void setPartitionSize(Integer partitionSize) {
        this.partitionSize = partitionSize;
    }

    
    @Column(name="time_between_request")
    public Integer getTimeBetweenRequest() {
        return this.timeBetweenRequest;
    }
    
    public void setTimeBetweenRequest(Integer timeBetweenRequest) {
        this.timeBetweenRequest = timeBetweenRequest;
    }

    
    @Column(name="random_time", nullable=false)
    public boolean isRandomTime() {
        return this.randomTime;
    }
    
    public void setRandomTime(boolean randomTime) {
        this.randomTime = randomTime;
    }

    
    @Column(name="create_before_release_date", nullable=false)
    public boolean isCreateBeforeReleaseDate() {
        return this.createBeforeReleaseDate;
    }
    
    public void setCreateBeforeReleaseDate(boolean createBeforeReleaseDate) {
        this.createBeforeReleaseDate = createBeforeReleaseDate;
    }

    
    @Column(name="debug_info", length=65535)
    public String getDebugInfo() {
        return this.debugInfo;
    }
    
    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="schedule_request_document", catalog="metaserver2", joinColumns = { 
        @JoinColumn(name="schedule_request_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="document_id", nullable=false, updatable=false) })
    public Set<Document> getDocuments() {
        return this.documents;
    }
    
    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="schedule_request_document_provider", catalog="metaserver2", joinColumns = { 
        @JoinColumn(name="schedule_request_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="document_provider_id", nullable=false, updatable=false) })
    public Set<DocumentProvider> getDocumentProviders() {
        return this.documentProviders;
    }
    
    public void setDocumentProviders(Set<DocumentProvider> documentProviders) {
        this.documentProviders = documentProviders;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="schedule_request_type", catalog="metaserver2", joinColumns = { 
        @JoinColumn(name="schedule_request_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="type_id", nullable=false, updatable=false) })
    public Set<Type> getTypes() {
        return this.types;
    }
    
    public void setTypes(Set<Type> types) {
        this.types = types;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="scheduleRequest")
    public Set<PredictionRequest> getPredictionRequests() {
        return this.predictionRequests;
    }
    
    public void setPredictionRequests(Set<PredictionRequest> predictionRequests) {
        this.predictionRequests = predictionRequests;
    }




}


