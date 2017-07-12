package com.beeva.banco.BancoBeeva.dao;

import java.util.ArrayList;
/**
 * @author Armando Duran Salavdor
 *
 */

import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
public abstract class CuentaDao {

	public abstract boolean Deposito(Cliente cliente,double dinero);
	public abstract boolean Retiro(Cliente cliente,double dinero);
	public abstract Cuenta saveCuenta(Cuenta cuenta);
	public abstract Cuenta removeCuenta(int Id);
	public abstract Cuenta updateCuenta(int Id);
	public abstract ArrayList<Cuenta> listCuenta();
	

}
