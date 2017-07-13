package com.beeva.banco.BancoBeeva.dao;

import java.util.ArrayList;
import com.beeva.banco.BancoBeeva.entity.Banco;

/**
 * @author Armando Duran Salavador
 */

public abstract class BancoDao {
	public abstract Banco saveBanco(Banco banco);
	public abstract Banco removeBanco(int id);
	public abstract Banco updateBanco(int id);
	public abstract Banco getBanco(int Id);
	public abstract ArrayList<Banco> listBanco();

}
