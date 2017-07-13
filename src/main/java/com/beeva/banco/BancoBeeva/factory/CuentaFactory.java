package com.beeva.banco.BancoBeeva.factory;

import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaAhorroDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaChequesDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Cuenta;

/**
 * @author Armando Duran Salavador
 */

public class CuentaFactory {
	
	/*Retorna la implementacion adecuada segun el tipo de Cuenta */
	public CuentaDao getImplements(Cuenta cuenta){
		if(cuenta.getIdTipoCuenta()==1){
			CuentaDao account = new CuentaAhorroDaoImpl();
			return account ;
		}else{
			CuentaDao account = new CuentaChequesDaoImpl();
			return account;
		}
	}


}
