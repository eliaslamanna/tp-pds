package com.example.tppds;

import java.util.List;

public class Carrera {

	public Carrera() {   
		
	}
	
	public Carrera(String nombre, int cargaHorariaMax, List<Materia> materias) {
		this.nombre= nombre;
		this.cargaHorariaMax =  cargaHorariaMax;
		this.materias =  materias;
	}		
	
private String nombre;
private int cargaHorariaMax;
private List<Materia> materias;

public String getNombre(){
	return nombre;
}
public int getCargaHorariaMax() {
	return cargaHorariaMax;
}
public List<Materia> getMaterias(){
	return materias;
}

	
}
