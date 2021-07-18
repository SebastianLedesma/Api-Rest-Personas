package com.springboot.rest.services;

import java.util.List;

import com.springboot.rest.entities.Persona;

/**
 * Métodos propios del service Persona.
 * @author ricardo
 *
 */
public interface IPersonaService extends IBaseService<Persona,Long>{

	List<Persona> search(String filtro) throws Exception;
}
