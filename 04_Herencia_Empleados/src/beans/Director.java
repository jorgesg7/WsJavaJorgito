package beans;

public class Director extends Empleado {
	private int acciones;
	private String tablet;
	
	public Director()  {
	
	}

	public Director(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departamento, int acciones, String tablet) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, comision, departamento);
		this.acciones = acciones;
		this.tablet = tablet;
	}

	public int getAcciones() {
		return acciones;
	}

	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}

	public String getTablet() {
		return tablet;
	}

	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	

}
