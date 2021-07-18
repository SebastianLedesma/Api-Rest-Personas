package com.springboot.rest.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="libros")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base{

	@Column(name="titulo")
	private String titulo;
	
	@Column(name="fecha")
	private int fecha;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="paginas")
	private int paginas;
	
	/**
	 * Si ocurre un cambio en un libro se verá reflejado
	 * en la tabla autor.
	 */
	@ManyToMany(cascade=CascadeType.REFRESH)
	private List<Autor> autores = new ArrayList<>();
}
