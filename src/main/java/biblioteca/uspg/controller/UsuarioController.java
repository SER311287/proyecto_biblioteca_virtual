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

import biblioteca.uspg.exception.ModeloNotFoundException;
import biblioteca.uspg.model.Libro;
import biblioteca.uspg.model.Usuario;
import biblioteca.uspg.service.ILibroService;
import biblioteca.uspg.service.IUsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	/*@GetMapping(value="/filtrar-nombre/{nombre}",produces = MediaType.APPLICATION_JSON_VALUE )
	public  ResponseEntity<List<Usuario>>buscarDetallesReservacion(@Param("nombre") String nombre);{
		List<Usuario> consulta= new ArrayList<>();
		consulta = service.buscarDetallesReservacion(nombre);
		 return new ResponseEntity<<List<Usuario>>(consulta, HttpStatus.OK);
		
	}*/

}
