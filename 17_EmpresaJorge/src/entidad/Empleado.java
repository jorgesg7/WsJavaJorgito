package entidad;

public abstract class Empleado {
	 private String nombre;
	 private String dni;
     private double salariobase;
     private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
     
 
	

}