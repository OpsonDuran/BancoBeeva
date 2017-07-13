package com.beeva.banco.BancoBeeva.dao;

import java.util.ArrayList;

import com.beeva.banco.BancoBeeva.entity.TipoCuenta;

/**
 * @author Armando Duran Salavador
 */


public abstract class TipoCuentaDao {
	public abstract TipoCuenta saveTipoCuenta(TipoCuenta tipoCuenta);
	public abstract TipoCuenta removeTipoCuenta(int id);
	public abstract TipoCuenta updateTipoCuenta(int id);
	public abstract TipoCuenta getTipoCuenta(int Id);
	public abstract ArrayList<TipoCuenta> listTipoCuenta();

}
