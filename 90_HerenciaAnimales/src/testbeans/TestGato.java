package testbeans;

import beans.Gato;

public class TestGato {

	public static void main(String[] args) {
		Gato gato1, gato2;
		
		gato1 = new Gato();
		gato2 = new Gato("manchas negras y blancas", 7);
		
		
		System.out.println(gato1);
		System.out.println(" _ " + gato2);
		
		
		
		

	}

}
