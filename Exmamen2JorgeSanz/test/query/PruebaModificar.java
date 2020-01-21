package query;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeliculas;

public class PruebaModificar {

	public static void main(String[] args) {
		DaoPeliculas daoPelicula = new DaoPeliculas();
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setId(2);
	    pelicula1.setTitulo("las dos torres");
	    pelicula1.setDirector("Daniel");
	    pelicula1.setGenero("aventuras");
	    pelicula1.setAñoPublicacion(2005);
		daoPelicula.modificar(pelicula1);
		
System.out.println("prueba Modificar");
	}

}
