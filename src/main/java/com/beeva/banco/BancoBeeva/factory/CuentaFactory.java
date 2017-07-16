package com.beeva.banco.BancoBeeva.factory;

import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.dao.CuentaDaoInter;
import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDAOImplAhorro;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDAOImplCheque;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.TipoCuentaDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

/**
 * @author Armando Duran Salavador
 */

public class CuentaFactory {
	
	/*Retorna la implementacion adecuada segun el tipo de Cuenta */
	public CuentaDaoInter getImplements(Cuenta cuenta){
		ContextSing con= ContextSing.getInstance();
		TipoCuentaDao cuentaDao = (TipoCuentaDao)con.getContext().getBean(TipoCuentaDaoImpl.class);
    	TipoCuenta tipcuenta = cuentaDao.getTipoCuenta(cuenta.getIdTipoCuenta());
    	
		if(tipcuenta.getNombre().equals("Ahorros")){
			CuentaDaoInter account = new CuentaDAOImplAhorro();
			return account;
		}else{
			CuentaDaoInter account = new CuentaDAOImplCheque();
			return account;
		}
	}


}
