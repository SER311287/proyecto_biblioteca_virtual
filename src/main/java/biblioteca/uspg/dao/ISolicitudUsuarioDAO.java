package biblioteca.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.uspg.model.SolicitudUsuario;

public interface ISolicitudUsuarioDAO extends JpaRepository<SolicitudUsuario,Integer> {

}
