package com.beeva.banco.BancoBeeva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Armando Duran Salavador
 */

@Entity
@Table(name="bancosclientes")
public class BancosClientes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idbancosclientes")
	private int idBancosClientes;
	@Column(name="idbanco")
	private int idBanco;
	@Column(name="idcliente")
	private int idCliente;
	
	
	public int getIdBancosClientes() {
		return idBancosClientes;
	}
	public void setIdBancosClientes(int idBancosClientes) {
		this.idBancosClientes = idBancosClientes;
	}
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
