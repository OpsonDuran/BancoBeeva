package com.beeva.banco.BancoBeeva.daoImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.mongolog.BancoLog;
/**
 * @author Armando Duran Salavdor
 *
 */
@Repository
public class CuentaAhorroDaoImpl extends CuentaDao {
	@PersistenceContext
	EntityManager entityManager;
	BancoLog log=new BancoLog();

	@Transactional
	public boolean Deposito(Cliente cliente, double dinero) {
		
		return true;
	}

	public boolean Retiro(Cliente cliente, double dinero) {
		return false;
	}

	public Cuenta saveCuenta(Cuenta cuenta) {
		return null;
	}

	public Cuenta removeCuenta(int Id) {
		return null;
	}

	public Cuenta updateCuenta(int Id) {
		return null;
	}

	public ArrayList<Cuenta> listCuenta() {
		return null;
	}

}
