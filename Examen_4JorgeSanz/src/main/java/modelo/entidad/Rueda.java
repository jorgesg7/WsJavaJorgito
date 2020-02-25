package modelo.entidad;

public class Rueda {
private String Marca;
private String Material;
public Rueda() {
	super();
}
public Rueda(String marca, String material) {
	super();
	Marca = marca;
	Material = material;
}
public String getMarca() {
	return Marca;
}
public void setMarca(String marca) {
	Marca = marca;
}
public String getMaterial() {
	return Material;
}
public void setMaterial(String material) {
	Material = material;
}
@Override
public String toString() {
	return "Rueda [Marca=" + Marca + ", Material=" + Material + "]";
}

}
