package biblioteca.uspg.service;


import java.util.List;

import biblioteca.uspg.model.Libro;

//diferentes metodos


public interface ILibroService extends ICRUD<Libro>{
	
	List<Libro> buscarPorIsbn(String isbn);
	
	

}
