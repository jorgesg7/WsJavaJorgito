package modelo.entidad;

public class Motor {

	private String TipoMotor;
	private int CV;
	private int Cilindrada;
	
	
	public Motor() {
		super();
	}


	public Motor(String tipoMotor, int cV, int cilindrada) {
		super();
		TipoMotor = tipoMotor;
		CV = cV;
		Cilindrada = cilindrada;
	}


	public String getTipoMotor() {
		return TipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		TipoMotor = tipoMotor;
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
		return "Motor [TipoMotor=" + TipoMotor + ", CV=" + CV + ", Cilindrada=" + Cilindrada + "]";
	}
	
	
	
}
