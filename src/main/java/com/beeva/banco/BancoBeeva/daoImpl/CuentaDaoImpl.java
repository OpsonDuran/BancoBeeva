package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

/** 
* @author Armando Duran Salavador
 */

@Repository
public class CuentaDaoImpl extends CuentaDao {
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public Cuenta saveCuenta(Cuenta cuenta) {
		entityManager.persist(cuenta);
		log.ObjectLog(cuenta, "save");
		return cuenta;
	}

	public Cuenta removeCuenta(int Id) {
		return null;
	}
	@Transactional
	public Cuenta updateCuenta(Cuenta cuenta) {
		entityManager.merge(cuenta);
		log.ObjectLog(cuenta, "update");
		return cuenta;
	}

	public ArrayList<Cuenta> listCuenta() {
		return null;
	}

	@Override
	public Cuenta getCuenta(int Id) {
		return entityManager.find(Cuenta.class, Id);
	}
}