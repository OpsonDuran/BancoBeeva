package com.beeva.banco.BancoBeeva.dao;

import java.util.ArrayList;

import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.Cuenta;

/**
 * @author Armando Duran Salavador
 */

public abstract class CuentaDao {

	public abstract Cuenta saveCuenta(Cuenta cuenta);
	public abstract Cuenta removeCuenta(int Id);
	public abstract Cuenta updateCuenta(Cuenta cuenta);
	public abstract Cuenta getCuenta(int Id);
	public abstract ArrayList<Cuenta> listCuenta();
	

}
