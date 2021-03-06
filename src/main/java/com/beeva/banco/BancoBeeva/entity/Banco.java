package com.beeva.banco.BancoBeeva.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Armando Duran Salavador
 */

@Entity
@Table(name="banco")
public class Banco {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBanco;
	private String nombre;
	
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
