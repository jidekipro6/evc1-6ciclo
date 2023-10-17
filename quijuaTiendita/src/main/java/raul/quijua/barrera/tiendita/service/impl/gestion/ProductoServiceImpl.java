package raul.quijua.barrera.tiendita.service.impl.gestion;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import raul.quijua.barrera.tiendita.dao.gestion.ProductoDto;
import raul.quijua.barrera.tiendita.entity.gestion.ProductoEntity;
import raul.quijua.barrera.tiendita.repository.gestion.ProductoRepository;
import raul.quijua.barrera.tiendita.service.gestion.ProductoService;

@RequiredArgsConstructor

@Service

public class ProductoServiceImpl implements ProductoService {

    @Autowired

    private ProductoRepository repository;

    @Autowired

    private ModelMapper mapper;

    @Override

    public List<ProductoDto> findAll() {

        List<ProductoEntity> lista = repository.findAll();

        return lista.stream().map(p -> mapper.map(p, ProductoDto.class)).collect(Collectors.toList());

    }

    @Override

    public List<ProductoDto> findAllCustom() {

        List<ProductoEntity> lista = repository.findAllCustom();
        return lista.stream().
                map(p -> mapper.map(p, ProductoDto.class))
                .collect(Collectors.toList());
    }

    @Override

    public ProductoDto findById(Long id) {

        ProductoEntity lista = repository.findById(id).get();
        return mapper.map(lista, ProductoDto.class);

    }

    @Override

    public ProductoDto add(ProductoDto t) {

        ProductoEntity grado = mapper.map(t, ProductoEntity.class);
        return mapper.map(repository.save(grado), ProductoDto.class);

    }

    @Override

    public ProductoDto update(ProductoDto t, Long id) {

        ProductoEntity grado = repository.findById(id).get();
        mapper.map(t, grado);
        return mapper.map(repository.save(grado), ProductoDto.class);
    }

    @Override

    public ProductoDto delete(Long id) {

        // TODO Auto-generated method stub
        ProductoEntity grado = repository.findById(id).get();
        grado.setEstado(false);

        return mapper.map(repository.save(grado), ProductoDto.class);
    }

    @Override
    public ProductoDto enable(Long id) {

        ProductoEntity grado = repository.findById(id).get();
        grado.setEstado(true);

        return mapper.map(repository.save(grado), ProductoDto.class);

    }

}
