import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Coliseo {
	private List<Personaje> luchadores;
	
	public Coliseo(List<Personaje> luchadores) {
		this.luchadores = luchadores;
	}
	
	public void empezar() {
		System.out.println("BIENVENIDOS A NUESTRO COMBATE!!!");
		for(Personaje p : luchadores) {
			System.out.println("LUCHADOR: " + p);
		}
		
		boolean acabado = false;
		int turno = 1;
		do {
			System.out.println("Pulse enter para continuar!");
			new Scanner(System.in).nextLine();
			System.out.println("**************************");
			System.out.println("LISTA DE SUPERVIVIENTES");
			System.out.println(luchadores.size());
			System.out.println("******* TURNO " + turno++ + "*******");
			for(Personaje p : luchadores) {
				Random r = new Random();
				int aleatorio = ThreadLocalRandom.current().nextInt(0, luchadores.size());
				//cabe la posiblidad que el personaje se ataque a si mismo
				//pifia??
				Personaje enfrentado = luchadores.get(aleatorio);
				int danio = p.atacar(enfrentado);
				
				System.out.println("Da�o hecho por " + p.getNombre() 
				+ " a " + enfrentado.getNombre() + " ha sido " + danio);
			}		
			
			List<Personaje> luchadoresVivos = new ArrayList<Personaje>();
			for(Personaje p : luchadores) {
				System.out.println("Vida actual de " 
						+ p.getNombre() + " es " + p.getVida());
				if(p.getVida() > 0) {
					luchadoresVivos.add(p);
				}else {
					System.out.println("Personaje " + p.getNombre() + " a muerto");
				}
			}
			
			luchadores = luchadoresVivos;
			
			if(luchadores.size() <= 1) {
				acabado = true;
			}
		}while(!acabado);
		
		System.out.println("El ganador ha sido: ");
		System.out.println(luchadores);
	}
}
