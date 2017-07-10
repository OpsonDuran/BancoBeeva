package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;

public class CuentaChequesDaoImpl extends CuentaDao{

	@Override
	public boolean Deposito(Cliente cliente, double dinero) {
		return false;
	}

	@Override
	public boolean Retiro(Cliente cliente, double dinero) {
		return false;
	}

	@Override
	public Cuenta saveCuenta(Cuenta cuenta) {
		return null;
	}

	@Override
	public Cuenta removeCuenta(int Id) {
		return null;
	}

	@Override
	public Cuenta updateCuenta(int Id) {
		return null;
	}

	@Override
	public ArrayList<Cuenta> listCuenta() {
		return null;
	}

}
