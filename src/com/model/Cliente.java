package com.model;

public class Cliente {
	private int id;
	private String nombreCliente;
	private String nombreContacto;
	private String apellidoContacto;
	private String telefono;
	private String fax;
	private String lineaDireccion1;
	private String lineaDireccion2;
	private String ciudad;
	private String region;
	private String pais;
	private String codigoPostal;
	private Integer codigoCliente;
	private Integer codigoEmpleadoRepVentas;
	private Float limiteCredito;
	
	public Cliente() {
	}
	
	public Cliente(int id, String nombreCliente, String nombreContacto, String apellidoContacto, String telefono,
			String fax, String lineaDireccion1, String lineaDireccion2, String ciudad, String region, String pais,
			String codigoPostal, Integer codigoCliente, Integer codigoEmpleadoRepVentas, Float limiteCredito) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.nombreContacto = nombreContacto;
		this.apellidoContacto = apellidoContacto;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion1 = lineaDireccion1;
		this.lineaDireccion2 = lineaDireccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.codigoCliente = codigoCliente;
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
		this.limiteCredito = limiteCredito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLineaDireccion1() {
		return lineaDireccion1;
	}

	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}

	public String getLineaDireccion2() {
		return lineaDireccion2;
	}

	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Integer getCodigoEmpleadoRepVentas() {
		return codigoEmpleadoRepVentas;
	}

	public void setCodigoEmpleadoRepVentas(Integer codigoEmpleadoRepVentas) {
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
	}

	public Float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return this.id + ", " + this.nombreCliente + ", " + this.nombreContacto + ", " + this.apellidoContacto + ", " + this.telefono + ", " + this.fax + ", " + this.lineaDireccion1 + ", " + this.lineaDireccion2 + ", " + this.ciudad + ", " + this.region + ", " + this.pais + ", " + this.codigoPostal + ", " + this.codigoCliente + ", " + this.codigoEmpleadoRepVentas + ", " + this.limiteCredito;
	}
}