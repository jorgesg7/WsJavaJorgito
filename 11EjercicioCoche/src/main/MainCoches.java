package main;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Coche;

public class MainCoches {

	public static void main(String[] args) {
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		int opcion = 0;
		Scanner leer = new Scanner(System.in);
		/*System.out.println("Elige una opci�n entre : "+
				"1- Alta coche\r\n" + 
				"2- Listar coches\r\n" + 
				"0- Salir del programa\r\n" );	*/
		do {System.out.println("Elige una opci�n entre : "+
				"1- Alta coche\r\n" + 
				"2- Listar coches\r\n" + 
				"0- Salir del programa\r\n" );	
			opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				
				System.out.println("Procedemos a realizar Alta coche");
				Coche c1 = new Coche();
				System.out.println("Introduzca matr�cula");
				String matricula = leer.next();
				c1.setMatricula(matricula);
				System.out.println("Introduzca marca");
				String marca = leer.next();
				c1.setMarca(marca);
				System.out.println("Introduzca modelo");
				String modelo = leer.next();
				c1.setModelo(modelo);
				listaCoches.add(c1);
				System.out.println("*******Fin de alta*****");
				break;
			case 2: System.out.println("Lista coches : ");
				for (Coche coches : listaCoches){
					System.out.println(coches);
				}
				break;
			case 0:
				System.out.println("Gracias por usar nuestro programa");
				break;

			default:
				System.out.println("La opcion no se reconoce");
				break;
			}
			
		}while (opcion != 0);
		
		leer.close();
		
	}

}
