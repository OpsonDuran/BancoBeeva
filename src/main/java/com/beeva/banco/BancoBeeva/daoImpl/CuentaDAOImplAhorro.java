package com.beeva.banco.BancoBeeva.daoImpl;

import com.beeva.banco.BancoBeeva.dao.CuentaDaoInter;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

/** 
* @author Armando Duran Salavador
 */

public class CuentaDAOImplAhorro implements CuentaDaoInter{
	private double nuevoVal;
	private BancoLog log= new BancoLog();
	public boolean Deposito(Cuenta cuenta, double dinero) {
		nuevoVal = cuenta.getBalance()+dinero;
		cuenta.setBalance(nuevoVal);
		ContextSing con= ContextSing.getInstance();
    	con.getContext().getBean(CuentaDaoImpl.class).updateCuenta(cuenta);
		return true;
	}

	public boolean Retiro(Cuenta cuenta, double dinero) {
		if(cuenta.getBalance()>5000){
			nuevoVal = cuenta.getBalance()-dinero;
			cuenta.setBalance(nuevoVal);
			ContextSing con= ContextSing.getInstance();
	    	con.getContext().getBean(CuentaDaoImpl.class).updateCuenta(cuenta);
			return true;
		}else{	
			log.ObjectLog(cuenta, "No se pudo retirar");
		return false;
		}
	}
	
	

}
