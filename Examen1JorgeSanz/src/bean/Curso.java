package bean;

public class Curso {
	private int idCurso;
	private String nombreCurso;
	private double horas;
	private double precio;
	
	
	public Curso() {
		super();
	}


	public Curso(int idCurso, String nombreCurso, double horas, double precio) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.horas = horas;
		this.precio = precio;
	}


	public int getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}


	public String getNombreCurso() {
		return nombreCurso;
	}


	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		this.horas = horas;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Cursa [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", horas=" + horas + ", precio=" + precio
				+ "]";
	}
	
	
	

}
