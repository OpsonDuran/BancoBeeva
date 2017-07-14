package com.beeva.banco.BancoBeeva.dao;

import java.util.List;
import com.beeva.banco.BancoBeeva.entity.Cliente;

/**
 * @author Armando Duran Salavador
 */

public abstract class ClienteDao {
	public abstract Cliente saveCliente(Cliente cliente);
	public abstract Cliente removeCLiente(int id);
	public abstract Cliente updateCLiente(Cliente cliente);
	public abstract Cliente getCliente(int Id);
	public abstract List<Cliente> listClientes();
}
