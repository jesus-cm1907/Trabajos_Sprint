package ENTORNOS;

public class Profesores extends Persona {
	public int curso;
	public String asignatura;

	public Profesores() {
	}

	public Profesores(String nombre, String apellidos, int edad, String asignatura, int curso) {
		super(nombre, apellidos, edad);
		this.asignatura = asignatura;
		this.curso = curso;
	}

	public void mostrardatos(String nombre, String apellidos, int curso, String asignatura) {

	}

	public void castigarAlumno(String Alumno) {
	}
}
