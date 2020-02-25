package modelo.entidad;

import java.util.List;

public class Avion {
private int id;
private String Marca;
private List <Asiento>listaAsientos;
private List<Motor>listaMotores;
private List<Rueda>listaRuedas;
private int Kilometros;
public Avion() {
	super();
}
public Avion(int id, String marca, List<Asiento> listaAsientos, List<Motor> listaMotores, List<Rueda> listaRuedas,
		int kilometros) {
	super();
	this.id = id;
	Marca = marca;
	this.listaAsientos = listaAsientos;
	this.listaMotores = listaMotores;
	this.listaRuedas = listaRuedas;
	Kilometros = kilometros;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMarca() {
	return Marca;
}
public void setMarca(String marca) {
	Marca = marca;
}
public List<Asiento> getListaAsientos() {
	return listaAsientos;
}
public void setListaAsientos(List<Asiento> listaAsientos) {
	this.listaAsientos = listaAsientos;
}
public List<Motor> getListaMotores() {
	return listaMotores;
}
public void setListaMotores(List<Motor> listaMotores) {
	this.listaMotores = listaMotores;
}
public List<Rueda> getListaRuedas() {
	return listaRuedas;
}
public void setListaRuedas(List<Rueda> listaRuedas) {
	this.listaRuedas = listaRuedas;
}
public int getKilometros() {
	return Kilometros;
}
public void setKilometros(int kilometros) {
	Kilometros = kilometros;
}
@Override
public String toString() {
	return "Avion [id=" + id + ", Marca=" + Marca + ", listaAsientos=" + listaAsientos + ", listaMotores="
			+ listaMotores + ", listaRuedas=" + listaRuedas + ", Kilometros=" + Kilometros + "]";
}

}
