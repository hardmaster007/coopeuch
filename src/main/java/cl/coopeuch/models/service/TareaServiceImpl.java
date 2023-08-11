package cl.coopeuch.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import cl.coopeuch.models.dao.TareaDao;
import cl.coopeuch.models.entity.Tarea;

@Service
public class TareaServiceImpl implements ITareaService{
	
	@Autowired
	private TareaDao tareaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Tarea> findAll() {
		return (List<Tarea>) tareaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Tarea findById(Long id) {
		return tareaDao.findById(id).orElse(null);
	}

}
