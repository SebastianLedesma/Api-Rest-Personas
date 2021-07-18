package com.springboot.rest.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.springboot.rest.entities.Base;
import com.springboot.rest.repositories.IBaseRepository;

public abstract class BaseServiceImpl<E extends Base,ID extends Serializable> implements IBaseService<E, ID>{

	protected IBaseRepository<E, ID> baseRepository;

	public BaseServiceImpl(IBaseRepository<E, ID> baseRepository) {
		this.baseRepository = baseRepository;
	}
	
	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			List<E> lista = this.baseRepository.findAll();
			return lista;
		} catch (Exception ex) {
			throw new Exception();
		}
	}

	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			Optional<E> entityPersona = this.baseRepository.findById(id);
			return entityPersona.get();
		} catch (Exception ex) {
			throw new Exception();
		}
	}

	
	@Transactional
	@Override
	public E save(E entity) throws Exception {
		try {
			entity = this.baseRepository.save(entity);
			return entity;
		} catch (Exception ex) {
			throw new Exception();
		}
	}

	
	@Transactional
	@Override
	public E update(E entity, ID id) throws Exception {
		try {
			Optional<E> entityOptional = this.baseRepository.findById(id);
			E entityUpdate = entityOptional.get();
			entityUpdate = this.baseRepository.save(entity);
			return entityUpdate;
		} catch (Exception ex) {
			throw new Exception();
		}
	}

	@Transactional
	@Override
	public boolean delete(ID id) throws Exception {
		try {
			if(this.baseRepository.existsById(id)) {
				this.baseRepository.deleteById(id);
				return true;
			}else {
				throw new Exception();
			}
		} catch (Exception ex) {
			throw new Exception();
		}
	}
	
}
