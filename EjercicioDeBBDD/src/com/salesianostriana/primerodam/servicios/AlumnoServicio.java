package com.salesianostriana.primerodam.servicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.salesianostriana.primerodam.dao.CrudAlumnoEnMemoria;
import com.salesianostriana.primerodam.dao.ICrudAlumno;
import com.salesianostriana.primerodam.modelo.Alumno;



public class AlumnoServicio {

	
	ICrudAlumno crudA = new ICrudAlumno() {
		
		@Override
		public void insert(Alumno alumno) {
			// TODO Auto-generated method stub
			crudA.insert(alumno);
		}
		
		@Override
		public Alumno findOne(long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<Alumno> findAll() {
			// TODO Auto-generated method stub
			
			return findAll()
			.stream()
			.sorted((al1,al2)-> al1.getNombre().compareToIgnoreCase(al2.getNombre()))
			.collect(Collectors.toList());
			
		}
		
		@Override
		public void edit(Alumno alumno) {
			// TODO Auto-generated method stub
			crudA.edit(alumno);
		}
		
		@Override
		public void delete(Alumno alumno) {
			// TODO Auto-generated method stub
			crudA.delete(alumno);
		}
		
		
	};
	
	/*
	public List<Alumno> getByEdad(String fechaNac){
		
		crudA.findAll().stream()
		.sorted(Comparator.comparing(x -> x.equals(fechaNac)))
		.collect(Collectors.toList());
		
		
	}
	
	*/
	
}
