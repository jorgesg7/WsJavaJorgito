package bean;

public class Alumno {

	private String dni;
	private String nombreCompleto;
	private String sexo;
	private int edad;
	
	public Alumno() {
		super();
	}

	public Alumno(String dni, String nombreCompleto, String sexo, int edad) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
	
}
