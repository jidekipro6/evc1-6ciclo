 
package raul.quijua.barrera.tiendita.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import raul.quijua.barrera.tiendita.dao.gestion.CategoriaDto;
import raul.quijua.barrera.tiendita.service.gestion.CategoriaService;
 

 

 @RestController
 @RequestMapping("/categoria")
public class CategoriRestController {
     @Autowired
     private CategoriaService servicio;
     @GetMapping 
     public List<CategoriaDto>funAll(){
     return servicio.findAll();
     }
     @GetMapping ("/custom")
     public List<CategoriaDto>findAllCustom(){
     return servicio.findAllCustom();
     }
     @GetMapping("/{id}")
     public CategoriaDto finById(@PathVariable long id){
     return servicio.findById(id);
     }
    @PostMapping 
    public CategoriaDto add(@RequestBody CategoriaDto s){
    return servicio.add(s);
    }
     @PutMapping("/{id}")
     public CategoriaDto update(@PathVariable long id,@RequestBody CategoriaDto s){
     return servicio.update(s,id);}
    
     @DeleteMapping("/{id}")
     public CategoriaDto delete(@PathVariable long id){
     return servicio.delete(id);}
     
     @PutMapping("/enable/{id}")
     public CategoriaDto enable(@PathVariable long id){
     return servicio.enable(id);}
    
}