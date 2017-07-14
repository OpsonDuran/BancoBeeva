package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.Calendar;

import com.beeva.banco.BancoBeeva.dao.CuentaDaoInter;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

/** 
* @author Armando Duran Salavador
 */

public class CuentaDAOImplCheque implements CuentaDaoInter{
	
	//inicializa calendario y se asigna arreglo de los dias
	
	Calendar now = Calendar.getInstance();
	String[] strDays = new String[]{"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
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
		if(strDays[now.get(Calendar.DAY_OF_WEEK) - 1]!="Sabado" && strDays[now.get(Calendar.DAY_OF_WEEK) - 1]!="Domingo"){
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
