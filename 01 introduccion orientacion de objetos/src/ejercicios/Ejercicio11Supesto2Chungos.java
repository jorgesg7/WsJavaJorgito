package ejercicios;

public class Ejercicio11Supesto2Chungos {
 	static double comision, salario, aumento, subida;
	
	
	public static void main(String[] args) {
		salario = 15000;
		aumento = 0;
		comision = 2000;
		 
		 if (comision == 0) {
			verSalario();
		 }else {
			verComision();
		 }
		 System.out.print("el salario era : " + salario);
		 System.out.print("\tla subida es  : " + subida + "%");
		 System.out.print("\tel aumento es : " + aumento);
		 System.out.println("\tte queda el salario  : " + (salario+aumento));
		 
		 
			 
	}
	
	private static void verSalario() {
		if (salario < 15000) {
			subida = 10;
			aumento = salario * subida/100;
		}else { if (salario >=15000 && salario < 3000) {
					subida = 8;
					aumento = salario * subida/100;
				}else { if (salario >= 30000 && salario < 45000) {
							subida = 4;
							aumento = salario * subida/100;
						}else
							subida = 0;
							aumento = 0;
				}
			
		}
		
	}
	
	private static void verComision() {
		if (comision < 2000) {
			subida = 12;
			aumento = salario * subida/100;
		}else { if (comision >=2000 && comision < 10000){
					subida = 6;
					aumento = salario * subida/100;
		}else {
					subida = 0;
					aumento = 0;
		}
		}	
	 
	}
	
/*
 *  Cuanto ganaba al principio,
 	qu� % de subida le corresponde
 	cuanto supone el aumento (cero si no es nada)
 	En cuanto se le queda el sueldo.

 * */
  
}
