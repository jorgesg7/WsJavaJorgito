package query;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class QueryBBDDPrueba {

	public static void main(String[] args) {
		DaoCoche daoCoche = new DaoCoche();
		Coche coche1 = new Coche("1234qqq", "Seat", "ibiza");
		
		daoCoche.alta(coche1);
		
		System.out.println("prueba alta");
		
	}

}
