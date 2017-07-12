package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;

@Repository
public class TipoCuentaDaoImpl extends TipoCuentaDao{
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public TipoCuenta saveTipoCuenta(TipoCuenta tipoCuenta) {
		entityManager.persist(tipoCuenta);
		return tipoCuenta;
	}

	public TipoCuenta removeTipoCuenta(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public TipoCuenta updateTipoCuenta(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public TipoCuenta getTipoCuenta(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<TipoCuenta> listTipoCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
