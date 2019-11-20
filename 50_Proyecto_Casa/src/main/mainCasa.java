package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Direccion;
import bean.Habitacion;
import bean.Persona;

public class mainCasa {

	public static void main(String[] args) {
		Habitacion h1 = new Habitacion();
		h1.setM2(67.6);
		h1.setTipo("baño");
		
		Habitacion h2 = new Habitacion();
		h2.setM2(50.2);
		h2.setTipo("cocina");
		
		Habitacion h3 = new Habitacion();
		h3.setM2(70.2);
		h3.setTipo("salon");
		
		Habitacion h4 = new Habitacion();
		h4.setM2(40.5);
		h4.setTipo("dormitorio");
		
		ArrayList<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
		
		listaHabitacion.add(h1);
		listaHabitacion.add(h2);
		listaHabitacion.add(h3);
		listaHabitacion.add(h4);
		
		
		Persona p1 = new Persona();
		p1.setNombre("jorgito");
		p1.setEdad(24);
		p1.setPeso(72);
		Direccion d1p = new Direccion();
		d1p.setCiudad("Alcala De Henares");
		d1p.setNombreVia("calle Portilla");
		d1p.setCp("28801");
		
		p1.setDireccion(d1p);
		
		
		Casa casa1 = new Casa();
		casa1.setPrecio(500);
		casa1.setPropietario(p1);
		casa1.setListaHabitacion(listaHabitacion);
		Direccion casadir = new Direccion();
		casadir.setCiudad("Madrid");
		casadir.setNombreVia("victoria");
		casadir.setCp("28861");
		casadir.setTipoVia("calle");
		casa1.setDireccion(casadir);

		System.out.println(casa1);
		System.out.println(p1);
		System.out.println(casa1.getListaHabitacion());
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
