package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.BancosClientesDao;
import com.beeva.banco.BancoBeeva.entity.BancosClientes;

@Repository
public class BancosClientesDaoImpl extends BancosClientesDao {
	@PersistenceContext
	EntityManager entityManager;


	@Transactional
	public BancosClientes saveBancosCLientes(BancosClientes bancosclientes) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public BancosClientes removeBancosClientes(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public BancosClientes updateBancosClientes(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public BancosClientes getBancosClientes(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BancosClientes> listBancosClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
