package cl.coopeuch.models.service;

import java.util.List;

import cl.coopeuch.models.entity.Tarea;


public interface ITareaService {
	
	public List<Tarea> findAll();
	public Tarea findById(Long id);

}
