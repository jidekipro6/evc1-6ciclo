 
package raul.quijua.barrera.tiendita.service.impl.gestion;

 
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raul.quijua.barrera.tiendita.dao.gestion.CategoriaDto;
import raul.quijua.barrera.tiendita.entity.gestion.CategoriaEntity;
import raul.quijua.barrera.tiendita.repository.gestion.CategoriaRepository;
 
 
import raul.quijua.barrera.tiendita.service.gestion.CategoriaService;

@RequiredArgsConstructor
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<CategoriaDto> findAll() {
        List<CategoriaEntity> lista = repositorio.findAll();
        return lista.stream().
                map(c -> mapper.map(c, CategoriaDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<CategoriaDto> findAllCustom() {
        List<CategoriaEntity> lista = repositorio.findAllCustom();
        return lista.stream().
                map(c -> mapper.map(c, CategoriaDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaDto findById(Long id) {
        CategoriaEntity lista = repositorio.findById(id).get();
        return mapper.map(lista, CategoriaDto.class);
    }

    @Override
    public CategoriaDto add(CategoriaDto t) {
        CategoriaEntity grado = mapper.map(t, CategoriaEntity.class);
        return mapper.map(repositorio.save(grado), CategoriaDto.class);
    }

    @Override
    public CategoriaDto update(CategoriaDto t,Long id) {
        CategoriaEntity grado = repositorio.findById(id).get();
        mapper.map(t, grado);
        return mapper.map(repositorio.save(grado), CategoriaDto.class);
    }

    @Override
    public CategoriaDto delete( Long id) {
        CategoriaEntity grado = repositorio.findById(id).get();
        grado.setEstado(false);

        return mapper.map(repositorio.save(grado), CategoriaDto.class);    }

    @Override
    public CategoriaDto enable(Long id) {
    CategoriaEntity grado = repositorio.findById(id).get();
        grado.setEstado(true);

        return mapper.map(repositorio.save(grado), CategoriaDto.class);    }

}
