package biblioteca.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import biblioteca.uspg.dao.ISolicitudUsuarioDAO;
import biblioteca.uspg.model.SolicitudUsuario;
import biblioteca.uspg.service.ISolicitudUsuarioService;

public class SolicitudUsuarioServiceImpl implements ISolicitudUsuarioService {
	
	@Autowired	
	private ISolicitudUsuarioDAO dao;
	
	
	@Override
	public SolicitudUsuario registrar(SolicitudUsuario t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public SolicitudUsuario modificar(SolicitudUsuario t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public Optional<SolicitudUsuario> listarPorId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<SolicitudUsuario> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
