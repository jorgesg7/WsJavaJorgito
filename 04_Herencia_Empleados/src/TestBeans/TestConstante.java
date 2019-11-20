package TestBeans;

import beans.Empleado;

public class TestConstante {

	public static void main(String[] args) {
		System.out.println(Empleado.MESES_NOMINA);
		Empleado el = new Empleado();
		System.out.println(el.MESES_NOMINA);
		

	}

}
