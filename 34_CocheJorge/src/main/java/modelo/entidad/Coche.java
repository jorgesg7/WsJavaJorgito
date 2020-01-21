package modelo.entidad;

public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private boolean segundaMano;
	private double precio;
	private double peso;
	
	
	public Coche() {
		super();
	}


	public Coche(String matricula, String marca, String modelo, boolean segundaMano, double precio, double peso) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.segundaMano = segundaMano;
		this.precio = precio;
		this.peso = peso;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isSegundaMano() {
		return segundaMano;
	}


	public void setSegundaMano(boolean segundaMano) {
		this.segundaMano = segundaMano;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	

}
