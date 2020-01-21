package query;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeliculas;

public class PruebaBaja {

	public static void main(String[] args) {
		DaoPeliculas daoPelicula = new DaoPeliculas();
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setId(3);
		
		daoPelicula.borrar(pelicula1);
		
		System.out.println("prueba baja");
		
		

	}

}
