package com.beeva.banco.BancoBeeva.mongolog;

import org.hibernate.type.descriptor.java.UUIDTypeDescriptor.ToStringTransformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Date; 

import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.BancosClientes;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class BancoLog {
	
	public void clienteLog(Cliente cliente){
		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancolog");
		DBCollection table = db.getCollection("logcollection");
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
	    DB db= mongo.getDB("bancolog");
		DBCollection table = db.getCollection("logcollection");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("idBanco",banco.getIdBanco());
		document.put("nombre",banco.getNombre());
		table.insert(document);
	}
	public void bancosClientesLog(BancosClientes bancoClientes){
		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancolog");
		DBCollection table = db.getCollection("logcollection");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("Id Registro", bancoClientes.getIdBancosClientes());
		document.put("idBanco",bancoClientes.getIdBanco());
		document.put("idCliente",bancoClientes.getIdCliente());
		table.insert(document);
	}
	public void CuentaLog(Cuenta cuenta){
		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancolog");
		DBCollection table = db.getCollection("logcollection");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("idCuenta",cuenta.getIdCuenta());
		document.put("idTipoCuenta",cuenta.getIdTipoCuenta());
		document.put("idCliente",cuenta.getIdCliente());
		document.put("balance",cuenta.getBalance());
		table.insert(document);
	}
	
	public void TipoCuentaLog(TipoCuenta tipoCuenta){
		ApplicationContext context= new ClassPathXmlApplicationContext("core-context.xml");
		MongoClient mongo =(MongoClient)context.getBean("logbanco");
	    DB db= mongo.getDB("bancolog");
		DBCollection table = db.getCollection("logcollection");
		BasicDBObject document = new BasicDBObject();
		document.put("Mensaje","se agrego");
		document.put("fecha",new Date());
		document.put("idCuenta",tipoCuenta.getIdtipocuenta());
		document.put("nombre",tipoCuenta.getNombre());
		table.insert(document);
	}
	
	private static BasicDBObject introspectInstance(Object anObject, PrintWriter printer) throws IllegalArgumentException, IllegalAccessException {

		BasicDBObject document = new BasicDBObject();
		 Class objectType = anObject.getClass();
		 document.put("Mensaje","se agrego");
		 document.put("tipo","objectType.getSimpleName()");
		 document.put("fecha",new Date());
		 printer.println("Un " + objectType.getSimpleName() + "");
		 for (Field field : objectType.getDeclaredFields()) {
		 field.setAccessible(true);
		 printer.print("\tcon ");
		 printer.print(field.getName());
		 printer.println(field.get(anObject));
		 document.put(field.getName(), field.get(anObject));
		 }
		 printer.flush();
		 return document;
		}
	
}
