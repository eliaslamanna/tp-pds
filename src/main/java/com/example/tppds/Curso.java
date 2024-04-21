package com.example.tppds;
import java.util.List;


public class Curso {

	public Curso() {   
		
	}
	
	public Curso(int idCurso, String turno, String dia, float horarioInicio, float horarioFin, Aula aula, Materia materia, Docente docente, List<Estudiante> alumnos) {
		this.idCurso = idCurso;
		this.turno = turno;
		this.dia = dia;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.aula = aula;
		this.materia = materia;
		this.docente = docente;
		this.alumnos = alumnos;
	}
	
private int idCurso;
private String turno;
private String dia;
private float horarioInicio;
private float horarioFin;
private Aula aula;
private Materia materia;
private Docente docente;
private List<Estudiante> alumnos;


public boolean calcularCapacidad() {
	return alumnos.size() <= aula.getCapacidad();
}
public Materia getMateria() {
	return materia;
}
public Aula getAula() {
	return aula;
}
public String getTurno() {
	return turno;
}
public String getDia() {
	return dia;
}

public void setDia(String dia) {
	this.dia=dia;
}
public void setTurno(String turno) {
	this.turno=turno;
}
public void setAula(Aula aula) {
	this.aula=aula;
}
public void setMateria(Materia materia) {
	this.materia=materia;
}

}
