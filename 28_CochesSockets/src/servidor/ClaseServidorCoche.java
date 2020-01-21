package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import cliente.Coche;

public class ClaseServidorCoche {

	public static void main(String[] args) {
		

	

		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1983);
			System.out.println("Server escuchando por el puerto 1983");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		ArrayList<Coche>listaCoches = new ArrayList<Coche>();
		
		//hacemos que el servidor nunca se pare y esta
		//escuchando peticiones
		while (true) {
			System.out.println("Escuchando peticiones...");
			try (Socket socket = ss.accept();) {
				// ServerSocket ss = new ServerSocket(2019);
				// abrimos el puerto y escuchamos peticiones
				// hechas por un socket

				// Socket socket = ss.accept();
				// Este metodo se quedara parado el hilo de ejecucion
				// hasta que llegue la peticion de un cliente
				// cuando llegue la peticion de un cliente
				// se continuara ejecutando el codigo y se nos
				// creara un objeto Socket

				// usamos la clase InputStreamReader para leer del
				// tunel de entrada de datos, lo que pasa es que esta
				// clase solo me permite leer caracter a caracter
				
				//podemos pintar la ip que me llame
				System.out.println(socket.getInetAddress().getHostAddress());
				
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				// para leer por frases, podemos usar la siguiente clase
				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				System.out.println("Ha llegado lo siguiente al servidor: " + cadena);
				//23-34-1
				String[] vehiculo = cadena.split("/");
				String id = vehiculo[0];
				String matricula = vehiculo[1];
				String modelo = vehiculo[2];
				String marca = vehiculo[3];

				int iId = Integer.parseInt(id);
				PrintStream ps = new PrintStream(socket.getOutputStream());
				
				
				Coche coche = new Coche();
				coche.setId(iId);
				coche.setMatricula(matricula);
				coche.setMarca(marca);
				coche.setModelo(modelo);
				listaCoches.add(coche);
				
				
				
				
				PrintStream ps = new PrintStream(socket.getOutputStream());
				

				System.out.println("Fin del servidor");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException nfe) {
				System.out.println("No es un numero lo que han mandado");
			}
		}
	}
}

