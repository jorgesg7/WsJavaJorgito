package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCoche {

	public static void main(String[] args) {
		
		//System.in es un stream de entrada
				Scanner sc = new Scanner(System.in);

				System.out.println("Introduzca el id: ");
				String id = sc.next();
				System.out.println("introduzca la matricula: ");
				String matricula= sc.next();
				System.out.println("introduzca el modelo: ");
				String modelo = sc.next();
				System.out.println("introduzca marca: ");
				String marca = sc.next();
				
				int iId = Integer.parseInt(id);
				
				//nos conectamos al servidor para mandarle
				//los numeros
				
				//si hacemos esto de una manera clasica, deberiams
				//crear estar variables fuera del try y luego 
				//cerrarlas en el bloque finally. Desde la version
				//1.7 de java, podemos poner las variables que queremos
				//cerrar automaticamente dentro de los parentesis del try
				//y cuando salga se cerraran
				//con el comando ipconfig podemos saber nuestras ips
				try(Socket socket = new Socket("127.0.0.1",1983);
						PrintStream ps = new PrintStream(socket.getOutputStream())) {
					//creamos el tubo
					
					//creamos un objeto que me permite escribir
					//sobre el output stream del socket
					ps.println(id + "/" + matricula + "/" + modelo + "/" + marca);
					
					//ahora en el cliente tendremos que ller la inforamcion
					//del servidor
					InputStreamReader isr = new InputStreamReader(socket.getInputStream());
					
					//para leer por frases, podemos usar la siguiente clase
					BufferedReader bf = new BufferedReader(isr);
					//en este linea nos quedaremos parados hasta que 
					//el servidor nos responda
					System.out.println("cliente: " + bf.readLine());
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}

		}
