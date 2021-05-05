package com.salesianostriana.primerodam.dao;

import java.util.List;

import com.salesianostriana.primerodam.modelo.Alumno;

public interface ICrudAlumno {
	
	
	 
	 //métodos
	 
	 //método agregar alumno
	 
	public List<Alumno> findAll();
    public Alumno findOne(long id);
    public void insert(Alumno alumno);
    public void edit(Alumno alumno);
    public void delete(Alumno alumno);
	 

}
