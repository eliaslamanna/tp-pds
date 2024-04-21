package com.example.tppds;
import java.util.List;

import com.example.tppds.Carrera;
import com.example.tppds.Materia;

public class Estudiante extends Persona{
		
private List<Carrera> carreras;
private List<Materia> materiasAprobadas;

public Estudiante (int legajo, String nombre, String apellido, List<Carrera> carreras, List<Materia> materiasAprobadas) {
	super(legajo, nombre, apellido);
}

public List<Materia> getMateriasAprobadas(){
	return materiasAprobadas;
}
public List<Carrera> getCarrera(){
	return carreras;
}

@Override
public List<Curso> verCursos() {
	return cursos;
}
}
