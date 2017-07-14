package com.beeva.banco.BancoBeeva.factory;

import com.beeva.banco.BancoBeeva.dao.CuentaDaoInter;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDAOImplAhorro;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDAOImplCheque;
import com.beeva.banco.BancoBeeva.entity.Cuenta;

/**
 * @author Armando Duran Salavador
 */

public class CuentaFactory {
	
	/*Retorna la implementacion adecuada segun el tipo de Cuenta */
	public CuentaDaoInter getImplements(Cuenta cuenta){
		if(cuenta.getIdTipoCuenta()==4){
			CuentaDaoInter account = new CuentaDAOImplAhorro();
			return account;
		}else{
			CuentaDaoInter account = new CuentaDAOImplCheque();
			return account;
		}
	}


}
