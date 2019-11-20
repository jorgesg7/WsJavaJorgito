package testbeans;

import beans.Cliente;
import beans.Pedido;

public class TestPedido {

	
	public static void main(String[] arg)  {
		Pedido ped1 = new Pedido(1, "tornillo 4-30", 1, true, Cliente.dameCliente());
		
		
		System.out.println("pedido : " + ped1.getIdPedido());
		System.out.println("\tdescripcion : " + ped1.getDescripcion());
		System.out.println("\tCliente : " + ped1.getCliente().getNombre().toUpperCase());
		
		Pedido ped2= new Pedido(2, "engletadora", 150, true, Cliente.dameCliente());
		
		
		
		
		
	}
}
