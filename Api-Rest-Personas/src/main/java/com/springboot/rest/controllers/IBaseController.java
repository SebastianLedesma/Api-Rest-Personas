package com.springboot.rest.controllers;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.rest.entities.Base;

/**
 * Métodos base para cualquier controlador.
 * @author ricardo
 *
 * @param <E>Tipo de dato entity.Ej.Persona
 * @param <ID>Tipo de dato del id del entity.Ej:Long,Integer.
 */

public interface IBaseController<E extends Base,ID extends Serializable> {

	ResponseEntity<?> getAll();
	
	ResponseEntity<?> getOne(@PathVariable ID id);
	
	ResponseEntity<?> save(@RequestBody E entity);
	
	ResponseEntity<?> update(@RequestBody E entity,@PathVariable ID id);
	
	ResponseEntity<?> delete(@PathVariable ID id);
}
