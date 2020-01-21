package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero 1: ");
		String numero1 = sc.next();
		System.out.println("introduzca el numero 2: ");
		String numero2 = sc.next();
		System.out.println("deseo sumar, restar, multiplicar o dividir");
		String opcion = sc.next();
	
		try(Socket socket = new Socket("127.0.0.1",1995);
				PrintStream ps = 
						new PrintStream(socket.getOutputStream())) {
			ps.println(numero1 + "/" + numero2 + "/" + opcion );
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			
			BufferedReader bf = new BufferedReader(isr);
			System.out.println("cliente: " + bf.readLine());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}

}
