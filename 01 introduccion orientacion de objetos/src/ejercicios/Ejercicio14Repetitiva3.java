package ejercicios;

public class Ejercicio14Repetitiva3 {
	public static void main(String[] args) {
		 
		int mult37 =0, mult3 = 0, mult7 = 0;
		System.out.println("SOLUCION VERSION 1 IF SECUENCIA\n");
		for(int i=1; i<= 250; i++) {
			if (i%3 != 0 && i%7 != 0) {
 //				System.out.println("pasa");
				continue;
			}
			if (i%3 == 0)
				mult3++;
			if (i%7 == 0)
				mult7++;
			if (i%3 == 0 && i%7 == 0) {
				System.out.println("mul 3 y 7 : " + i);
				mult37++;
			}
			
			
		}
		
		System.out.println("multiplos de 3 : " + mult3);
		System.out.println("multiplos de 7 : " + mult7);
		System.out.println("multiplos de 3 y 7 : " + mult37);
		System.out.println("de ninguno : " + (250-(mult3 + mult7 - mult37)));
		
		System.out.println("\n\nSOLUCION VERSION 2 IF ANIDADO\n");
		 
				  mult37 =0;
				  mult3 = 0;
				  mult7 = 0;
				
				for(int i=1; i<= 250; i++) {
					if (i%3 != 0 && i%7 != 0) {
		 //				System.out.println("pasa");
						continue;
					}
					if (i%3 == 0 && i%7 == 0) {
						System.out.println("mul 3 y 7 V2: " + i);
						mult37++;
						mult3++;
						mult7++;
					}else
						if (i%3 == 0)
							mult3++;
						else
							mult7++;
					
					
				}
				
				System.out.println("multiplos de 3 V2: " + mult3);
				System.out.println("multiplos de 7 V2: " + mult7);
				System.out.println("multiplos de 3 y 7 V2: " + mult37);
				System.out.println("de ninguno V2: " + (250-(mult3 + mult7 - mult37)));
				
		
	}

}
