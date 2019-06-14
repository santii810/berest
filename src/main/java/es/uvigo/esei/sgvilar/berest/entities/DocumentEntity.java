package es.uvigo.esei.sgvilar.berest.entities;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * DocumentEntity generated by hbm2java
 */
@Entity
@Getter
@Setter
@Table(name = "document", catalog = "", uniqueConstraints = @UniqueConstraint(columnNames = "external_id"))
public class DocumentEntity implements java.io.Serializable {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @JsonView(JSONViews.DocumentView.class)
    private Integer id;

    @Column(name = "external_id", unique = true, nullable = false, length = 40)
    @JsonView(JSONViews.DocumentView.class)
    private String externalId;
    @Column(name = "title")
    @JsonView(JSONViews.DocumentView.class)
    private byte[] title;
    @Column(name = "abstract")
    private byte[] abstract_;
    @Column(name = "full_text")
    private byte[] fullText;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified", length = 19)
    private Date modified;
    @Column(name = "abstract_characters")
    private Integer abstractCharacters;
    @Column(name = "abstract_words")
    private Integer abstractWords;
    @Column(name = "full_text_characters")
    private Integer fullTextCharacters;
    @Column(name = "full_text_words")
    private Integer fullTextWords;
    @Column(name = "full_text_size", precision = 12, scale = 0)
    private Float fullTextSize;
    @Column(name = "abstract_size", precision = 12, scale = 0)
    private Float abstractSize;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "publish_date", length = 19)
    private Date publishDate;
    @Column(name = "agency", length = 254)
    private String agency;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "document"})
    private Set<PredictionEntity> predictionEntities = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "document"})
    private Set<PrivatePredictionEntity> privatePredictionEntities = new HashSet<>(0);

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "schedule_request_document", catalog = "", joinColumns = {
            @JoinColumn(name = "document_id", nullable = false, updatable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "schedule_request_id", nullable = false, updatable = false)})
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "documents"})
    private Set<ScheduleRequestEntity> scheduleRequestEntities = new HashSet<>(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_provider_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "documents"})
    private DocumentProviderEntity documentProvider;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<DocumentTypeFalseNegative> documentTypeFalseNegatives = new HashSet<DocumentTypeFalseNegative>(0);
//     private Set<ProjectsServersTypesDocuments> projectsServersTypesDocumentses = new HashSet<ProjectsServersTypesDocuments>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<DocumentTypeFalsePositive> documentTypeFalsePositives = new HashSet<DocumentTypeFalsePositive>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<PrivateDocumentTypeFalsePositive> privateDocumentTypeFalsePositives = new HashSet<PrivateDocumentTypeFalsePositive>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")

//     private Set<DocumentTypeTruePositive> documentTypeTruePositives = new HashSet<DocumentTypeTruePositive>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<PrivateDocumentTypeTruePositive> privateDocumentTypeTruePositives = new HashSet<PrivateDocumentTypeTruePositive>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<PrivateDocumentTypeFalseNegative> privateDocumentTypeFalseNegatives = new HashSet<PrivateDocumentTypeFalseNegative>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<DocumentPredictionEvaluation> documentPredictionEvaluations = new HashSet<DocumentPredictionEvaluation>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<ProjectConsensus> projectConsensuses = new HashSet<ProjectConsensus>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "competition_document", catalog = "", joinColumns = {
//            @JoinColumn(name = "document_id", nullable = false, updatable = false)}, inverseJoinColumns = {
//            @JoinColumn(name = "competition_id", nullable = false, updatable = false)})
//     private Set<Competition> competitions = new HashSet<Competition>(0);


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<GoldAnnotation> goldAnnotations = new HashSet<GoldAnnotation>(0);

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "project_document", catalog = "", joinColumns = {
//            @JoinColumn(name = "document_id", nullable = false, updatable = false)}, inverseJoinColumns = {
//            @JoinColumn(name = "project_id", nullable = false, updatable = false)})
//     private Set<Project> projects = new HashSet<Project>(0);
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
//     private Set<PrivateDocumentPredictionEvaluation> privateDocumentPredictionEvaluations = new HashSet<PrivateDocumentPredictionEvaluation>(0);


}


