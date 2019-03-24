package generador.de.modelos;
// Generated 12-mar-2019 17:18:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Aros generated by hbm2java
 */
@Entity
@Table(name="aros"
    ,catalog="metaserver2"
)
public class Aros  implements java.io.Serializable {


     private Integer id;
     private Integer parentId;
     private String model;
     private Integer foreignKey;
     private String alias;
     private Integer lft;
     private Integer rght;
     private Set<Permission> permissions = new HashSet<Permission>(0);

    public Aros() {
    }

    public Aros(Integer parentId, String model, Integer foreignKey, String alias, Integer lft, Integer rght, Set<Permission> permissions) {
       this.parentId = parentId;
       this.model = model;
       this.foreignKey = foreignKey;
       this.alias = alias;
       this.lft = lft;
       this.rght = rght;
       this.permissions = permissions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="parent_id")
    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    
    @Column(name="model")
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    
    @Column(name="foreign_key")
    public Integer getForeignKey() {
        return this.foreignKey;
    }
    
    public void setForeignKey(Integer foreignKey) {
        this.foreignKey = foreignKey;
    }

    
    @Column(name="alias")
    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }

    
    @Column(name="lft")
    public Integer getLft() {
        return this.lft;
    }
    
    public void setLft(Integer lft) {
        this.lft = lft;
    }

    
    @Column(name="rght")
    public Integer getRght() {
        return this.rght;
    }
    
    public void setRght(Integer rght) {
        this.rght = rght;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aros")
    public Set<Permission> getPermissions() {
        return this.permissions;
    }
    
    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }




}


