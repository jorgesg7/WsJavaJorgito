package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Coche;



public class MainSpringCoche {

	public static ApplicationContext context;
	
	
	public static void main(String[] args) {
		

		context = new ClassPathXmlApplicationContext("beans.xml");
		
		Coche c1 =(Coche)context.getBean("coche1");
		Coche c2 =(Coche)context.getBean("coche2");
		Coche c3 =(Coche)context.getBean("coche3");
		Coche c4 =(Coche)context.getBean("coche4");
		Coche c5 =(Coche)context.getBean("coche5");
		
		imprimirCoche(c1);
		imprimirCoche(c2);
		imprimirCoche(c3);
		imprimirCoche(c4);
		imprimirCoche(c5);
		imprimirCocheSpring();
		
	}
	private static void imprimirCocheSpring() {
			Coche c1 = (Coche)context.getBean("coche1");
			System.out.println(c1.getMarca());	
		}
			private static void imprimirCoche(Coche coche) {
				System.out.println(coche.toString());
			
	}

   }
