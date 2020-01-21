package main;

import entidad.Persona;

public class MainEstatico {
	
	        //observar que este metodo es estatico
			//es decir este metodo no esta ligado a ningun
			//objeto, existe siempre sin necesidad de new


	public static void main(String[] args) {
		//fijaos que para acceder al metodo
		// setNombre accedo a traves de la referencia
		//al objeto
		
		Persona p1 = new Persona();
		p1.setNombre("Harry Calahan");
		p1.setEdad(85);
		System.out.println(p1);
		//como lo estatico existe siempre esto lo puedo hacer
		imprimirEstatico(p1);
		//Para invocar un metodo dinamico necesito
		// el objeto creado, fijaos en p1.setNombre()
		//imprimirDinamico(p1)
		//asi pues creamos el objeto
		MainEstatico mainEstatico = new MainEstatico();
		//y ahora podemos invocar el metodo
		mainEstatico.imprimirDinamico(p1);
		
		
		// si no estoy dentro de la clase que tiene el 
		//artributo o el metodo estatico, se accede a
		// traves del nombre de la clase
		Persona.numeroPersonas ++;
		//notese la diferencia entre cuando queria acceder
		// a un metodo o atributo dinamico, que lo que necesitaba
		// era una referencia al objeto
		
		
		
	}

	public static void imprimirEstatico(Persona p1) {
		System.out.println(p1);
		//Da error porque desde lo estatico no podemos acceder 
		// a lo dinamico
		// imprimirDinamico(p1);
		

		
	}
	
	public void imprimirDinamico(Persona p1)  {
		System.out.println(p1);
		imprimirEstatico(p1);
		
	}
	
}
