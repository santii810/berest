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
 * Prediction generated by hbm2java
 */
@Entity
@Table(name="prediction"
    ,catalog="metaserver2"
    , uniqueConstraints = @UniqueConstraint(columnNames={"init", "end", "document_id", "prediction_request_id", "type_id", "user_id", "server_version_id", "server_id", "section"}) 
)
public class Prediction  implements java.io.Serializable {


     private Integer id;
     private Document document;
     private PredictionRequest predictionRequest;
     private Server server;
     private ServerVersion serverVersion;
     private Type type;
     private User user;
     private String annotatedText;
     private int init;
     private int end;
     private String section;
     private Float score;
     private String databaseId;
     private Integer annotatedWords;

    public Prediction() {
    }

	
    public Prediction(Document document, Server server, ServerVersion serverVersion, Type type, User user, String annotatedText, int init, int end, String section) {
        this.document = document;
        this.server = server;
        this.serverVersion = serverVersion;
        this.type = type;
        this.user = user;
        this.annotatedText = annotatedText;
        this.init = init;
        this.end = end;
        this.section = section;
    }
    public Prediction(Document document, PredictionRequest predictionRequest, Server server, ServerVersion serverVersion, Type type, User user, String annotatedText, int init, int end, String section, Float score, String databaseId, Integer annotatedWords) {
       this.document = document;
       this.predictionRequest = predictionRequest;
       this.server = server;
       this.serverVersion = serverVersion;
       this.type = type;
       this.user = user;
       this.annotatedText = annotatedText;
       this.init = init;
       this.end = end;
       this.section = section;
       this.score = score;
       this.databaseId = databaseId;
       this.annotatedWords = annotatedWords;
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
    @JoinColumn(name="document_id", nullable=false)
    public Document getDocument() {
        return this.document;
    }
    
    public void setDocument(Document document) {
        this.document = document;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="prediction_request_id")
    public PredictionRequest getPredictionRequest() {
        return this.predictionRequest;
    }
    
    public void setPredictionRequest(PredictionRequest predictionRequest) {
        this.predictionRequest = predictionRequest;
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
    @JoinColumn(name="type_id", nullable=false)
    public Type getType() {
        return this.type;
    }
    
    public void setType(Type type) {
        this.type = type;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="annotated_text", nullable=false)
    public String getAnnotatedText() {
        return this.annotatedText;
    }
    
    public void setAnnotatedText(String annotatedText) {
        this.annotatedText = annotatedText;
    }

    
    @Column(name="init", nullable=false)
    public int getInit() {
        return this.init;
    }
    
    public void setInit(int init) {
        this.init = init;
    }

    
    @Column(name="end", nullable=false)
    public int getEnd() {
        return this.end;
    }
    
    public void setEnd(int end) {
        this.end = end;
    }

    
    @Column(name="section", nullable=false, length=2)
    public String getSection() {
        return this.section;
    }
    
    public void setSection(String section) {
        this.section = section;
    }

    
    @Column(name="score", precision=12, scale=0)
    public Float getScore() {
        return this.score;
    }
    
    public void setScore(Float score) {
        this.score = score;
    }

    
    @Column(name="database_id", length=65535)
    public String getDatabaseId() {
        return this.databaseId;
    }
    
    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    
    @Column(name="annotated_words")
    public Integer getAnnotatedWords() {
        return this.annotatedWords;
    }
    
    public void setAnnotatedWords(Integer annotatedWords) {
        this.annotatedWords = annotatedWords;
    }




}

