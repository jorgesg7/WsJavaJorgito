package ejercicios;
import java.util.Scanner;

public class Ejercicio07Supuesto7 {
	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		switch(numero) {
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
			default:
				System.out.println("otro numero");
		}
	}

}
