package com.beeva.banco.BancoBeeva;


import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.BancoDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.ClienteDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.TipoCuentaDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

/**
 * @author Armando Duran Salavador
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ContextSing con= ContextSing.getInstance();
    	BancoDao bancoDao =(BancoDao) con.getContext().getBean(BancoDaoImpl.class);
    	TipoCuentaDao tipoCuentaDao=(TipoCuentaDao)con.getContext().getBean(TipoCuentaDaoImpl.class);
    	
    	//Creacion de Banco inicial y sus respectivos tipos de cuenta
    	Banco banco = new Banco();
    	banco.setNombre("Bancomer");
    	bancoDao.saveBanco(banco);
    	
    	TipoCuenta tipoCuentaAhorro =new TipoCuenta();
    	tipoCuentaAhorro.setNombre("Ahorro");
    	tipoCuentaDao.saveTipoCuenta(tipoCuentaAhorro);
    	
    	TipoCuenta tipoCuentaCheques =new TipoCuenta();
    	tipoCuentaCheques.setNombre("Cheques");
    	tipoCuentaDao.saveTipoCuenta(tipoCuentaCheques);
    }
}
