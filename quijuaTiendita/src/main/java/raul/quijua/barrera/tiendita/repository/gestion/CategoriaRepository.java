 
package raul.quijua.barrera.tiendita.repository.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import raul.quijua.barrera.tiendita.entity.gestion.CategoriaEntity;
import raul.quijua.barrera.tiendita.repository.generic.GenericoRepository;
 

@Repository
public interface CategoriaRepository extends GenericoRepository<CategoriaEntity, Long>{
    @Query("select c from CategoriaEntity c where c.estado=true")
    List<CategoriaEntity> findAllCustom();
     
}