package com.beeva.banco.BancoBeeva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.daoImpl.BancoDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.ClienteDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.Cliente;
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
    	ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
    	Banco banco = new Banco();
    	BancoDao bancoDao =(BancoDao) context.getBean(BancoDaoImpl.class);
    	banco.setNombre("Bank");
    	int id=bancoDao.saveBanco(banco).getIdBanco();
    	String nombre=bancoDao.getBanco(id).getNombre();
    	int ids=bancoDao.getBanco(id).getIdBanco();
    	System.out.println("id: "+ids+" : "+nombre);
    	/*
    	Cliente cliente= new Cliente();
    	ClienteDao clienteDao=(ClienteDao) context.getBean(ClienteDaoImpl.class);
    	cliente.setNombre("Hector");
    	cliente.setApellido("Duran");
    	cliente.setIdCliente(4);
    	clienteDao.saveCliente(cliente);*/
    }
}
