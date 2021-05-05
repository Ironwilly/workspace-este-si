package com.salesianostriana.primerodam.dao;

import java.util.ArrayList;
import java.util.List;

import com.salesianostriana.primerodam.modelo.Alumno;

public class CrudAlumnoEnMemoria implements ICrudAlumno{
	
	private ArrayList<Alumno> ListaDeAlumnos;
	

	public CrudAlumnoEnMemoria(ArrayList<Alumno> listaDeAlumnos) {
		super();
		ListaDeAlumnos = listaDeAlumnos;
	}

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

	

	
	

}
