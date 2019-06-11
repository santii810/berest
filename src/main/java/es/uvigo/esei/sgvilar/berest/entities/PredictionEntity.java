package es.uvigo.esei.sgvilar.berest.entities;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import es.uvigo.esei.sgvilar.berest.config.JSONViews;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * PredictionEntity generated by hbm2java
 */
@Entity
@Getter
@Setter
@Table(name = "prediction", catalog = "", uniqueConstraints = @UniqueConstraint(columnNames = {"init", "end", "document_id", "prediction_request_id", "type_id", "user_id", "server_version_id", "server_id", "section"}))
public class PredictionEntity implements java.io.Serializable {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private Integer id;


    @Column(name = "annotated_text", nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private String annotatedText;
    @Column(name = "init", nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private int init;
    @Column(name = "end", nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private int end;
    @Column(name = "section", nullable = false, length = 2)
    private String section;
    @Column(name = "score", precision = 12, scale = 0)
    private Float score;
    @Column(name = "database_id", length = 65535)
    private String databaseId;
    @Column(name = "annotated_words")
    private Integer annotatedWords;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id", nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private DocumentEntity document;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prediction_request_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "predictions"})
    private PredictionRequestEntity predictionRequest;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "predictions"})
    @JsonView(JSONViews.PredictionView.class)
    private ServerEntity server;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_version_id", nullable = false)
    private ServerVersionEntity serverVersion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private TypeEntity type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonView(JSONViews.PredictionView.class)
    private UserEntity user;
}


