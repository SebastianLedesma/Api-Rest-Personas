package com.springboot.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="domicilios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{

	@Column(name="calle")
	private String calle;
	
	@Column(name="numero")
	private int numero;
	
	/**
	 * Con esta annotation si agrego una persona esta debe
	 * tener un domicilio.
	 */
	@ManyToOne(optional=false)
	@JoinColumn(name="fk_localidad")
	private Localidad localidad;
}
