package com.beeva.banco.BancoBeeva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.BancoDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.ClienteDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaChequesDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.TipoCuentaDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.factory.CuentaFactory;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * @author Armando Duran Salavdor
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ContextSing con= ContextSing.getInstance();
    	Banco banco = new Banco();
    	BancoDao bancoDao =(BancoDao) con.getContext().getBean(BancoDaoImpl.class);
    	banco.setNombre("Bankote");
    	int id=bancoDao.saveBanco(banco).getIdBanco();
    	String nombre=bancoDao.getBanco(id).getNombre();
    	int ids=bancoDao.getBanco(id).getIdBanco();
    	System.out.println("id: "+ids+" : "+nombre);
    	
    	Cliente cliente= new Cliente();
    	ClienteDao clienteDao=(ClienteDao) con.getContext().getBean(ClienteDaoImpl.class);
    	cliente.setNombre("Jose");
    	cliente.setApellido("Larios");
    	clienteDao.saveCliente(cliente);
    	/*
    	TipoCuenta tipoCuenta =new TipoCuenta();
    	TipoCuentaDao tipoDao=(TipoCuentaDao)context.getBean(TipoCuentaDaoImpl.class);
    	tipoCuenta.setNombre("Debito");
    	int idtc= tipoDao.saveTipoCuenta(tipoCuenta).getIdtipocuenta();
    	/*
    	Cuenta cuenta= new Cuenta();
    	CuentaDao cuentaDao=(CuentaDao)context.getBean(CuentaChequesDaoImpl.class);
    	cuenta.setBalance(10000);
    	cuenta.setIdCliente(ids);
    	cuenta.setIdTipoCuenta(idtc);
    	cuentaDao.saveCuenta(cuenta);
    	*/
    }
}
