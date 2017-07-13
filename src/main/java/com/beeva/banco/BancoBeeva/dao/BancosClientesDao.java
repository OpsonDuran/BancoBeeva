package com.beeva.banco.BancoBeeva.dao;

import java.util.ArrayList;

import com.beeva.banco.BancoBeeva.entity.BancosClientes;

/**
 * @author Armando Duran Salavador
 */

public abstract class BancosClientesDao {
	public abstract BancosClientes saveBancosCLientes(BancosClientes bancosClientes);
	public abstract BancosClientes removeBancosClientes(int id);
	public abstract BancosClientes updateBancosClientes(int id);
	public abstract BancosClientes getBancosClientes(int Id);
	public abstract ArrayList<BancosClientes> listBancosClientes();

}
