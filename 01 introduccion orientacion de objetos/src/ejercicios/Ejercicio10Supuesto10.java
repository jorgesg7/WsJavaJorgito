package ejercicios;
import java.util.Scanner;

public class Ejercicio10Supuesto10 {
	public static void main(String[] args) {
		String usuario=null, pwd = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("usuario ");
		usuario = sc.next();
		System.out.print("contrase�a ");
		pwd = sc.next();
		sc.close();
		if (usuario.equals("sara")) {
			if (pwd.equals("sarita"))
				System.out.println("usuario y contrase�a correctas, bienvenido a la aplicaci�n");
			else
				System.out.println("contrase�a incorrecta");
		}else
			System.out.println("usuario incorrecto");
		
		
		
		
		
		
		
		if (usuario.equals("sara")&& pwd.equals("sarita"))
			System.out.println("usuario y contrase�a correctas, bienvenido a la aplicaci�n");
		else
			System.out.println("usuario o contrase�a incorrectos, sorry");
			
		
	}
	

}
