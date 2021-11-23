package biblioteca.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.uspg.model.Administrador;

public interface IAdministradorDAO extends JpaRepository<Administrador,Integer> {

}
