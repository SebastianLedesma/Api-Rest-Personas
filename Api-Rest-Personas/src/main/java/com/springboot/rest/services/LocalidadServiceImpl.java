package com.springboot.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.entities.Localidad;
import com.springboot.rest.repositories.IBaseRepository;
import com.springboot.rest.repositories.ILocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements ILocalidadService{

	@Autowired
	private ILocalidadRepository localidadRepo;
	
	public LocalidadServiceImpl(IBaseRepository<Localidad, Long> baseRepository) {
		super(baseRepository);
	}

	
}
