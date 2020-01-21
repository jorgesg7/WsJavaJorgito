package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.negocio.GestorLibreria;

public class MainLibreria {

	public static void main(String[] args) {
		//Primera parte
		//creacion de los objetos necesarios para el programa
		//y la inyeccion de sus dependencias
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		System.out.println("Introduzca el nombre de la libreria");
		String nombreLibreria = sc.nextLine();
		//creamos la libreria
		Libreria libreria = new Libreria();
		libreria.setNombre(nombreLibreria);
		libreria.setListaLibros(listaLibros);
		
		GestorLibreria gl = new GestorLibreria(libreria);
		
		/* Esto podriamos hacerlo si quisieramos tener varias
		 * librerias
		Libreria l2 = new Libreria();
		ArrayList<Libro> listaLibros2 = new ArrayList<Libro>();
		l2.setListaLibros(listaLibros2);
		
		Libreria l3 = new Libreria();
		ArrayList<Libro> listaLibros3 = new ArrayList<Libro>();
		l2.setListaLibros(listaLibros2);
		
		Libreria l4 = new Libreria();
		ArrayList<Libro> listaLibros4 = new ArrayList<Libro>();
		l2.setListaLibros(listaLibros4);
		
		//si queremos hacer esto debemos de tener el setter
		gl.setLibreria(l4);
		*/
		String opcion = "0";
		do {
			System.out.println("********  " + libreria.getNombre() + " ***********");
			System.out.println("1- Alta de libro");
			System.out.println("2- lista de libros");
			System.out.println("3- Buscar libro por isbn");
			System.out.println("4- Buscar libros por editorial");
			System.out.println("0- Salir");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el titulo:");
				//nextLine coje toda la frase, next coje palabra
				String titulo = sc.nextLine();
				System.out.println("Introduzca el editorial:");
				String editorial = sc.nextLine();
				System.out.println("Introduzca el isbn");
				String isbn = sc.nextLine();
				System.out.println("Introduzca el a�o de publicacion");
				String anioPublicacion = sc.nextLine();
				
				int iAnioPublicacion = Integer.parseInt(anioPublicacion);
				
				Libro l = new Libro();
				l.setTitulo(titulo);
				l.setEditorial(editorial);
				l.setAnioPublicacion(iAnioPublicacion);
				l.setIsbn(isbn);
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle informaci�n a nuestro
				//usuario
				int alta = gl.alta(l);
				if(alta == 0) {
					System.out.println("Libro introducido correctamente");
				}else if(alta == 1) {
					System.out.println("El libro tiene que tener isbn");
				}else if(alta == 2) {
					System.out.println("El libro tiene que tener un titulo");
				}else if(alta == 3) {
					System.out.println("Ya existe ese isbn");
				}
			}else if(opcion.equals("2")) {
				ArrayList<Libro> libros = gl.getListaLibros();
				if(libros.size() != 0) {
					for(Libro l : libros) {
						System.out.println(l);
					}
				}else {
					System.out.println("Todavia no hay libros en la libreria");
				}
			}else if(opcion.equals("3")) {
				System.out.println("Introduzca el ISBN a buscar");
				String isbn = sc.nextLine();
				Libro l = gl.buscarPorIsbn(isbn);
				if(l == null) {
					System.out.println("El libro no se ha encontrado");
				}else {
					System.out.println(l);
				}
			}else if(opcion.equals("4")) {
				System.out.println("Introduzca el editorial a buscar");
				String editorial = sc.nextLine();
				//como la parte de la logica de negocio
				//la lleva el gestor, usamos el gestor creado
				//para buscar por genero
				ArrayList<Libro> lista = gl.buscarPorEditorial(editorial);
				if(lista.size() != 0) {
					System.out.println("La lista de libros por editorial es:");
					for(Libro l : lista) {
						System.out.println(l);
					}
				}else {
					System.out.println("No hay conincidencias por editorial");
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
		
	}

}
