package testbeans;

import beans.Animal;
import beans.Gato;

public class TestVariablesAnimal {

	public static void main(String[] args) {
		Animal a1, a2, a3, a4, a5;
		Gato gato1;
		
		a1 = new Animal("Pulpo - rojizo");
		a2 = new Gato("montes - marron",  6);
		a3 = new Animal("camaleon - verde");
		a4 = new Gato("gatuno - marron", 2);
		
		a4.saludar();
		a4.sonido();
		((Gato)a4).mostrarDatos();
		
        a5 = findAnimaL();
        gato1 = (Gato)findAnimaL();
        String tontada = (String) readObject();
        System.out.println(tontada);
        
      
        
	}
	
	
	 static Gato findAnimaL() {
		// TODO Auto-generated method stub
		return null;
	}


	public static  Animal indAnimal()  {
		return new Gato("callejero - blanco", 2);
		
	}

	
	public static Object readObject() {
		return new String("vaya tela el tomasin");
		
	}
}
