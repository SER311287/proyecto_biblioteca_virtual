package biblioteca.uspg.dao;
//acceso a datos 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import biblioteca.uspg.model.Libro;

public interface ILibroDAO extends JpaRepository<Libro, Integer> {
	
	@Query(value = "select* from  biblioteca_virtual.buscar_isbn(:numero_isbn)", nativeQuery = true)
	List<Object[]> buscarPorIsbn(@Param("numero_isbn") String isbn);

	 
}
