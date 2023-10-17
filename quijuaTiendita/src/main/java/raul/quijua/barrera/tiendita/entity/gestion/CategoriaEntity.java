
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
@JsonPropertyOrder({"codcat", "nomcat","estcat"})
@Entity(name = "CategoriaEntity")
@Table(name = "categoria")
public class CategoriaEntity extends BaseEntity implements Serializable {

   private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codcat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nomcat")
    private String nombre;
    //@Column(name = "estcat")
   // private boolean estado;
    
}
