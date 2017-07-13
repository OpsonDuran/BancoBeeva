package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

/**
 * @author Armando Duran Salavador
 */

@Repository
public class BancoDaoImpl extends BancoDao{
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public Banco saveBanco(Banco banco) {
		entityManager.persist(banco);
    	log.ObjectLog(banco,"Save");
		return banco;
	}

	public void removeBanco(Banco banco) {
		banco= entityManager.find(Banco.class, banco.getIdBanco());
		entityManager.remove(banco);
	}

	public Banco updateBanco(Banco banco) {
		return entityManager.merge(banco);
	}

	public Banco getBanco(int Id) {
		return entityManager.find(Banco.class, Id);
	}

	public List<Banco> listBanco() {
		return entityManager.createNamedQuery("banco.findAll").getResultList();
	}

}
