package ejercicios;

public class Ejercicio15Repetitiva4 {
	public static void main(String[] args) {
	int i=0, numero = 0, pares = 0, impares = 0 ;
	double media = 0, suma = 0;
	
	for (  i=1; i<=10;i++) {
		numero = (int)(Math.random()*50+1);
		System.out.println(numero);
		suma += numero;
		if (numero%2 == 0)
			pares++;
		else
			impares++; 
		
	}
	System.out.println("pares : " + pares );
	System.out.println("impares : " + impares );
	System.out.println("suma : " + suma );
	media = suma/(i-1);
	System.out.println("media : " + media);
	System.out.println("media : " +suma/(i-1));

	}


}
