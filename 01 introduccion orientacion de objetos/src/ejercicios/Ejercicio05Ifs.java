package ejercicios;
import java.util.Scanner;

public class Ejercicio05Ifs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String car = sc.next();
				char car2 = sc.next().charAt(0);
				if (car2 == 'H')
					System.out.println("Hombre");
				else
					System.out.println("mujer");
		int mes = 14;
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("el mes : " + mes + " es de 31");
			break;
		case 4: case 6: case 9: case 11:  
			System.out.println("el mes : " + mes + " es de 30");
			break;
		case 2:
			System.out.println("el mes : " + mes + " es de 28/29");
			break;
		default:
			System.out.println("tas equivocao de 1 al 12 mu�on");
		}
		
		System.out.println("terminao");
		
		
	/*	int num = 4;
		if (num == 4) {
			System.out.println("es 4");
			System.out.println("algo mas de 4");
			
		}else { if (num < 4) {
			System.out.println("menor de cuatro");
		}	else {
				System.out.println("mayor de cuatro");
		}
			System.out.println("no es cuatro");
			System.out.println("algo mas deno es 4");
			}
		System.out.println("es todo todooo asmigoooooooooo");
	*/
	}

}
