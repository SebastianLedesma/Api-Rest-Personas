package com.springboot.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.rest.entities.Persona;

@Repository
public interface IPersonaRepository extends IBaseRepository<Persona, Long>{

	@Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
	List<Persona> search(@Param("filtro") String filtro);
}
