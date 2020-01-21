package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Cliente;
import modelo.persistencia.DaoClientes;


@Service
public class GestorClientes {
	@Autowired
	private DaoClientes daoClientes;

	//Como no quiero que se me olvide poner la libreria
	//y ademas este gestor no funciona sin la libraria
	//creo INICAMENTE el constructor con la libreria
	//y quito set
	public GestorClientes(DaoClientes daoClientes) {
		super();
		this.daoClientes = daoClientes;
	}


	
	
	
	public GestorClientes() {
		super();
	}

	/**
	 * Dar de alta un libro
	 * @param libro libro a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso
	 * de que falte el isbn, 2 en caso de que falte el titulo
	 * y 3 en caso de que el isbn este duplicado
	 */
	public int alta(Cliente cliente) {
		
		if( cliente.getDni().length() != 9) {
			 return 1;
		}
		
		
		
		return daoClientes.alta(cliente);
	}


	public Cliente buscarPorId(int id) {
		return daoClientes.buscarPorId(id);
	}

	public List<Cliente> buscarPorNombre(String nombre){
		return daoClientes.buscarPorNombre(nombre);
	}
		public boolean borrar(int id) {
		return daoClientes.borrar(id);
	}
		public List<Cliente> getListaClientes() {
			return daoClientes.getListaClientes();
		}
	}
