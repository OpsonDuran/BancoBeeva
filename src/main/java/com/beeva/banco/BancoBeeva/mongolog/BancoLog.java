package com.beeva.banco.BancoBeeva.mongolog;


import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Date; 
import com.beeva.banco.BancoBeeva.singleton.ContextSing;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * @author Armando Duran Salavador
 */

public class BancoLog {
	
	/* inserta  el objeto en Mongobd */
	public void ObjectLog(Object clase,String operacion){
		ContextSing con= ContextSing.getInstance();
		MongoClient mongo =(MongoClient)con.getContext().getBean("logbanco");
	    DB db= mongo.getDB("bancolog");
		DBCollection table = db.getCollection("logcollection");
		
		try {
			table.insert(introspectInstance(operacion,clase,new PrintWriter(System.out)));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/* hace una intrsopecion del objeto retornando un BasicDBObject */
	private static BasicDBObject introspectInstance(String operacion,Object anObject, PrintWriter printer) throws IllegalArgumentException, IllegalAccessException {

		BasicDBObject document = new BasicDBObject();
		 Class objectType = anObject.getClass();
		 document.put("Mensaje",operacion);
		 document.put("tipo",objectType.getSimpleName());
		 document.put("fecha",new Date());
		 printer.println(operacion+" " + objectType.getSimpleName() + " ");
		 for (Field field : objectType.getDeclaredFields()) {
		 field.setAccessible(true);
		 printer.print("\tcon ");
		 printer.print(field.getName()+" = ");
		 printer.println(field.get(anObject));
		 document.put(field.getName(), field.get(anObject));
		 }
		 printer.flush();
		 return document;
		}
	
}
