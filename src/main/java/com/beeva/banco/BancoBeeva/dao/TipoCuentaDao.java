package com.beeva.banco.BancoBeeva.dao;

import java.util.List;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;

/**
 * @author Armando Duran Salavador
 */


public abstract class TipoCuentaDao {
	public abstract TipoCuenta saveTipoCuenta(TipoCuenta tipoCuenta);
	public abstract TipoCuenta getTipoCuenta(int Id);
	public abstract List<TipoCuenta> listTipoCuenta();

}
