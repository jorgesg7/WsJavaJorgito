package ejercicios;
import java.util.Scanner;

public class Ejercicio08Supuesto8 {
	public static void main(String[] args) {
		double  op1 = 0, op2 = 0;
		String palabra = null;
		Scanner sc = new Scanner(System.in);
		
 		System.out.print("Dame un numero : ");
 		op1 = sc.nextDouble();
 		System.out.print("Dame otro numero : ");
 		op2 = sc.nextDouble();
		System.out.print("Dame una palabra, Sumar, Restar, Multiplicar, Dividir, Resto : ");
		palabra = sc.next();
		
		switch(palabra) {
		case "Sumar":
			System.out.println("la suma es " + (op1+op2));
 			break;
		case "Restar":
			System.out.println("la resta es " + (op1-op2));
 			break;
		case "Multiplicar":
			System.out.println("el producto es " + (op1*op2));
 			break;
		case "Dividir":
			System.out.println("la division es " + (op1/op2));
 			break;
		case "Resto":
			System.out.println("el resto es " + (op1%op2));
 			break;
		default:
			System.out.println("palabra erronea : " + palabra);
			
		}
		
	}

}
