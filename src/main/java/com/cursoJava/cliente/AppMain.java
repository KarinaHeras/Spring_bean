package com.cursoJava.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursoJava.negocio.ClientesBS;

public class AppMain {

	public static void main(String[] args) {
		// Levantar el contexto de Spring
		// Crear el contenedor de beans a partir del archivo applicationContext.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Recuperar del contenedor el bean de negocio
		// ClientesBS clientesBS = (ClientesBS) context.getBean("clientesBS");
		ClientesBS clientesBS = context.getBean("clientesBS", ClientesBS.class);
		
		// Ejecutar
		clientesBS.altaCliente("Datos del cliente");
	}

}
