package com.springboot.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.entities.Autor;
import com.springboot.rest.repositories.IAutorRepository;
import com.springboot.rest.repositories.IBaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements IAutorService{

	@Autowired
	private IAutorRepository autorRepository;
	
	public AutorServiceImpl(IBaseRepository<Autor, Long> baseRepository) {
		super(baseRepository);
	}
}
