package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Aeropuerto;

public class MainAeropuertoSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Aeropuerto aeropuerto = context.getBean("A1",Aeropuerto.class);
		System.out.println(aeropuerto);
		

	}

}
