package es.uvigo.esei.sgvilar.berest.entities;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import es.uvigo.esei.sgvilar.berest.Strings.BerestStrings;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Table(name = "user", catalog = BerestStrings.CATALOG_NAME)
public class UserEntity implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "users"})
    private GroupEntity group;
    @Column(name = "name", nullable = false, length = 500)
    private String name;
    @Column(name = "organization", nullable = false, length = 2000)
    private String organization;
    @Column(name = "email", nullable = false, length = 500)
    private String email;
    @Column(name = "password", length = 50)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)

    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified", length = 19)
    private Date modified;


    @Column(name = "image")
    private byte[] image;


    @Column(name = "image_mime", length = 45)
    private String imageMime;


    @Column(name = "uid", length = 200)
    private String uid;
    @Column(name = "provider", length = 200)
    private String provider;
    @Column(name = "subscribed_to_emails")
    private Boolean subscribedToEmails;

//    private Set<PredictionUpload> predictionUploads = new HashSet<PredictionUpload>(0);
//    private Set<PrivatePredictionEvaluation> privatePredictionEvaluations = new HashSet<PrivatePredictionEvaluation>(0);
//    private Set<ServerEntity> servers = new HashSet<ServerEntity>(0);
//    private Set<Prediction> predictions = new HashSet<Prediction>(0);
//    private Set<Project> projects = new HashSet<Project>(0);
//    private Set<Notification> notifications = new HashSet<Notification>(0);
//    private Set<DocumentTypeFalsePositive> documentTypeFalsePositives = new HashSet<DocumentTypeFalsePositive>(0);
//    private Set<GoldStandardUpload> goldStandardUploads = new HashSet<GoldStandardUpload>(0);
//    private Set<TypePredictionEvaluation> typePredictionEvaluations = new HashSet<TypePredictionEvaluation>(0);
//    private Set<DocumentPredictionEvaluation> documentPredictionEvaluations = new HashSet<DocumentPredictionEvaluation>(0);
//    private Set<DocumentTypeFalseNegative> documentTypeFalseNegatives = new HashSet<DocumentTypeFalseNegative>(0);
//    private Set<PrivatePrediction> privatePredictions = new HashSet<PrivatePrediction>(0);
//    private Set<DocumentTypeTruePositive> documentTypeTruePositives = new HashSet<DocumentTypeTruePositive>(0);
//    private Set<UserConnection> userConnections = new HashSet<UserConnection>(0);
//    private Set<CompetitionParticipant> competitionParticipants = new HashSet<CompetitionParticipant>(0);
//    private Set<PredictionEvaluation> predictionEvaluations = new HashSet<PredictionEvaluation>(0);
//


//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<PredictionUpload> getPredictionUploads() {
//        return this.predictionUploads;
//    }
//
//    public void setPredictionUploads(Set<PredictionUpload> predictionUploads) {
//        this.predictionUploads = predictionUploads;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<PrivatePredictionEvaluation> getPrivatePredictionEvaluations() {
//        return this.privatePredictionEvaluations;
//    }
//
//    public void setPrivatePredictionEvaluations(Set<PrivatePredictionEvaluation> privatePredictionEvaluations) {
//        this.privatePredictionEvaluations = privatePredictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<ServerEntity> getServers() {
//        return this.servers;
//    }
//
//    public void setServers(Set<ServerEntity> servers) {
//        this.servers = servers;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<Prediction> getPredictions() {
//        return this.predictions;
//    }
//
//    public void setPredictions(Set<Prediction> predictions) {
//        this.predictions = predictions;
//    }
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_project", catalog = BerestStrings.CATALOG_NAME, joinColumns = {
//            @JoinColumn(name = "user_id", nullable = false, updatable = false)}, inverseJoinColumns = {
//            @JoinColumn(name = "project_id", nullable = false, updatable = false)})
//    public Set<Project> getProjects() {
//        return this.projects;
//    }
//
//    public void setProjects(Set<Project> projects) {
//        this.projects = projects;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<Notification> getNotifications() {
//        return this.notifications;
//    }
//
//    public void setNotifications(Set<Notification> notifications) {
//        this.notifications = notifications;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<DocumentTypeFalsePositive> getDocumentTypeFalsePositives() {
//        return this.documentTypeFalsePositives;
//    }
//
//    public void setDocumentTypeFalsePositives(Set<DocumentTypeFalsePositive> documentTypeFalsePositives) {
//        this.documentTypeFalsePositives = documentTypeFalsePositives;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<GoldStandardUpload> getGoldStandardUploads() {
//        return this.goldStandardUploads;
//    }
//
//    public void setGoldStandardUploads(Set<GoldStandardUpload> goldStandardUploads) {
//        this.goldStandardUploads = goldStandardUploads;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<TypePredictionEvaluation> getTypePredictionEvaluations() {
//        return this.typePredictionEvaluations;
//    }
//
//    public void setTypePredictionEvaluations(Set<TypePredictionEvaluation> typePredictionEvaluations) {
//        this.typePredictionEvaluations = typePredictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<DocumentPredictionEvaluation> getDocumentPredictionEvaluations() {
//        return this.documentPredictionEvaluations;
//    }
//
//    public void setDocumentPredictionEvaluations(Set<DocumentPredictionEvaluation> documentPredictionEvaluations) {
//        this.documentPredictionEvaluations = documentPredictionEvaluations;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<DocumentTypeFalseNegative> getDocumentTypeFalseNegatives() {
//        return this.documentTypeFalseNegatives;
//    }
//
//    public void setDocumentTypeFalseNegatives(Set<DocumentTypeFalseNegative> documentTypeFalseNegatives) {
//        this.documentTypeFalseNegatives = documentTypeFalseNegatives;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<PrivatePrediction> getPrivatePredictions() {
//        return this.privatePredictions;
//    }
//
//    public void setPrivatePredictions(Set<PrivatePrediction> privatePredictions) {
//        this.privatePredictions = privatePredictions;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<DocumentTypeTruePositive> getDocumentTypeTruePositives() {
//        return this.documentTypeTruePositives;
//    }
//
//    public void setDocumentTypeTruePositives(Set<DocumentTypeTruePositive> documentTypeTruePositives) {
//        this.documentTypeTruePositives = documentTypeTruePositives;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<UserConnection> getUserConnections() {
//        return this.userConnections;
//    }
//
//    public void setUserConnections(Set<UserConnection> userConnections) {
//        this.userConnections = userConnections;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<CompetitionParticipant> getCompetitionParticipants() {
//        return this.competitionParticipants;
//    }
//
//    public void setCompetitionParticipants(Set<CompetitionParticipant> competitionParticipants) {
//        this.competitionParticipants = competitionParticipants;
//    }
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    public Set<PredictionEvaluation> getPredictionEvaluations() {
//        return this.predictionEvaluations;
//    }
//
//    public void setPredictionEvaluations(Set<PredictionEvaluation> predictionEvaluations) {
//        this.predictionEvaluations = predictionEvaluations;
//    }


}


