package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Cliente;

import modelo.negocio.GestorClientes;

public class MainSpringBBDDClientes {
	public static ApplicationContext context;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		context = new ClassPathXmlApplicationContext("context.xml");
		
		GestorClientes gc =(GestorClientes)context.getBean("gestorClientes");
		
		String opcion = "0";
		do {
			System.out.println("1- Alta de cliente");
			System.out.println("2- lista de clientes");
			System.out.println("3- Buscar cliente por id");
			System.out.println("4- Buscar cliente por nombre");
			System.out.println("5- Borrar cliente por id");
			System.out.println("0- Salir");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el dni:");
				//nextLine coje toda la frase, next coje palabra
				String dni = sc.nextLine();
				System.out.println("Introduzca el nombre");
				String nombre = sc.nextLine();
				System.out.println("Introduzca la edad");
				String edad = sc.nextLine();
				
				int iEdad = Integer.parseInt(edad);
				
				Cliente c = context.getBean("cliente",Cliente.class);
				//Libro l = (Libro)context.getBean("libro");
				c.setDni(dni);
				c.setNombre(nombre);
				c.setEdad(iEdad);
				
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle informaci�n a nuestro
				//usuario
				int alta = gc.alta(c);
				if(alta == 0) {
					System.out.println("Cliente introducido correctamente");
				}else if(alta == 1) {
					System.out.println("El cliente tiene que tener ");
				}else if(alta == 2) {
					System.out.println("El libro tiene que tener un titulo");
				}else if(alta == 3) {
					System.out.println("Ya existe ese isbn");
				}
			}else if(opcion.equals("2")) {
				//ahora como estamos trabajando con Interfaces
				//es decir, el metodo getListaLibros() me devuelve
				//una interfaz, no puedo apuntar a una interfaz List
				//con una referencia de tipo ArrayList, por lo que
				//tengo que cambiar el tipo de rereferencia a List
				// Interfaz = Implementacion Si se puede
				// Implementacion = Interfaz NO se puede
				List<Cliente> cliente = gc.getListaClientes();
				if(cliente.size() != 0) {
					for(Cliente l : cliente) {
						System.out.println(l);
					}
				}else {
					System.out.println("Todavia no hay libros en la libreria");
				}
			}else if(opcion.equals("3")) {
				System.out.println("Introduzca el id a buscar");
				String id = sc.nextLine();
				int iId = Integer.parseInt(id);
				Cliente c = gc.buscarPorId(iId);
				if(c == null) {
					System.out.println("El cliente no se ha encontrado");
				}else {
					System.out.println(c);
				}
			}else if(opcion.equals("4")) {
				System.out.println("Introduzca el nombre ");
				String nombre = sc.nextLine();
				//como la parte de la logica de negocio
				//la lleva el gestor, usamos el gestor creado
				//para buscar por genero
				List<Cliente> listaClientesNombre = gc.buscarPorNombre(nombre);
				if(listaClientesNombre.size() != 0) {
					System.out.println("La lista de clientes por nombre es:");
					for(Cliente c : listaClientesNombre) {
						System.out.println(c);
					}
				}else {
					System.out.println("No hay conincidencias por Nombre");
				}
			}else if(opcion.equals("5")) {
				System.out.println("Introduzca el id a borrar");
				String id = sc.nextLine();
				int iId = Integer.parseInt(id);
				boolean b =gc.borrar(iId);
				if(b == false) {
					System.out.println("el cliente no se encuentra");
				}	else {
					System.out.println("cliente eliminado correctamente");
				}	
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
		
				
		

}
}