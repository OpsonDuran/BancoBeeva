package com.beeva.banco.BancoBeeva.dao;

import java.util.List;
import com.beeva.banco.BancoBeeva.entity.Banco;

/**
 * @author Armando Duran Salavador
 */

public abstract class BancoDao {
	public abstract Banco saveBanco(Banco banco);
	public abstract void removeBanco(Banco banco);
	public abstract Banco updateBanco(Banco banco);
	public abstract Banco getBanco(int Id);
	public abstract List<Banco> listBanco();

}
