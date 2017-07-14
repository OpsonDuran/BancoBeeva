package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.BancosClientesDao;
import com.beeva.banco.BancoBeeva.entity.BancosClientes;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

/**
 * @author Armando Duran Salavador
 */

@Repository
public class BancosClientesDaoImpl extends BancosClientesDao {
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public BancosClientes saveBancosCLientes(BancosClientes bancosClientes) {
		entityManager.persist(bancosClientes);
		log.ObjectLog(bancosClientes,"Se guardo");
		return bancosClientes;
	}
	@Transactional
	public BancosClientes removeBancosClientes(int id) {
		return null;
	}
	@Transactional
	public BancosClientes updateBancosClientes(int id) {
		return null;
	}
	@Transactional
	public BancosClientes getBancosClientes(int Id) {
		return null;
	}
	@Transactional
	public ArrayList<BancosClientes> listBancosClientes() {
		return null;
	}

}
