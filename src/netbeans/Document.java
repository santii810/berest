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
import javax.persistence.UniqueConstraint;

/**
 * Document generated by hbm2java
 */
@Entity
@Table(name="document"
    ,catalog="metaserver2"
    , uniqueConstraints = @UniqueConstraint(columnNames="external_id") 
)
public class Document  implements java.io.Serializable {


     private Integer id;
     private DocumentProvider documentProvider;
     private String externalId;
     private byte[] title;
     private byte[] abstract_;
     private byte[] fullText;
     private Date created;
     private Date modified;
     private Integer abstractCharacters;
     private Integer abstractWords;
     private Integer fullTextCharacters;
     private Integer fullTextWords;
     private Float fullTextSize;
     private Float abstractSize;
     private Date publishDate;
     private String agency;
     private Set<DocumentTypeFalseNegative> documentTypeFalseNegatives = new HashSet<DocumentTypeFalseNegative>(0);
     private Set<ProjectsServersTypesDocuments> projectsServersTypesDocumentses = new HashSet<ProjectsServersTypesDocuments>(0);
     private Set<DocumentTypeFalsePositive> documentTypeFalsePositives = new HashSet<DocumentTypeFalsePositive>(0);
     private Set<PrivateDocumentTypeFalsePositive> privateDocumentTypeFalsePositives = new HashSet<PrivateDocumentTypeFalsePositive>(0);
     private Set<PrivateDocumentTypeTruePositive> privateDocumentTypeTruePositives = new HashSet<PrivateDocumentTypeTruePositive>(0);
     private Set<DocumentTypeTruePositive> documentTypeTruePositives = new HashSet<DocumentTypeTruePositive>(0);
     private Set<PrivateDocumentTypeFalseNegative> privateDocumentTypeFalseNegatives = new HashSet<PrivateDocumentTypeFalseNegative>(0);
     private Set<Prediction> predictions = new HashSet<Prediction>(0);
     private Set<DocumentPredictionEvaluation> documentPredictionEvaluations = new HashSet<DocumentPredictionEvaluation>(0);
     private Set<ProjectConsensus> projectConsensuses = new HashSet<ProjectConsensus>(0);
     private Set<Competition> competitions = new HashSet<Competition>(0);
     private Set<GoldAnnotation> goldAnnotations = new HashSet<GoldAnnotation>(0);
     private Set<Project> projects = new HashSet<Project>(0);
     private Set<PrivatePrediction> privatePredictions = new HashSet<PrivatePrediction>(0);
     private Set<PrivateDocumentPredictionEvaluation> privateDocumentPredictionEvaluations = new HashSet<PrivateDocumentPredictionEvaluation>(0);
     private Set<ScheduleRequest> scheduleRequests = new HashSet<ScheduleRequest>(0);

    public Document() {
    }

	
    public Document(DocumentProvider documentProvider, String externalId) {
        this.documentProvider = documentProvider;
        this.externalId = externalId;
    }
    public Document(DocumentProvider documentProvider, String externalId, byte[] title, byte[] abstract_, byte[] fullText, Date created, Date modified, Integer abstractCharacters, Integer abstractWords, Integer fullTextCharacters, Integer fullTextWords, Float fullTextSize, Float abstractSize, Date publishDate, String agency, Set<DocumentTypeFalseNegative> documentTypeFalseNegatives, Set<ProjectsServersTypesDocuments> projectsServersTypesDocumentses, Set<DocumentTypeFalsePositive> documentTypeFalsePositives, Set<PrivateDocumentTypeFalsePositive> privateDocumentTypeFalsePositives, Set<PrivateDocumentTypeTruePositive> privateDocumentTypeTruePositives, Set<DocumentTypeTruePositive> documentTypeTruePositives, Set<PrivateDocumentTypeFalseNegative> privateDocumentTypeFalseNegatives, Set<Prediction> predictions, Set<DocumentPredictionEvaluation> documentPredictionEvaluations, Set<ProjectConsensus> projectConsensuses, Set<Competition> competitions, Set<GoldAnnotation> goldAnnotations, Set<Project> projects, Set<PrivatePrediction> privatePredictions, Set<PrivateDocumentPredictionEvaluation> privateDocumentPredictionEvaluations, Set<ScheduleRequest> scheduleRequests) {
       this.documentProvider = documentProvider;
       this.externalId = externalId;
       this.title = title;
       this.abstract_ = abstract_;
       this.fullText = fullText;
       this.created = created;
       this.modified = modified;
       this.abstractCharacters = abstractCharacters;
       this.abstractWords = abstractWords;
       this.fullTextCharacters = fullTextCharacters;
       this.fullTextWords = fullTextWords;
       this.fullTextSize = fullTextSize;
       this.abstractSize = abstractSize;
       this.publishDate = publishDate;
       this.agency = agency;
       this.documentTypeFalseNegatives = documentTypeFalseNegatives;
       this.projectsServersTypesDocumentses = projectsServersTypesDocumentses;
       this.documentTypeFalsePositives = documentTypeFalsePositives;
       this.privateDocumentTypeFalsePositives = privateDocumentTypeFalsePositives;
       this.privateDocumentTypeTruePositives = privateDocumentTypeTruePositives;
       this.documentTypeTruePositives = documentTypeTruePositives;
       this.privateDocumentTypeFalseNegatives = privateDocumentTypeFalseNegatives;
       this.predictions = predictions;
       this.documentPredictionEvaluations = documentPredictionEvaluations;
       this.projectConsensuses = projectConsensuses;
       this.competitions = competitions;
       this.goldAnnotations = goldAnnotations;
       this.projects = projects;
       this.privatePredictions = privatePredictions;
       this.privateDocumentPredictionEvaluations = privateDocumentPredictionEvaluations;
       this.scheduleRequests = scheduleRequests;
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
    @JoinColumn(name="document_provider_id", nullable=false)
    public DocumentProvider getDocumentProvider() {
        return this.documentProvider;
    }
    
    public void setDocumentProvider(DocumentProvider documentProvider) {
        this.documentProvider = documentProvider;
    }

    
    @Column(name="external_id", unique=true, nullable=false, length=40)
    public String getExternalId() {
        return this.externalId;
    }
    
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    
    @Column(name="title")
    public byte[] getTitle() {
        return this.title;
    }
    
    public void setTitle(byte[] title) {
        this.title = title;
    }

    
    @Column(name="abstract")
    public byte[] getAbstract_() {
        return this.abstract_;
    }
    
    public void setAbstract_(byte[] abstract_) {
        this.abstract_ = abstract_;
    }

    
    @Column(name="full_text")
    public byte[] getFullText() {
        return this.fullText;
    }
    
    public void setFullText(byte[] fullText) {
        this.fullText = fullText;
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
    @Column(name="modified", length=19)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    
    @Column(name="abstract_characters")
    public Integer getAbstractCharacters() {
        return this.abstractCharacters;
    }
    
    public void setAbstractCharacters(Integer abstractCharacters) {
        this.abstractCharacters = abstractCharacters;
    }

    
    @Column(name="abstract_words")
    public Integer getAbstractWords() {
        return this.abstractWords;
    }
    
    public void setAbstractWords(Integer abstractWords) {
        this.abstractWords = abstractWords;
    }

    
    @Column(name="full_text_characters")
    public Integer getFullTextCharacters() {
        return this.fullTextCharacters;
    }
    
    public void setFullTextCharacters(Integer fullTextCharacters) {
        this.fullTextCharacters = fullTextCharacters;
    }

    
    @Column(name="full_text_words")
    public Integer getFullTextWords() {
        return this.fullTextWords;
    }
    
    public void setFullTextWords(Integer fullTextWords) {
        this.fullTextWords = fullTextWords;
    }

    
    @Column(name="full_text_size", precision=12, scale=0)
    public Float getFullTextSize() {
        return this.fullTextSize;
    }
    
    public void setFullTextSize(Float fullTextSize) {
        this.fullTextSize = fullTextSize;
    }

    
    @Column(name="abstract_size", precision=12, scale=0)
    public Float getAbstractSize() {
        return this.abstractSize;
    }
    
    public void setAbstractSize(Float abstractSize) {
        this.abstractSize = abstractSize;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="publish_date", length=19)
    public Date getPublishDate() {
        return this.publishDate;
    }
    
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    
    @Column(name="agency", length=254)
    public String getAgency() {
        return this.agency;
    }
    
    public void setAgency(String agency) {
        this.agency = agency;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<DocumentTypeFalseNegative> getDocumentTypeFalseNegatives() {
        return this.documentTypeFalseNegatives;
    }
    
    public void setDocumentTypeFalseNegatives(Set<DocumentTypeFalseNegative> documentTypeFalseNegatives) {
        this.documentTypeFalseNegatives = documentTypeFalseNegatives;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<ProjectsServersTypesDocuments> getProjectsServersTypesDocumentses() {
        return this.projectsServersTypesDocumentses;
    }
    
    public void setProjectsServersTypesDocumentses(Set<ProjectsServersTypesDocuments> projectsServersTypesDocumentses) {
        this.projectsServersTypesDocumentses = projectsServersTypesDocumentses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<DocumentTypeFalsePositive> getDocumentTypeFalsePositives() {
        return this.documentTypeFalsePositives;
    }
    
    public void setDocumentTypeFalsePositives(Set<DocumentTypeFalsePositive> documentTypeFalsePositives) {
        this.documentTypeFalsePositives = documentTypeFalsePositives;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<PrivateDocumentTypeFalsePositive> getPrivateDocumentTypeFalsePositives() {
        return this.privateDocumentTypeFalsePositives;
    }
    
    public void setPrivateDocumentTypeFalsePositives(Set<PrivateDocumentTypeFalsePositive> privateDocumentTypeFalsePositives) {
        this.privateDocumentTypeFalsePositives = privateDocumentTypeFalsePositives;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<PrivateDocumentTypeTruePositive> getPrivateDocumentTypeTruePositives() {
        return this.privateDocumentTypeTruePositives;
    }
    
    public void setPrivateDocumentTypeTruePositives(Set<PrivateDocumentTypeTruePositive> privateDocumentTypeTruePositives) {
        this.privateDocumentTypeTruePositives = privateDocumentTypeTruePositives;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<DocumentTypeTruePositive> getDocumentTypeTruePositives() {
        return this.documentTypeTruePositives;
    }
    
    public void setDocumentTypeTruePositives(Set<DocumentTypeTruePositive> documentTypeTruePositives) {
        this.documentTypeTruePositives = documentTypeTruePositives;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<PrivateDocumentTypeFalseNegative> getPrivateDocumentTypeFalseNegatives() {
        return this.privateDocumentTypeFalseNegatives;
    }
    
    public void setPrivateDocumentTypeFalseNegatives(Set<PrivateDocumentTypeFalseNegative> privateDocumentTypeFalseNegatives) {
        this.privateDocumentTypeFalseNegatives = privateDocumentTypeFalseNegatives;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<Prediction> getPredictions() {
        return this.predictions;
    }
    
    public void setPredictions(Set<Prediction> predictions) {
        this.predictions = predictions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<DocumentPredictionEvaluation> getDocumentPredictionEvaluations() {
        return this.documentPredictionEvaluations;
    }
    
    public void setDocumentPredictionEvaluations(Set<DocumentPredictionEvaluation> documentPredictionEvaluations) {
        this.documentPredictionEvaluations = documentPredictionEvaluations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<ProjectConsensus> getProjectConsensuses() {
        return this.projectConsensuses;
    }
    
    public void setProjectConsensuses(Set<ProjectConsensus> projectConsensuses) {
        this.projectConsensuses = projectConsensuses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="competition_document", catalog="metaserver2", joinColumns = { 
        @JoinColumn(name="document_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="competition_id", nullable=false, updatable=false) })
    public Set<Competition> getCompetitions() {
        return this.competitions;
    }
    
    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<GoldAnnotation> getGoldAnnotations() {
        return this.goldAnnotations;
    }
    
    public void setGoldAnnotations(Set<GoldAnnotation> goldAnnotations) {
        this.goldAnnotations = goldAnnotations;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="project_document", catalog="metaserver2", joinColumns = { 
        @JoinColumn(name="document_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="project_id", nullable=false, updatable=false) })
    public Set<Project> getProjects() {
        return this.projects;
    }
    
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<PrivatePrediction> getPrivatePredictions() {
        return this.privatePredictions;
    }
    
    public void setPrivatePredictions(Set<PrivatePrediction> privatePredictions) {
        this.privatePredictions = privatePredictions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="document")
    public Set<PrivateDocumentPredictionEvaluation> getPrivateDocumentPredictionEvaluations() {
        return this.privateDocumentPredictionEvaluations;
    }
    
    public void setPrivateDocumentPredictionEvaluations(Set<PrivateDocumentPredictionEvaluation> privateDocumentPredictionEvaluations) {
        this.privateDocumentPredictionEvaluations = privateDocumentPredictionEvaluations;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="schedule_request_document", catalog="metaserver2", joinColumns = { 
        @JoinColumn(name="document_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="schedule_request_id", nullable=false, updatable=false) })
    public Set<ScheduleRequest> getScheduleRequests() {
        return this.scheduleRequests;
    }
    
    public void setScheduleRequests(Set<ScheduleRequest> scheduleRequests) {
        this.scheduleRequests = scheduleRequests;
    }




}


