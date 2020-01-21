package testbean;

import java.awt.Cursor;

import bean.Alumno;
import bean.Curso;
import bean.Profesor;

public class TestAlumnoProfesorCurso {

	public static void main(String[] args) {
		Alumno alum1, alum2;
		
		alum1 = new Alumno();
		alum2 = new Alumno("12345678B", "kevin garcia", "H", 25);
		
		alum1.setNombreCompleto("daniel sanz");
		alum1.setDni("12345678D");
		alum1.setSexo("H");
		alum1.setEdad(20);
		
		
		System.out.println(alum1);
		
		
		System.out.println(alum1.getNombreCompleto());
		

		Profesor profe1, profe2;
		
		profe1 =  new Profesor();
		profe2 = new Profesor("44445678G", "elena", 21, 600, "M");
		
		profe1.setDni("21345678L");
		profe1.setNombre("tomas");
		profe1.setEdad(40);
		profe1.setSexo("H");
		profe1.setSalario(500);
		
		System.out.println(profe1);
		
		System.out.println(profe1.getNombre());
		
		Curso curso1, curso2, curso3;
		
		curso1 = new Curso();
		curso2 = new Curso(1, "matematicas", 6, 20.95);
		curso3 = new Curso(2, "lengua", 5, 30);
		
		
		
		curso1.setNombreCurso("ingles");
		curso1.setHoras(4);
		curso1.setPrecio(10.20);
		
		
		
		System.out.println(curso1);
		System.out.println(curso1.getNombreCurso());
		
		
		
	}

}
