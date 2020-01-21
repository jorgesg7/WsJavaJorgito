package cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteSuma {

	public static void main(String[] args) {
		//system.in es un stream de entrada
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduzca el numero 1: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el numero2: ");
		int numero2 = sc.nextInt();
		
		//nos conectamos al servidor para mandarle
		// los numeros
		try {
			//creamos el tubo
			Socket socket = new Socket("127.0.0.1" ,2019);
			//creamos un objeto que me permite escribir sobre el output stream del socket
			PrintStream ps = new PrintStream(socket.getOutputStream());
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
