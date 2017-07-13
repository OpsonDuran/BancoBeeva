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
@Table(name="tipocuenta")
public class TipoCuenta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtipocuenta;
	private String nombre;	
	
	public int getIdtipocuenta() {
		return idtipocuenta;
	}
	public void setIdtipocuenta(int idtipocuenta) {
		this.idtipocuenta = idtipocuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
