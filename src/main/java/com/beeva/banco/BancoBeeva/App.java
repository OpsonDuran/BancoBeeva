package com.beeva.banco.BancoBeeva;


import java.util.List;
import java.util.ListIterator;

import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.dao.BancosClientesDao;
import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.dao.CuentaDaoInter;
import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.BancoDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.BancosClientesDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.ClienteDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.TipoCuentaDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.BancosClientes;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.factory.CuentaFactory;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;
import com.beeva.banco.BancoBeeva.view.Formulario;

/**
 * @author Armando Duran Salavador
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ContextSing con= ContextSing.getInstance();
    	/*
    	ClienteDao clienteDao = (ClienteDao) con.getContext().getBean(ClienteDaoImpl.class);
    	Cliente cliente = new Cliente();
    	cliente.setNombre("Ahmed");
    	cliente.setApellido("Cisneros");
    	clienteDao.saveCliente(cliente);
    
    	
    	BancosClientesDao bancoClietesDao=(BancosClientesDao)con.getContext().getBean(BancosClientesDaoImpl.class);
    	BancosClientes bancosClientes= new BancosClientes();
    	bancosClientes.setIdBanco(10);
    	bancosClientes.setIdCliente(9);
    	bancoClietesDao.saveBancosCLientes(bancosClientes);
    	
    	TipoCuentaDao tipoCuentaDao=(TipoCuentaDao)con.getContext().getBean(TipoCuentaDaoImpl.class);
    	TipoCuenta tipoCuenta= new TipoCuenta();
    	tipoCuenta.setNombre("Ahorros");
    	tipoCuentaDao.saveTipoCuenta(tipoCuenta);
    	
    	TipoCuenta tipoCuenta2= new TipoCuenta();
    	tipoCuenta2.setNombre("Cheques");
    	tipoCuentaDao.saveTipoCuenta(tipoCuenta2);
    	  	 
    	BancoDao bancoDao =(BancoDao) con.getContext().getBean(BancoDaoImpl.class);
    	Banco banco= new Banco();
    	banco.setNombre("Banorte 2");
    	bancoDao.saveBanco(banco);
    	
    	Formulario ventana= new Formulario();
    	ventana.setVisible(true);
    	
    	*/
    	
    	CuentaDao cuentaDao = (CuentaDao)con.getContext().getBean(CuentaDaoImpl.class);
    	Cuenta cuenta = cuentaDao.getCuenta(2);
    	CuentaFactory cuentaFactory = new CuentaFactory();
        CuentaDaoInter cuentaDAO =  cuentaFactory.getImplements(cuenta);
    	cuentaDAO.Retiro(cuenta, 50);

    	
    	/*
    	CuentaDao cuentaDao = (CuentaDao)con.getContext().getBean(CuentaDaoImpl.class);
    	Cuenta cuenta = new Cuenta();
    	cuenta.setBalance(1000);
    	cuenta.setIdcliente(9);
    	cuenta.setIdTipoCuenta(5);
    	cuentaDao.saveCuenta(cuenta);
    	*/
    }
}
