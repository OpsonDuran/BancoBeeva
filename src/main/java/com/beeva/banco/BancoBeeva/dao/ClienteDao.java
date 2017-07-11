package com.beeva.banco.BancoBeeva.dao;

import java.util.ArrayList;
import com.beeva.banco.BancoBeeva.entity.Cliente;

public abstract class ClienteDao {
	public abstract Cliente saveCliente(Cliente cliente);
	public abstract Cliente removeCLiente(int id);
	public abstract Cliente updateCLiente(int id);
	public abstract Cliente getCliente(int Id);
	public abstract ArrayList<Cliente> listClientes();
}
