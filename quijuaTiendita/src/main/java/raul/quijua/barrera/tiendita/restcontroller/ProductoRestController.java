 
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
import raul.quijua.barrera.tiendita.dao.gestion.ProductoDto;
import raul.quijua.barrera.tiendita.service.gestion.ProductoService;
 

 @RestController
 @RequestMapping("/producto")
public class ProductoRestController {
     @Autowired
     private ProductoService servicio;
     @GetMapping 
     public List<ProductoDto>funAll(){
     return servicio.findAll();}
     @GetMapping ("/custom")
     public List<ProductoDto>findAllCustom(){
     return servicio.findAllCustom();}
     @GetMapping("/{id}")
     public ProductoDto finById(@PathVariable long id){
     return servicio.findById(id);}
    @PostMapping 
    public ProductoDto add(@RequestBody ProductoDto g){
    return servicio.add(g);}
    
    @PutMapping("/{id}")
     public ProductoDto update(@PathVariable long id,@RequestBody ProductoDto g){
     return servicio.update(g,id);}
    
     @DeleteMapping("/{id}")
     public ProductoDto delete(@PathVariable long id){
     return servicio.delete(id);}
     
     @PutMapping("/enable/{id}")
     public ProductoDto enable(@PathVariable long id){
     return servicio.enable(id);}
}
