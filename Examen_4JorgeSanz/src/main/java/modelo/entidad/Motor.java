package modelo.entidad;

public class Motor {
private int CV;
private int Cilindrada;
public Motor() {
	super();
}
public Motor(int cV, int cilindrada) {
	super();
	CV = cV;
	Cilindrada = cilindrada;
}
public int getCV() {
	return CV;
}
public void setCV(int cV) {
	CV = cV;
}
public int getCilindrada() {
	return Cilindrada;
}
public void setCilindrada(int cilindrada) {
	Cilindrada = cilindrada;
}
@Override
public String toString() {
	return "Motor [CV=" + CV + ", Cilindrada=" + Cilindrada + "]";
}
	
}
