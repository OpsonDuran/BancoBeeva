package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

@Repository
public class TipoCuentaDaoImpl extends TipoCuentaDao{
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public TipoCuenta saveTipoCuenta(TipoCuenta tipoCuenta) {
		entityManager.persist(tipoCuenta);
		log.TipoCuentaLog(tipoCuenta);
		return tipoCuenta;
	}

	public TipoCuenta removeTipoCuenta(int id) {
		return null;
	}
	
	public TipoCuenta updateTipoCuenta(int id) {
		return null;
	}

	public TipoCuenta getTipoCuenta(int Id) {
		return null;
	}

	public ArrayList<TipoCuenta> listTipoCuenta() {
		return null;
	}

}
