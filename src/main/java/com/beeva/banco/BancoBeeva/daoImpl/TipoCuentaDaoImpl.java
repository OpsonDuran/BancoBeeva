package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

/**
 * @author Armando Duran Salavador
 */

@Repository
public class TipoCuentaDaoImpl extends TipoCuentaDao{
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public TipoCuenta saveTipoCuenta(TipoCuenta tipoCuenta) {
		entityManager.persist(tipoCuenta);
		log.ObjectLog(tipoCuenta ,"Se guardo");
		return tipoCuenta;
	}
	@Transactional
	public TipoCuenta getTipoCuenta(int Id) {
		TipoCuenta consulta = entityManager.find(TipoCuenta.class, Id);
		log.ObjectLog(consulta ,"Se consulto");
		return consulta;
	}
    @Transactional
	public List<TipoCuenta> listTipoCuenta() {
    	List<TipoCuenta> list= entityManager.createQuery("from TipoCuenta").getResultList();
    	return list;
	}

}
