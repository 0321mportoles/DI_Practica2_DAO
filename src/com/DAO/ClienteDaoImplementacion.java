package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.InterfazDao.InterfazClienteDao;
import com.connection.Conexion;
import com.InterfazDao.*;
import com.model.Cliente;

public class ClienteDaoImplementacion implements InterfazClienteDao{

		
	@Override
	public boolean registrar(Cliente cliente) {
		boolean registrar = false;
			
		Statement stm= null;
		Connection con=null;
			
		String sql="INSERT INTO cliente values (NULL,'" + cliente.getId() + ", " + cliente.getNombreCliente() + ", " + cliente.getNombreContacto() 
		+ ", " + cliente.getApellidoContacto() + ", " + cliente.getTelefono() + ", " + cliente.getFax() + ", " + cliente.getLineaDireccion1() + ", " +
				cliente.getLineaDireccion2() + ", " + cliente.getCiudad() + ", " + cliente.getRegion() + ", " + cliente.getPais() + ", " + cliente.getCodigoPostal() 
				+ ", " + cliente.getCodigoCliente() + ", " + cliente.getCodigoEmpleadoRepVentas() + ", " + cliente.getLimiteCredito() + "')";
			
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImplementacion, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Cliente> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
			
		String sql="SELECT * FROM CLIENTE ORDER BY ID";
			
		List<Cliente> listaCliente= new ArrayList<Cliente>();
			
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c=new Cliente();
				c.setId(rs.getInt(1));
				c.setNombreCliente(rs.getString(2));
				c.setNombreContacto(rs.getString(3));
				c.setApellidoContacto(rs.getString(4));
				c.setTelefono(rs.getString(5));
				c.setFax(rs.getString(6));
				c.setLineaDireccion1(rs.getString(7));
				c.setLineaDireccion2(rs.getString(8));
				c.setCiudad(rs.getString(9));
				c.setRegion(rs.getString(10));
				c.setPais(rs.getString(11));
				c.setCodigoPostal(rs.getString(12));
				c.setCodigoCliente(rs.getInt(13));
				c.setCodigoEmpleadoRepVentas(rs.getInt(14));
				c.setLimiteCredito(rs.getFloat(15));
								
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
			
		return listaCliente;
	}

	@Override
	public boolean actualizar(Cliente cliente) {
		Connection connect= null;
		Statement stm= null;
			
		boolean actualizar=false;
					
		String sql="UPDATE CLIENTE SET cedula='"+ cliente.getId() + ", " + cliente.getNombreCliente() + ", " + cliente.getNombreContacto() 
		+ ", " + cliente.getApellidoContacto() + ", " + cliente.getTelefono() + ", " + cliente.getFax() + ", " + cliente.getLineaDireccion1() + ", " +
		cliente.getLineaDireccion2() + ", " + cliente.getCiudad() + ", " + cliente.getRegion() + ", " + cliente.getPais() + ", " + cliente.getCodigoPostal() 
		+ ", " + cliente.getCodigoCliente() + ", " + cliente.getCodigoEmpleadoRepVentas() + ", " + cliente.getLimiteCredito() + " WHERE ID="+cliente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}

	@Override
	public boolean eliminar(Cliente cliente) {
		Connection connect= null;
		Statement stm= null;
			
		boolean eliminar=false;
					
		String sql="DELETE FROM CLIENTE WHERE ID="+cliente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImplementacion, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}

