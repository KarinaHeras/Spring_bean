package com.cursoJava.negocio;

import com.cursoJava.persistencia.ItfzDAO;

public class ClientesBS {

	// Inyeccion de dependencia
	private ItfzDAO dao;

	// Metodo que Spring necesita para que se inyecte la propiedad dao
	public void setDao(ItfzDAO dao) {
		this.dao = dao;
	}

	// Spring necesita de un constructor sin argumentos
	public ClientesBS() {
		// TODO Auto-generated constructor stub
	}

	public void altaCliente(Object cliente) {
		dao.insertar(cliente);
	}

}
