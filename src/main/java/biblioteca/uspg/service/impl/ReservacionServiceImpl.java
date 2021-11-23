package biblioteca.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import biblioteca.uspg.dao.IReservacionDAO;
import biblioteca.uspg.model.Reservacion;
import biblioteca.uspg.service.IReservacionService;

public class ReservacionServiceImpl implements IReservacionService{
	@Autowired
	private IReservacionDAO dao;
	
	@Override
	public Reservacion registrar(Reservacion t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Reservacion modificar(Reservacion t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public Optional<Reservacion> listarPorId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Reservacion> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
