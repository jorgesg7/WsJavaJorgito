package Vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import Negocio.GestorCalculadora;

public class VistaExcepciones {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("intrpduce los dos numeros");
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			
			GestorCalculadora gc = new GestorCalculadora();
			int resultado = gc.dividir(numero1, numero2);
		} catch (ArithmeticException e) {e.printStackTrace();
		System.out.println("no se puede dividir por 0");
		}catch (InputMismatchException ime) {
			System.out.println( " no se admite palabras ");
			
			
		}

}

}
