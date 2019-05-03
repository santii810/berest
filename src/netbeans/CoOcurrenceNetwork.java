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

/**
 * CoOcurrenceNetwork generated by hbm2java
 */
@Entity
@Table(name="co_ocurrence_network"
    ,catalog="metaserver2"
)
public class CoOcurrenceNetwork  implements java.io.Serializable {


     private Integer id;
     private GoldAnnotation goldAnnotationByTermBId;
     private GoldAnnotation goldAnnotationByTermAId;
     private GoldStandardUpload goldStandardUpload;
     private Integer total;

    public CoOcurrenceNetwork() {
    }

	
    public CoOcurrenceNetwork(GoldAnnotation goldAnnotationByTermBId, GoldAnnotation goldAnnotationByTermAId, GoldStandardUpload goldStandardUpload) {
        this.goldAnnotationByTermBId = goldAnnotationByTermBId;
        this.goldAnnotationByTermAId = goldAnnotationByTermAId;
        this.goldStandardUpload = goldStandardUpload;
    }
    public CoOcurrenceNetwork(GoldAnnotation goldAnnotationByTermBId, GoldAnnotation goldAnnotationByTermAId, GoldStandardUpload goldStandardUpload, Integer total) {
       this.goldAnnotationByTermBId = goldAnnotationByTermBId;
       this.goldAnnotationByTermAId = goldAnnotationByTermAId;
       this.goldStandardUpload = goldStandardUpload;
       this.total = total;
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
    @JoinColumn(name="term_b_id", nullable=false)
    public GoldAnnotation getGoldAnnotationByTermBId() {
        return this.goldAnnotationByTermBId;
    }
    
    public void setGoldAnnotationByTermBId(GoldAnnotation goldAnnotationByTermBId) {
        this.goldAnnotationByTermBId = goldAnnotationByTermBId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="term_a_id", nullable=false)
    public GoldAnnotation getGoldAnnotationByTermAId() {
        return this.goldAnnotationByTermAId;
    }
    
    public void setGoldAnnotationByTermAId(GoldAnnotation goldAnnotationByTermAId) {
        this.goldAnnotationByTermAId = goldAnnotationByTermAId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="gold_standard_upload_id", nullable=false)
    public GoldStandardUpload getGoldStandardUpload() {
        return this.goldStandardUpload;
    }
    
    public void setGoldStandardUpload(GoldStandardUpload goldStandardUpload) {
        this.goldStandardUpload = goldStandardUpload;
    }

    
    @Column(name="total")
    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }




}

