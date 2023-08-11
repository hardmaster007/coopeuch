package cl.coopeuch.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.coopeuch.models.entity.Tarea;

public interface TareaDao extends CrudRepository<Tarea, Long> {

}
