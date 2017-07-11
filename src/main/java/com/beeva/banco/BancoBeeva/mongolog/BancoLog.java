package com.beeva.banco.BancoBeeva.mongolog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date; 

import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class BancoLog {
	
	public void clienteLog(Cliente cliente){

		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancoapplog");
		DBCollection table = db.getCollection("logcollections");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("idCliente",cliente.getIdCliente());
		document.put("nombre",cliente.getNombre());
		document.put("apellido",cliente.getApellido());
		table.insert(document);
	}
	
	public void bancoLog(Banco banco){

		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancoapplog");
		DBCollection table = db.getCollection("logcollections");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("idBanco",banco.getIdBanco());
		document.put("nombre",banco.getNombre());
		table.insert(document);
	}
	public void CuentaLog(Cuenta cuenta){

		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancoapplog");
		DBCollection table = db.getCollection("logcollections");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("idCuenta",cuenta.getIdCuenta());
		document.put("idTipoCuenta",cuenta.getTipoCuenta());
		document.put("idCliente",cuenta.getIdCliente());
		document.put("balance",cuenta.getBalance());
		table.insert(document);
	}
	
}
