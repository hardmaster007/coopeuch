package cl.coopeuch.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.coopeuch.models.dao.TareaDao;
import cl.coopeuch.models.entity.Tarea;
import cl.coopeuch.models.service.ITareaService;



@RestController
public class TareaController {
	
	private List<TareaDao> tareas = new ArrayList<>();
	
	@Autowired
	private ITareaService tareaService;
	
	@GetMapping("/listar")
	public List<Tarea> listar(){
		return tareaService.findAll().stream().map(tarea ->{
			return tarea;
		}).collect(Collectors.toList());
	}

	
	@GetMapping("/ver/{id}")
	public Tarea detalle(@PathVariable Long id) {
		Tarea tarea = tareaService.findById(id);
		return tarea;
	}
	
	
	@PostMapping(value = "tareas")
	public ResponseEntity<TareaDao> create(TareaDao request){
		tareas.add(request);
		return ResponseEntity.ok(request);
	}
	
}
