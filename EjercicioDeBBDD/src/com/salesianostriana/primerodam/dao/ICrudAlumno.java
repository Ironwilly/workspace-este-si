package com.salesianostriana.primerodam.dao;

import java.util.List;

import com.salesianostriana.primerodam.modelo.Alumno;

public interface ICrudAlumno {
	
	public static final List<Alumno> ListaDeAlumnos = null;
	 
	 //m�todos
	 
	 //m�todo agregar alumno
	 
	 public static boolean agregarAlumno(Alumno alu) {
		 
		 return ListaDeAlumnos.add(alu);
		 
		 
	 }
	 

}
