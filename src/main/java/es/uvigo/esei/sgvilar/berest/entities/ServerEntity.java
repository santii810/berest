package es.uvigo.esei.sgvilar.berest.entities;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * ServerEntity generated by hbm2java
 */
@Entity
@Getter
@Setter
@Table(name = "server", catalog = "metaserver2", uniqueConstraints = {@UniqueConstraint(columnNames = "key"), @UniqueConstraint(columnNames = "becalm_key")})
public class ServerEntity implements java.io.Serializable {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "servers"})
    private UserEntity user;
    @Column(name = "name", nullable = false, length = 2000)
    private String name;
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Column(name = "person_of_contact", length = 500)
    private String personOfContact;

    @Column(name = "institution", length = 500)
    private String institution;
    @Column(name = "email", nullable = false, length = 500)
    private String email;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "key", unique = true, nullable = false)
    private String key;
    @Column(name = "becalm_key", unique = true)
    private String becalmKey;
    @Column(name = "is_accepted")
    private Boolean isAccepted;
    @Column(name = "website", length = 500)
    private String website;
    @Column(name = "custom_parameters", length = 65535)
    private String customParameters;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified", length = 19)
    private Date modified;
    @Column(name = "country", length = 200)
    private String country;
    @Column(name = "city", length = 200)
    private String city;
    @Column(name = "ip", length = 50)
    private String ip;
    @Column(name = "loc", length = 200)
    private String loc;
    @Column(name = "license", length = 500)
    private String license;
    @Column(name = "license_text", length = 65535)
    private String licenseText;
    @Column(name = "json_license", length = 65535)
    private String jsonLicense;
    @Column(name = "license_machine_readable", length = 65535)
    private String licenseMachineReadable;
    @Column(name = "non_lawyer_url", length = 254)
    private String nonLawyerUrl;
    @Column(name = "send_email_on_error")
    private Boolean sendEmailOnError;
    @Column(name = "is_notifications_enabled")
    private Boolean isNotificationsEnabled;
    @Column(name = "connection_count")
    private Integer connectionCount;
    @Column(name = "waiting_for_request")
    private Boolean waitingForRequest;
    @Column(name = "programming_language", length = 500)
    private String programmingLanguage;
    @Column(name = "has_third_party_software")
    private Boolean hasThirdPartySoftware;
    @Column(name = "third_party_software", length = 65535)
    private String thirdPartySoftware;
    @Column(name = "is_shared")
    private Boolean isShared;
    @Column(name = "relevant_publications", length = 65535)
    private String relevantPublications;
    @Column(name = "funding", length = 65535)
    private String funding;
    @Column(name = "suport_normalization")
    private Boolean suportNormalization;
    @Column(name = "has_relevant_publications")
    private Boolean hasRelevantPublications;
    @Column(name = "BioC_json_predictions")
    private Boolean bioCJsonPredictions;
    @Column(name = "json_predictions")
    private Boolean jsonPredictions;
    @Column(name = "txt_predictions")
    private Boolean txtPredictions;
    @Column(name = "BioC_predictions")
    private Boolean bioCPredictions;
    @Column(name = "operating_system", length = 65535)
    private String operatingSystem;
    @Column(name = "ram")
    private Integer ram;
    @Column(name = "cpus")
    private Integer cpus;
    @Column(name = "is_distributed")
    private Integer isDistributed;
    @Column(name = "public_information")
    private Boolean publicInformation;
    @Column(name = "MTBF_time")
    private Long mtbfTime;
    @Column(name = "MTTR_time")
    private Long mttrTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_error", length = 19)
    private Date lastError;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "first_error", length = 19)
    private Date firstError;
    @Column(name = "is_operational")
    private Boolean isOperational;
    @Column(name = "not_operational_count")
    private Integer notOperationalCount;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "server_type", catalog = "metaserver2", joinColumns = {
            @JoinColumn(name = "server_id", nullable = false, updatable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "type_id", nullable = false, updatable = false)})
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "servers"})
    private Set<TypeEntity> types = new HashSet<TypeEntity>(0);


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "server"})
    private Set<ServerStateEntity> serverStates = new HashSet<ServerStateEntity>(0);

//    private Set<ProjectsServersTypesDocuments> projectsServersTypesDocumentses = new HashSet<ProjectsServersTypesDocuments>(0);
//    private Set<CompetitionParticipant> competitionParticipants = new HashSet<CompetitionParticipant>(0);
//    private Set<DocumentPredictionEvaluation> documentPredictionEvaluations = new HashSet<DocumentPredictionEvaluation>(0);
//    private Set<DocumentTypeFalseNegative> documentTypeFalseNegatives = new HashSet<DocumentTypeFalseNegative>(0);
//    private Set<PredictionEvaluation> predictionEvaluations = new HashSet<PredictionEvaluation>(0);
//    private Set<ServerNormalization> serverNormalizations = new HashSet<ServerNormalization>(0);
//    private Set<RequestEvaluation> requestEvaluations = new HashSet<RequestEvaluation>(0);
//    private Set<ServerVersion> serverVersions = new HashSet<ServerVersion>(0);
//    private Set<PrivatePredictionEvaluation> privatePredictionEvaluations = new HashSet<PrivatePredictionEvaluation>(0);
//    private Set<Prediction> predictions = new HashSet<Prediction>(0);
//    private Set<PredictionRequest> predictionRequests = new HashSet<PredictionRequest>(0);
//    private Set<ServerConnectionLog> serverConnectionLogs = new HashSet<ServerConnectionLog>(0);
//    private Set<DocumentTypeFalsePositive> documentTypeFalsePositives = new HashSet<DocumentTypeFalsePositive>(0);
//    private Set<TypePredictionEvaluation> typePredictionEvaluations = new HashSet<TypePredictionEvaluation>(0);
//    private Set<PrivatePrediction> privatePredictions = new HashSet<PrivatePrediction>(0);
//    private Set<DocumentTypeTruePositive> documentTypeTruePositives = new HashSet<DocumentTypeTruePositive>(0);


//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<ProjectsServersTypesDocuments> getProjectsServersTypesDocumentses() {
//        return this.projectsServersTypesDocumentses;
//    }
//
//    public void setProjectsServersTypesDocumentses(Set<ProjectsServersTypesDocuments> projectsServersTypesDocumentses) {
//        this.projectsServersTypesDocumentses = projectsServersTypesDocumentses;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<CompetitionParticipant> getCompetitionParticipants() {
//        return this.competitionParticipants;
//    }
//
//    public void setCompetitionParticipants(Set<CompetitionParticipant> competitionParticipants) {
//        this.competitionParticipants = competitionParticipants;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<DocumentPredictionEvaluation> getDocumentPredictionEvaluations() {
//        return this.documentPredictionEvaluations;
//    }
//
//    public void setDocumentPredictionEvaluations(Set<DocumentPredictionEvaluation> documentPredictionEvaluations) {
//        this.documentPredictionEvaluations = documentPredictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<DocumentTypeFalseNegative> getDocumentTypeFalseNegatives() {
//        return this.documentTypeFalseNegatives;
//    }
//
//    public void setDocumentTypeFalseNegatives(Set<DocumentTypeFalseNegative> documentTypeFalseNegatives) {
//        this.documentTypeFalseNegatives = documentTypeFalseNegatives;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<PredictionEvaluation> getPredictionEvaluations() {
//        return this.predictionEvaluations;
//    }
//
//    public void setPredictionEvaluations(Set<PredictionEvaluation> predictionEvaluations) {
//        this.predictionEvaluations = predictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<ServerNormalization> getServerNormalizations() {
//        return this.serverNormalizations;
//    }
//
//    public void setServerNormalizations(Set<ServerNormalization> serverNormalizations) {
//        this.serverNormalizations = serverNormalizations;
//    }
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "request_evaluation_server", catalog = "metaserver2", joinColumns = {
//            @JoinColumn(name = "server_id", nullable = false, updatable = false)}, inverseJoinColumns = {
//            @JoinColumn(name = "request_evaluation_id", nullable = false, updatable = false)})
//    public Set<RequestEvaluation> getRequestEvaluations() {
//        return this.requestEvaluations;
//    }
//
//    public void setRequestEvaluations(Set<RequestEvaluation> requestEvaluations) {
//        this.requestEvaluations = requestEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<ServerVersion> getServerVersions() {
//        return this.serverVersions;
//    }
//
//    public void setServerVersions(Set<ServerVersion> serverVersions) {
//        this.serverVersions = serverVersions;
//    }
//
//    public Set<ServerStateEntity> getServerStates() {
//        return this.serverStates;
//    }
//
//    public void setServerStates(Set<ServerStateEntity> serverStates) {
//        this.serverStates = serverStates;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<PrivatePredictionEvaluation> getPrivatePredictionEvaluations() {
//        return this.privatePredictionEvaluations;
//    }
//
//    public void setPrivatePredictionEvaluations(Set<PrivatePredictionEvaluation> privatePredictionEvaluations) {
//        this.privatePredictionEvaluations = privatePredictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<Prediction> getPredictions() {
//        return this.predictions;
//    }
//
//    public void setPredictions(Set<Prediction> predictions) {
//        this.predictions = predictions;
//    }
//

//    public Set<TypeEntity> getTypes() {
//        return this.types;
//    }
//
//    public void setTypes(Set<TypeEntity> types) {
//        this.types = types;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<PredictionRequest> getPredictionRequests() {
//        return this.predictionRequests;
//    }
//
//    public void setPredictionRequests(Set<PredictionRequest> predictionRequests) {
//        this.predictionRequests = predictionRequests;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<ServerConnectionLog> getServerConnectionLogs() {
//        return this.serverConnectionLogs;
//    }
//
//    public void setServerConnectionLogs(Set<ServerConnectionLog> serverConnectionLogs) {
//        this.serverConnectionLogs = serverConnectionLogs;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<DocumentTypeFalsePositive> getDocumentTypeFalsePositives() {
//        return this.documentTypeFalsePositives;
//    }
//
//    public void setDocumentTypeFalsePositives(Set<DocumentTypeFalsePositive> documentTypeFalsePositives) {
//        this.documentTypeFalsePositives = documentTypeFalsePositives;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<TypePredictionEvaluation> getTypePredictionEvaluations() {
//        return this.typePredictionEvaluations;
//    }
//
//    public void setTypePredictionEvaluations(Set<TypePredictionEvaluation> typePredictionEvaluations) {
//        this.typePredictionEvaluations = typePredictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<PrivatePrediction> getPrivatePredictions() {
//        return this.privatePredictions;
//    }
//
//    public void setPrivatePredictions(Set<PrivatePrediction> privatePredictions) {
//        this.privatePredictions = privatePredictions;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "server")
//    public Set<DocumentTypeTruePositive> getDocumentTypeTruePositives() {
//        return this.documentTypeTruePositives;
//    }
//
//    public void setDocumentTypeTruePositives(Set<DocumentTypeTruePositive> documentTypeTruePositives) {
//        this.documentTypeTruePositives = documentTypeTruePositives;
//    }


}


