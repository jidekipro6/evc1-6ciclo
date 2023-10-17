 
package raul.quijua.barrera.tiendita.repository.gestion;

 
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import raul.quijua.barrera.tiendita.entity.gestion.ProductoEntity;
import raul.quijua.barrera.tiendita.repository.generic.GenericoRepository;
 
@Repository
public interface ProductoRepository extends GenericoRepository<ProductoEntity, Long>{
    
    @Query("select p from ProductoEntity p where p.estado=true")
    List<ProductoEntity> findAllCustom();
    
}
