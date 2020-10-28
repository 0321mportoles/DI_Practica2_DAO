package com.InterfazDao;

import java.util.List;

import com.model.Cliente;

public interface InterfazClienteDao {
	
	public boolean registrar(Cliente cliente);
	public List<Cliente> obtener();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar(Cliente cliente);
}
