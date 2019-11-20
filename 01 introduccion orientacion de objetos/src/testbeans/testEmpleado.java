package testbeans;
import beans.Empleado;

public class testEmpleado {

	public static void main(String[] args) {
		Empleado emp1, emp2, emp3;
		
		
		emp1 = new Empleado();
		emp2 = new Empleado(114, "eva", "perez", "M", 45000, 43);
		emp3 = new Empleado(115,"andrea","sanchez pastor","M", 78000, 24);
		
		emp1.setIdEmpleado(114);
		emp1.setNombre("rafael");
		emp1.setApellidos("sanz");
		emp1.setEdad(24);
		emp1.setSalario(34500);
		emp1.setSexo("H");
		
		
	/*	emp1.idEmpleado = 100;
	    emp1.nombre = "Jorge";
		emp1.apellidos = "sanz garcia";
		emp1.edad = 24;
		emp1.salario = 25000;
		emp1.sexo = "h";  
		
		
		emp2.idEmpleado = 100;
	    emp2.nombre = "SARA";
		emp2.apellidos = "sanz garcia";
		emp2.edad = 24;
		emp2.salario = 250000;
		emp2.sexo = "H";
		
		emp3.idEmpleado = 100;
	    emp3.nombre = "sebas";
		emp3.apellidos = "sanz garcia";
		emp3.edad = 24;
		emp3.salario = 40000;
		emp3.sexo = "h";
		*/
		
	   
	    
				
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		
		System.out.println(emp2.getNombre());
		
		
		
		
				

	}

}
