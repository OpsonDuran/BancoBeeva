package com.beeva.banco.BancoBeeva.daoImpl;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

@Repository
public class BancoDaoImpl extends BancoDao{
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public Banco saveBanco(Banco banco) {
		entityManager.persist(banco);
    	log.bancoLog(banco);
		return banco;
	}

	public Banco removeBanco(int id) {
		return null;
	}

	public Banco updateBanco(int id) {
		return null;
	}

	public Banco getBanco(int Id) {
		return entityManager.find(Banco.class, Id);
	}

	public ArrayList<Banco> listBanco() {
		return null;
	}

}
