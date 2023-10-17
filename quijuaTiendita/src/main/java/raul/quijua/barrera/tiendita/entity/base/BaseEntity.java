 
package raul.quijua.barrera.tiendita.entity.base;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Column(name="estado",nullable = false)
    private boolean estado;    
}
