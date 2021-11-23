package biblioteca.uspg.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
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

import biblioteca.uspg.exception.ModeloNotFoundException;
import biblioteca.uspg.model.Administrador;
import biblioteca.uspg.service.IAdministradorService;
 

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	private IAdministradorService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Administrador>> listar(){ 
		return new ResponseEntity<List<Administrador>>(service.listar(), HttpStatus.OK); 
	 }

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public EntityModel<Administrador> listarPorId(@PathVariable("id") Integer id){ 
		Optional<Administrador> administrador = service.listarPorId(id);
		
		if(!administrador.isPresent()) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		
		EntityModel<Administrador> resource = EntityModel.of(administrador.get());
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).listarPorId(id));
		
		resource.add(linkTo.withRel("alumno-resource"));
		//return service.listarPorId(id);
		return resource;
	}
	
	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Object> registrar(@RequestBody @Valid Administrador admin) { 
		Administrador administrador = service.registrar(admin);
						
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(administrador.getId_administrador()).toUri();
		
		
		return ResponseEntity.created(location).build();		
		//return service.registrar(alu); 
	}	
	
	
	@PutMapping( produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) 
	 public  ResponseEntity<Object> modificar(@RequestBody Administrador admin) { 
		 Optional<Administrador> administrador = service.listarPorId(admin.getId_administrador());
		 if(!administrador.isPresent()) {
			 throw new ModeloNotFoundException("ID NO ENCONTRADO: " + admin.getId_administrador());
		 }else {
			 service.modificar(admin);
		 }
		 return new ResponseEntity<Object>(HttpStatus.OK);
		 
		 //return service.modificar(alumno); 
	}
	
	@DeleteMapping(value = "/{id}") 
	 public void eliminar(@PathVariable("id") Integer id) {
		 Optional<Administrador> administrador = service.listarPorId(id);
		 if(!administrador.isPresent()) {
			 throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		 } else {
			 service.eliminar(id); 
		 }
		 
	 }
	
}
