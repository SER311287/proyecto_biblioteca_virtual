package biblioteca.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.uspg.dao.IAdministradorDAO;
import biblioteca.uspg.model.Administrador;
import biblioteca.uspg.service.IAdministradorService;

@Service
public class AdministradorServiceImpl implements IAdministradorService {
    @Autowired
    private IAdministradorDAO dao;
    
    
	@Override
	public Administrador registrar(Administrador t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Administrador modificar(Administrador t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public Optional<Administrador> listarPorId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Administrador> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
