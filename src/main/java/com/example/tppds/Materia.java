package com.example.tppds;

import java.util.List;

public class Materia {
	public Materia() {   
		
	}
	
	public Materia(String nombre, int cargaHoraria, List<Materia> materiasAnteriores, List<Materia> materiasPosteriores) {
		this.nombre = nombre;
		this.cargaHoraria = cargaHoraria;
		this.materiasAnteriores= materiasAnteriores;
		this.materiasPosteriores= materiasPosteriores;
	}	
	
private String nombre;
private int cargaHoraria;
private List<Materia> materiasAnteriores;
private List<Materia> materiasPosteriores;


public int getCargaHoraria() {
	return cargaHoraria;
}
public String getNombre() {
	return nombre;
}
public List<Materia> getMateriasAnteriores(){
	return materiasAnteriores;
}
public List<Materia> getMateriasPosteriores(){
	return materiasPosteriores;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void cargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}

}
