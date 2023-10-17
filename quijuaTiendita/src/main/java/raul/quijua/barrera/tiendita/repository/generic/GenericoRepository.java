 
package raul.quijua.barrera.tiendita.repository.generic;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericoRepository<T,ID> extends JpaRepository<T, ID>{
    
}
