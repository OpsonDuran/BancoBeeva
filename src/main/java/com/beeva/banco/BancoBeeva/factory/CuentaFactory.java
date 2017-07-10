package com.beeva.banco.BancoBeeva.factory;

import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaAhorroDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaChequesDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Cuenta;


public class CuentaFactory {
	public CuentaDao getImplements(Cuenta cuenta){
		if(cuenta.getTipoCuenta()==1){
			CuentaDao account = new CuentaAhorroDaoImpl();
			return account ;
		}else{
			CuentaDao account = new CuentaChequesDaoImpl();
			return account;
		}
	}


}
