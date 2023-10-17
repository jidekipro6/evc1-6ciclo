 
package raul.quijua.barrera.tiendita.dao.gestion;

 
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import lombok.experimental.SuperBuilder;
import raul.quijua.barrera.tiendita.dao.generic.GenericoDto;
 

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"codigo","nombre","estado"})
public class CategoriaDto extends GenericoDto{
        
     
    private String nombre;
    //@Column(name = "estcat")
    private boolean estado;
    
}
