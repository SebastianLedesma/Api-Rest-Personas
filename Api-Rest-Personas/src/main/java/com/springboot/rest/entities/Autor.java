package com.springboot.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="autores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Autor extends Base{
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="biografia",length=1500)
	private String biografia;

}
