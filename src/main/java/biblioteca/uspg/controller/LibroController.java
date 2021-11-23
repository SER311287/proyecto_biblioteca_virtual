package biblioteca.uspg.controller;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import biblioteca.uspg.model.Libro;
import biblioteca.uspg.service.ILibroService;
import biblioteca.uspg.exception.ModeloNotFoundException;

@RestController
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private ILibroService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Libro>> listar(){ 
	try {return new ResponseEntity<List<Libro>>(service.listar(), HttpStatus.OK);
	}catch (Exception e) { 
		
	}	
	return null;
		 
	 }
	
	@GetMapping(value="/filtrar-isbn/{isbn}",produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<Libro>>buscarPorIsbn(@PathVariable("isbn") String isbn){
		List<Libro> consulta = new ArrayList<>();
		consulta = service.buscarPorIsbn(isbn);
		 return new ResponseEntity<List<Libro>>(consulta, HttpStatus.OK);
		 
	}
	
	
	

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public EntityModel<Libro> listarPorId(@PathVariable("id") Integer id){ 
		Optional<Libro> libro = service.listarPorId(id);
		
		if(!libro.isPresent()) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		
		EntityModel<Libro> resource = EntityModel.of(libro.get());
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).listarPorId(id));
		
		resource.add(linkTo.withRel("libro-resource"));
		//return service.listarPorId(id);
		return resource;
	}
	
	
	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Object> registrar(@RequestBody @Valid Libro libr) { 
		Libro libro = service.registrar(libr);
						
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(libro.getId_libro()).toUri();
		
		
		return ResponseEntity.created(location).build();		
		//return service.registrar(alu); 
	}		
	
	
	@PutMapping( produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) 
	 public  ResponseEntity<Object> modificar(@RequestBody Libro libr) { 
		 Optional<Libro> libro = service.listarPorId(libr.getId_libro());
		 if(!libro.isPresent()) {
			 throw new ModeloNotFoundException("ID NO ENCONTRADO: " + libr.getId_libro());
		 }else {
			 service.modificar(libr);
		 }
		 return new ResponseEntity<Object>(HttpStatus.OK);
		 
		 //return service.modificar(alumno); 
	}
	
	@DeleteMapping(value = "/{id}") 
	 public void eliminar(@PathVariable("id") Integer id) {
		 Optional<Libro> libro = service.listarPorId(id);
		 if(!libro.isPresent()) {
			 throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		 } else {
			 service.eliminar(id); 
		 }
		 
	 }
	

}
