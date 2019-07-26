package com.secundario;

import com.principal.Empleado;

import Funcionalidades.Metodos;

public class Empresa {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[10];
		
		Metodos.crearEmpleados(empleados);
		Metodos.visualizarEmpleados(empleados);
		Metodos.subirSueldos(empleados);
	}

}
