package ejercicios;
import java.util.Scanner;

public class Ejercicio12Repetitiva1 {
	public static void main(String[] args) {
		/*
		 * 1.	Leer un n�mero detr�s de otro mientras que el n�mero entero  
		 * le�do sea distinto de cero. Al final del proceso mostrar cuantos
		 *  n�meros v�lidos he le�do, y cuanto suman las cantidades de 
		 *  los n�meros introducidos.
		 */
		Scanner sc = new Scanner(System.in);
		int numero = 0, contador = 0, acumulador = 0;
		numero = sc.nextInt();
		while (numero != 0) {
			contador++;
			acumulador += numero;
			// OJO!!!!! y vuelvo a leer que se me bucla
			numero = sc.nextInt();
		}
		
		System.out.println("numeros leidos : " + contador);
		System.out.println("suman todos : " + acumulador);
		
		
		
		
		sc.close();
	}
	
}
