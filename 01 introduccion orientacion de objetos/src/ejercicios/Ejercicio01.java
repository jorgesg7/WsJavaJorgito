package ejercicios;

public class Ejercicio01 {
	public static void main(String[] args) {
	/*	String nombre = "sebastian";
		System.out.println(nombre.toUpperCase());
		System.out.println(String.valueOf(1234).substring(1,3));
	*/
		int num1=0, num2=0, resultado = 0;

		//simulamos que los leemos
		num1 = 2;
		num2 = 5;
		//proceso
		resultado = num1+num2;
		System.out.println("la suma es : " + (num1 + num2));
		System.out.println("la suma es : " + resultado);
		System.out.println("la resta es : " + (num1 - num2));
		System.out.println("el producto es : " + (num1 * num2));
		System.out.println("la division es : " + (num1 / num2));
		System.out.println("el resto de la div es : " + (num1 % num2));
		
	}

}
