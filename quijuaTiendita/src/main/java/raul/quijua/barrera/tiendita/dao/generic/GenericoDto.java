 
package raul.quijua.barrera.tiendita.dao.generic;

import lombok.*;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericoDto {
    @Builder.Default
    private Long codigo=0L;
    
    
}
