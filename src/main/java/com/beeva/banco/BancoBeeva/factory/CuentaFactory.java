package com.beeva.banco.BancoBeeva.factory;

import org.springframework.context.ApplicationContext;
import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

/**
 * @author Armando Duran Salavador
 */

public class CuentaFactory {
	
	/*Retorna la implementacion adecuada segun el tipo de Cuenta */
	public CuentaDao getImplements(Cuenta cuenta ){

    	ContextSing con= ContextSing.getInstance();
		CuentaDao account =(CuentaDao)con.getContext().getBean(CuentaDaoImpl.class);
		if(cuenta.getIdTipoCuenta()==1){
			return account ;
		}else{
			return account;
		}
	}


}
