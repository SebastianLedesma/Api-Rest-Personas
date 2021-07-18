package com.springboot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.rest.entities.Base;
import com.springboot.rest.services.BaseServiceImpl;

public abstract class BaseControllerImpl<E extends Base,S extends BaseServiceImpl<E, Long>> implements IBaseController<E, Long> {

	@Autowired
	protected S service;
	
	
	@GetMapping("")
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.service.findAll());
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error:\":\"Error.Intente más tarde.\"}");
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.service.findById(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error:\":\"Error.Intente más tarde.\"}");
		}
	}
	
	
	@PostMapping("")
	public ResponseEntity<?> save(@RequestBody E entity){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.service.save(entity));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error:\":\"Error.Intente más tarde.\"}");
		}
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody E entity,@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.service.update(entity, id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error:\":\"Error.Intente más tarde.\"}");
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.service.delete(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error:\":\"Error.Intente más tarde.\"}");
		}
	}
}
