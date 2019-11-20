package beans;

public class Gato extends Animal {
	protected int vidas;

	public Gato(String color, int vidas) {
		super(color);
		this.vidas = vidas;
	}
	public Gato() {
		super();
		
	}
	public int getVida() {
		return vidas;
	}

	public void setVida(int vida) {
		this.vidas = vida;
	}

	public void mostrarDatos() {
		
		System.out.println("vidas : " + vidas);
		System.out.println("color : " + color);
		
		
		
	}
	public void trepar() {
		System.out.println("Trepo que  lo flipas");
		
		
	}

}
