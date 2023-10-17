 
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
@JsonPropertyOrder({"codigo","nombre","preciocompra","preciventa","cantidad",
"estado"})

public class ProductoDto extends GenericoDto{
     
    private String nombre;
    
    private double preciocompra;
     
    private double preciventa;
     
    private double cantidad;
    private boolean estado;
     
  
    
    
    
}