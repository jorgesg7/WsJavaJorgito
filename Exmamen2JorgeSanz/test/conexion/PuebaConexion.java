package conexion;

import modelo.persistencia.DaoPeliculas;

public class PuebaConexion {

	public static void main(String[] args) {
		DaoPeliculas daoPeliculas = new DaoPeliculas();
		boolean estaConectado = daoPeliculas.abrirConexion();
		System.out.println(estaConectado);

	}

}
