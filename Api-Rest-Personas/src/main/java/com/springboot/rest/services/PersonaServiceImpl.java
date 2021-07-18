package com.springboot.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.entities.Persona;
import com.springboot.rest.repositories.IBaseRepository;
import com.springboot.rest.repositories.IPersonaRepository;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements IPersonaService{

	@Autowired
	private IPersonaRepository personaRepo;

	public PersonaServiceImpl(IBaseRepository<Persona, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Persona> search(String filtro) throws Exception {
		try {
			List<Persona> listaPersonas = this.personaRepo.search(filtro);
			return listaPersonas;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

}
