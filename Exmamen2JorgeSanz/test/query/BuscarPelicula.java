package query;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeliculas;

public class BuscarPelicula {

	public static void main(String[] args) {
		DaoPeliculas daoPelicula = new DaoPeliculas();
		Pelicula pelicula1 = new Pelicula();

		System.out.println("buscar pelicula");
		System.out.println(daoPelicula.obtener(1));
		
	}

}
