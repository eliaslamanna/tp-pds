package com.example.tppds;
import java.util.List;

public class Docente extends Persona {
	
	
	public Docente (int legajo, String nombre, String apellido) {
		
		super(legajo, nombre, apellido);
	}
	@Override
	public List<Curso> verCursos(){
		return cursos;
	}
	
}
