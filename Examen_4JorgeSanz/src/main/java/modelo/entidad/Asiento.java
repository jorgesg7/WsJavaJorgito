package modelo.entidad;

public class Asiento {
private int Numero;
private String Color;
public Asiento() {
	super();
}
public Asiento(int numero, String color) {
	super();
	Numero = numero;
	Color = color;
}
public int getNumero() {
	return Numero;
}
public void setNumero(int numero) {
	Numero = numero;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
@Override
public String toString() {
	return "Asiento [Numero=" + Numero + ", Color=" + Color + "]";
}

}
