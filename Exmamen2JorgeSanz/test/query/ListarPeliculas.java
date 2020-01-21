package query;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPeliculas;

public class ListarPeliculas {

	public static void main(String[] args) {
		DaoPeliculas daoPelicula = new DaoPeliculas();
		Pelicula pelicula1 = new Pelicula();
		List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

		
		daoPelicula.listar();
		
		System.out.println(daoPelicula.listar());
		System.out.println("prueba lista terminada");
	}

}
