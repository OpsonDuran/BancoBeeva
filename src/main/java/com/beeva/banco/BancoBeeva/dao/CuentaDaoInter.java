package com.beeva.banco.BancoBeeva.dao;

import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

/** 
* @author Armando Duran Salavador
 */

public interface CuentaDaoInter {
	public boolean Deposito(Cuenta cuenta,double dinero);
	public boolean Retiro(Cuenta cuenta,double dinero);
}
