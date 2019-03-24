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
 * PrivateDocumentPredictionEvaluation generated by hbm2java
 */
@Entity
@Table(name="private_document_prediction_evaluation"
    ,catalog="metaserver2"
    , uniqueConstraints = @UniqueConstraint(columnNames={"private_prediction_evaluation_id", "document_id"}) 
)
public class PrivateDocumentPredictionEvaluation  implements java.io.Serializable {


     private Integer id;
     private Document document;
     private PrivatePredictionEvaluation privatePredictionEvaluation;
     private int exactTruePositives;
     private int exactFalsePositives;
     private int exactFalseNegatives;
     private Integer truePositives;
     private Integer falsePositives;
     private Integer falseNegatives;
     private String truePositivesJson;
     private String falsePositivesJson;
     private String falseNegativesJson;
     private Float precision;
     private Float recall;
     private Float FScore;

    public PrivateDocumentPredictionEvaluation() {
    }

	
    public PrivateDocumentPredictionEvaluation(Document document, PrivatePredictionEvaluation privatePredictionEvaluation, int exactTruePositives, int exactFalsePositives, int exactFalseNegatives) {
        this.document = document;
        this.privatePredictionEvaluation = privatePredictionEvaluation;
        this.exactTruePositives = exactTruePositives;
        this.exactFalsePositives = exactFalsePositives;
        this.exactFalseNegatives = exactFalseNegatives;
    }
    public PrivateDocumentPredictionEvaluation(Document document, PrivatePredictionEvaluation privatePredictionEvaluation, int exactTruePositives, int exactFalsePositives, int exactFalseNegatives, Integer truePositives, Integer falsePositives, Integer falseNegatives, String truePositivesJson, String falsePositivesJson, String falseNegativesJson, Float precision, Float recall, Float FScore) {
       this.document = document;
       this.privatePredictionEvaluation = privatePredictionEvaluation;
       this.exactTruePositives = exactTruePositives;
       this.exactFalsePositives = exactFalsePositives;
       this.exactFalseNegatives = exactFalseNegatives;
       this.truePositives = truePositives;
       this.falsePositives = falsePositives;
       this.falseNegatives = falseNegatives;
       this.truePositivesJson = truePositivesJson;
       this.falsePositivesJson = falsePositivesJson;
       this.falseNegativesJson = falseNegativesJson;
       this.precision = precision;
       this.recall = recall;
       this.FScore = FScore;
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
    @JoinColumn(name="private_prediction_evaluation_id", nullable=false)
    public PrivatePredictionEvaluation getPrivatePredictionEvaluation() {
        return this.privatePredictionEvaluation;
    }
    
    public void setPrivatePredictionEvaluation(PrivatePredictionEvaluation privatePredictionEvaluation) {
        this.privatePredictionEvaluation = privatePredictionEvaluation;
    }

    
    @Column(name="exact_true_positives", nullable=false)
    public int getExactTruePositives() {
        return this.exactTruePositives;
    }
    
    public void setExactTruePositives(int exactTruePositives) {
        this.exactTruePositives = exactTruePositives;
    }

    
    @Column(name="exact_false_positives", nullable=false)
    public int getExactFalsePositives() {
        return this.exactFalsePositives;
    }
    
    public void setExactFalsePositives(int exactFalsePositives) {
        this.exactFalsePositives = exactFalsePositives;
    }

    
    @Column(name="exact_false_negatives", nullable=false)
    public int getExactFalseNegatives() {
        return this.exactFalseNegatives;
    }
    
    public void setExactFalseNegatives(int exactFalseNegatives) {
        this.exactFalseNegatives = exactFalseNegatives;
    }

    
    @Column(name="true_positives")
    public Integer getTruePositives() {
        return this.truePositives;
    }
    
    public void setTruePositives(Integer truePositives) {
        this.truePositives = truePositives;
    }

    
    @Column(name="false_positives")
    public Integer getFalsePositives() {
        return this.falsePositives;
    }
    
    public void setFalsePositives(Integer falsePositives) {
        this.falsePositives = falsePositives;
    }

    
    @Column(name="false_negatives")
    public Integer getFalseNegatives() {
        return this.falseNegatives;
    }
    
    public void setFalseNegatives(Integer falseNegatives) {
        this.falseNegatives = falseNegatives;
    }

    
    @Column(name="true_positives_json")
    public String getTruePositivesJson() {
        return this.truePositivesJson;
    }
    
    public void setTruePositivesJson(String truePositivesJson) {
        this.truePositivesJson = truePositivesJson;
    }

    
    @Column(name="false_positives_json")
    public String getFalsePositivesJson() {
        return this.falsePositivesJson;
    }
    
    public void setFalsePositivesJson(String falsePositivesJson) {
        this.falsePositivesJson = falsePositivesJson;
    }

    
    @Column(name="false_negatives_json")
    public String getFalseNegativesJson() {
        return this.falseNegativesJson;
    }
    
    public void setFalseNegativesJson(String falseNegativesJson) {
        this.falseNegativesJson = falseNegativesJson;
    }

    
    @Column(name="precision", precision=12, scale=0)
    public Float getPrecision() {
        return this.precision;
    }
    
    public void setPrecision(Float precision) {
        this.precision = precision;
    }

    
    @Column(name="recall", precision=12, scale=0)
    public Float getRecall() {
        return this.recall;
    }
    
    public void setRecall(Float recall) {
        this.recall = recall;
    }

    
    @Column(name="f_score", precision=12, scale=0)
    public Float getFScore() {
        return this.FScore;
    }
    
    public void setFScore(Float FScore) {
        this.FScore = FScore;
    }




}


