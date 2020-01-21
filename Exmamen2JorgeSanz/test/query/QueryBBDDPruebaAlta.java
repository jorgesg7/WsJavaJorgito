package query;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeliculas;

public class QueryBBDDPruebaAlta {

	public static void main(String[] args) {
		DaoPeliculas daoPelicula = new DaoPeliculas();
		Pelicula pelicula1 = new Pelicula("Batman", "Laura", "Accion", 2003);
		daoPelicula.alta(pelicula1);
		
		System.out.println("prueba alta");
		
		
		

	}

}
