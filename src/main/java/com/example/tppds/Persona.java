package com.example.tppds;

import java.util.List;

public abstract class Persona {
	public Persona() {   
		
	}
	
	public Persona(int legajo, String nombre, String apellido) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
private int legajo;
private String nombre;
private String apellido;

protected List<Curso> cursos;

public abstract List<Curso> verCursos();

public boolean soyEsaPersona(int legajo) {
	return legajo == this.legajo;
}

}
