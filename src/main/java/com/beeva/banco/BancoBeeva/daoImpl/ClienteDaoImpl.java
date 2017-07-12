package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;
/**
 * @author Armando Duran Salavdor
 *
 */
@Repository
public class ClienteDaoImpl extends ClienteDao{
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public Cliente saveCliente(Cliente cliente) {
		entityManager.persist(cliente);
		log.ObjectLog(cliente);
		return cliente;
	}

	public Cliente removeCLiente(int id) {
		return null;
	}

	public Cliente updateCLiente(int id) {
		return null;
	}

	public Cliente getCliente(int Id) {
		return null;
	}

	public ArrayList<Cliente> listClientes() {
		return null;
	}

}
