package com.springboot.rest.services;

import java.io.Serializable;
import java.util.List;

import com.springboot.rest.entities.Base;

/**
 * Interface base con todos los servicios básicos para cualquier
 * servicio.La implementación de sus métodos estarán definidas
 * en las impletacions de esta interface.
 * @author ricardo
 *
 */

public interface IBaseService<E extends Base,ID extends Serializable> {

	List<E> findAll() throws Exception;
	
	E findById(ID id) throws Exception;
	
	E save(E entity) throws Exception;
	
	E update(E entity,ID id) throws Exception;
	
	boolean delete(ID id) throws Exception;
}
