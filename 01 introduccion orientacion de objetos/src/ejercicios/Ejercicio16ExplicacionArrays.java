package ejercicios;

public class Ejercicio16ExplicacionArrays {
	public static void main(String[] args) {
	/*	String cadena = "tomas;andres;ana;esteban;sara;ignacio;mariel";
		 
		int [] pares = {2,6,8,10,34,68};
		String [] nombres = {"andres", "esteban", "zacarias", "eva","ana"};
		
//		System.out.println(pares.length);
//		System.out.println(nombres.length);
		pares[1] = 66;
		
		for (int i=0; i < pares.length; i++)
			System.out.println("en la posicion " + i + " hay " + pares[i]);
		
		for (String ele: nombres) {
			System.out.println("me llamo : " + ele);
		}
		System.out.println("\n\n\n");
		
		String [] nombre2 = cadena.split(";");
		for (String ele: nombre2)
			System.out.println("nombre2 : " + ele);
		
		System.out.println("\n\n\n");
		
		for (String ele: cadena.split(";"))
			System.out.println("nombre2 : " + ele);
		*/
		pruebaArrayVacio();
	}
	
	public static void pruebaArrayVacio() {
		
		String [] cadenas = new String[6];
		cadenas[0] = "zacarias";
		cadenas[1] = "esteban";
		cadenas[2] = "carmen";
		cadenas[3] = "natalia";
		 cadenas[6] = "va a cascar seguro";
		 
		 
		
		int [] numeros = new int[7];
		//carga del array con numeros aleatorios
		for (int i=0; i< numeros.length; i+=2)
			numeros[i] = (int) (Math.random()*50+1);
		
		for (String ele: cadenas)
			System.out.println(ele);
		
		for (int ele: numeros)
			System.out.println(ele);
	}

}
