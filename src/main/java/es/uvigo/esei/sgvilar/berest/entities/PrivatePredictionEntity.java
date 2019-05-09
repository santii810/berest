package es.uvigo.esei.sgvilar.berest.entities;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * PrivatePredictionEntity generated by hbm2java
 */
@Entity
@Getter
@Setter
@Table(name = "private_prediction", catalog = "", uniqueConstraints = @UniqueConstraint(columnNames = {"init", "end", "document_id", "prediction_upload_id", "section"})
)
public class PrivatePredictionEntity implements java.io.Serializable {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;


    @Column(name = "annotated_text", nullable = false)
    private String annotatedText;
    @Column(name = "init", nullable = false)
    private int init;
    @Column(name = "end", nullable = false)
    private int end;
    @Column(name = "section", nullable = false, length = 2)
    private String section;
    @Column(name = "score", precision = 12, scale = 0)
    private Float score;
    @Column(name = "database_id", length = 65535)
    private String databaseId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "privatePredictions"})
    private DocumentEntity document;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prediction_request_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "privatePredictions"})
    private PredictionRequestEntity predictionRequest;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prediction_upload_id")
    private PredictionUploadEntity predictionUpload;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "privatePredictions"})
    private ServerEntity server;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_version_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "privatePredictions"})
    private ServerVersionEntity serverVersion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "privatePredictions"})
    private TypeEntity type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "privatePredictions"})
    private UserEntity user;
}

