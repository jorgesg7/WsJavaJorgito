package modelo.entidad;

public class Pelicula {
	private int id;
	private String titulo;
	private String director;
	private String genero;
	private int a�oPublicacion;
	
	public Pelicula(String titulo, String director, String genero, int a�oPublicacion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.a�oPublicacion = a�oPublicacion;
	}

	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, String director, String genero, int a�oPublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.a�oPublicacion = a�oPublicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero
				+ ", a�oPublicacion=" + a�oPublicacion + "]";
	}
	
}