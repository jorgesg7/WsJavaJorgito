package testbeans;

import java.util.Scanner;

import beans.Departamento;

public class testDepartamento {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Departamento dep1, dep2, dep3;
		//modo datos al constructor
		dep1 = new Departamento(10, "ventas");
		//modo orco
		dep2 = new Departamento();
		dep2.setIdDepartamento(20);
		dep2.setNombre("Administracion");
		
		dep3 = new Departamento();
		
		System.out.println("numero de dep : ");
		//dep3.setIdDepartamento(leer.nextInt());
		dep3.setIdDepartamento(Integer.parseInt(leer.next()));
		
		
		System.out.println("nombre de dep : ");
		dep3.setNombre(leer.next());
		
		System.out.println("DATOS DE LOS DEPARTAMENTOS");
		System.out.println(dep1);
		System.out.println(dep2);
		System.out.println(dep3);
		System.out.println("DATOS SUELTOS");
		System.out.println("id dep1 : " + dep1.getIdDepartamento());
		System.out.println("nombre dep2 : " + dep2.getNombre());
		
		
		
		leer.close();

	}

}
