package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;

/**
 * @author Armando Duran Salavador
 */

@Repository
public class ClienteDaoImpl extends ClienteDao{
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public Cliente saveCliente(Cliente cliente) {
		entityManager.persist(cliente);
		log.ObjectLog(cliente ,"Se guardo");
		return cliente;
	}
	@Transactional
	public Cliente removeCLiente(int id) {
		return null;
	}
	@Transactional
	public Cliente updateCLiente(Cliente cliente) {
		entityManager.merge(cliente);
		log.ObjectLog(cliente, "se actualizo");
		return null;
	}
	@Transactional
	public Cliente getCliente(int Id) {
        Cliente result=entityManager.find(Cliente.class, Id);
		log.ObjectLog(result, "se consulto");
		return result;
        }
	@Transactional
	public List<Cliente> listClientes() {
		List<Cliente> lista= entityManager.createQuery("from Cliente").getResultList();
		return lista;
	}

}
