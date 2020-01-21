package bean;

public class Profesor {
	
	private String dni;
	private String nombre;
	private int edad;
	private double salario;
	private String sexo;
	
	public Profesor() {
		super();
	}

	public Profesor(String dni, String nombre, int edad, double salario, String sexo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", sexo="
				+ sexo + "]";
	}
	
	

}
