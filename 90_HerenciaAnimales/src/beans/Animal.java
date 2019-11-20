package beans;

public class Animal {

	private String color;
	
	public Animal() {
		super();
		
	}

	public Animal(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + "]";
	}
	
	public void  saludar() {
		System.out.println("soy un ANIMAL");
		
	}
	
	public void sonido() {
		System.out.println("soy ficticio ni p.1. del sonido que hago");
		
	}
}


