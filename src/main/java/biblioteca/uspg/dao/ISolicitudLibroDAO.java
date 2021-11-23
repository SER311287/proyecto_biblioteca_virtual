package biblioteca.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.uspg.model.SolicitudLibro;

public interface ISolicitudLibroDAO extends JpaRepository<SolicitudLibro,Integer> {

}
