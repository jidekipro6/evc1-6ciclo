 
package raul.quijua.barrera.tiendita.entity.gestion;

 
 
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.SuperBuilder;
import raul.quijua.barrera.tiendita.entity.base.BaseEntity;
 

@SuperBuilder
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

@JsonPropertyOrder({"codigo","nombre","preproc","preprov","canpro","estado"})
@Entity(name = "ProductoEntity")
@Table(name = "producto")
public class ProductoEntity extends BaseEntity implements Serializable{
   private static final long serialVersionUID = 1L;
     @Id
     @Column(name = "codpro")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name ="nompro")
    private String nombre;
    @Column(name ="preproc")
    private double preciocompra;
    @Column(name="preprov")
    private double preciventa;
    @Column (name="canpro")
    private double cantidad;
    //@Column (name="estpro")
    //private boolean estado;
    //@ManyToOne
    //@JoinColumn(name ="codcat",nullable=false)
    //private CategoriaEntity categoria;
}
