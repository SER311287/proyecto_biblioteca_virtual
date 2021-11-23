package biblioteca.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.uspg.model.Reservacion;

public interface IReservacionDAO extends JpaRepository<Reservacion,Integer> {

}
