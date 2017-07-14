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
    	log.ObjectLog(banco,"Se guardo");
		return banco;
	}
	@Transactional
	public void removeBanco(Banco banco) {
		banco= entityManager.find(Banco.class, banco.getIdBanco());
		entityManager.remove(banco);
    	log.ObjectLog(banco,"se elminio");
	}
	@Transactional
	public Banco updateBanco(Banco banco){
		entityManager.merge(banco);
    	log.ObjectLog(banco,"Se actualizo");
		return banco;
	}
	@Transactional
	public Banco getBanco(int Id) {
		Banco consulta = entityManager.find(Banco.class, Id);
    	log.ObjectLog(consulta,"Se consulto");
		return consulta;
	}
	@Transactional
	public List<Banco> listBanco() {
		List<Banco> list= entityManager.createQuery("from Banco").getResultList();
	return list;
	}

}
