package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.entity.Cliente;

@Repository
public class ClienteDaoImpl extends ClienteDao{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Cliente saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente removeCLiente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente updateCLiente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getCliente(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> listClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
