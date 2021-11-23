package biblioteca.uspg.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import biblioteca.uspg.dao.ISolicitudLibroDAO;
import biblioteca.uspg.model.SolicitudLibro;
import biblioteca.uspg.service.ISolicitudLibroService;

public class SolicitudLibroServiceImpl implements ISolicitudLibroService{
	@Autowired
	private ISolicitudLibroDAO  dao;
	
	@Override
	public SolicitudLibro registrar(SolicitudLibro t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public SolicitudLibro modificar(SolicitudLibro t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);;
		
	}

	@Override
	public Optional<SolicitudLibro> listarPorId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<SolicitudLibro> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
