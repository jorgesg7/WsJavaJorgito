package modelo.entidad;

import java.util.ArrayList;

public class Aeropuerto {
	private String Nombre;
	private String Ciudad;
	private ArrayList <Avion> listaAviones;
	public Aeropuerto() {
		super();
	}
	public Aeropuerto(String nombre, String ciudad, ArrayList<Avion> listaAviones) {
		super();
		Nombre = nombre;
		Ciudad = ciudad;
		this.listaAviones = listaAviones;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public ArrayList<Avion> getListaAviones() {
		return listaAviones;
	}
	public void setListaAviones(ArrayList<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}
	@Override
	public String toString() {
		return "Aeropuerto [Nombre=" + Nombre + ", Ciudad=" + Ciudad + ", listaAviones=" + listaAviones + "]";
	}

}
