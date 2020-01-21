package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.stereotype.Repository;

import modelo.entidad.Cliente;

import vista.MainSpringBBDDClientes;

@Repository
public class DaoClientes {
	private Connection conexion;
	public boolean abrirConexion() {
		// protocolo:subprotocolo//IP:PUERTO/NOMBRE_ESQUEMA
		// esta url depende de la bbddd a la que nos conectemos
		String url = "jdbc:mysql://localhost:3306/gestion_clientes?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";

		// getConeccion me devuelve un objeto que lleva la conexión
		// a la bbdd, esta clase (DriverManager) es la clase
		// que lleva el control del driver
		// Estamos aplicando la Inyeccion de dependecia, es decir,
		// no creo el objeto aqui (no hago new), sino que es
		// el metodo getConnection el que me crea el objeto
		// en mi lugar
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
public List<Cliente> getListaClientes() {
	if (!abrirConexion()) {
		return null;
	}

	String query = "select id,dni,nombre,edad from clientes";

	try {
		// le decimos a la conexion que nos haga una consulta
		// parametrizada a partir de la query anterior
		PreparedStatement ps = conexion.prepareStatement(query);
		// esta funcion me devuelve el numero de filas
		// afectadas
		ResultSet rs = ps.executeQuery();
		// ResultSet es un objeto que tiene toda la lista
		// de registros que ha devuelto la consulta

		Cliente cliente = null;
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		// asi pues, podemos recorrernos la lista
		while (rs.next()) {// preguntamos si hay un registro mas
			cliente = MainSpringBBDDClientes.context.getBean("cliente",Cliente.class);
			//libro = (Libro)MainLibreria.context.getBean("libro");
			cliente.setId(rs.getInt(1));// el id esta en la primera posicion
			cliente.setDni(rs.getString(2));
			cliente.setNombre(rs.getString(3));
			cliente.setEdad(rs.getInt(4));
			

			listaClientes.add(cliente);
		}
		return listaClientes;
	} catch (SQLException e) {
		System.out.println("Error al listar");
		e.printStackTrace();
		return null;
	} finally {
		// el bloque finally se va a ejecutar SIEMPRE
		// no importa si ha pasado por el bloque try o
		// por el bloque catch
		cerrarConexion();
	}
}

public int alta(Cliente cliente) {
	if (!abrirConexion()) {
		return 4;
	}

	// así no se debe hacer, porque no es optimo ni seguro
	// para el motor de la base de datos
	/*
	 * String query = "insert into coches (matricula,marca,modelo) " + " value("+
	 * coche.getMatricula()+ "," + coche.getMarca() + ","+ coche.getModelo() + ")";
	 */
	// como hay que hacer es con consultas preparadas, parametrizadas
	String query = "insert into clientes (dni,nombre,edad) values(?,?,?)";

	try {
		// le decimos a la conexion que nos haga una consulta
		// parametrizada a partir de la query anterior
		PreparedStatement ps = conexion.prepareStatement(query);
		// sustimos la primera interrogante por la matricula
		// del coche
		
		ps.setString(1, cliente.getDni());
		ps.setString(2, cliente.getNombre());
		ps.setInt(3, cliente.getEdad());

		// esta funcion me devuelve el numero de filas
		// afectadas
		int numeroFilas = ps.executeUpdate();
		if (numeroFilas == 0) {
			return 4;
		} else {
			return 0;
		}
	} catch (SQLException e) {
		System.out.println("Error en el alta cliente");
		e.printStackTrace();
		return 4;
	} finally {
		// el bloque finally se va a ejecutar SIEMPRE
		// no importa si ha pasado por el bloque try o
		// por el bloque catch
		cerrarConexion();
	}
}

public Cliente buscarPorId(int id) {
	if (!abrirConexion()) {
		return null;
	}

	String query = "select id,dni,nombre,edad from " 
			+ "clientes where id=?";

	try {
		// le decimos a la conexion que nos haga una consulta
		// parametrizada a partir de la query anterior
		PreparedStatement ps = conexion.prepareStatement(query);
		// sustimos la primera interrogante por la matricula
		// del coche
		ps.setInt(1, id);

		// esta funcion me devuelve el numero de filas
		// afectadas
		ResultSet rs = ps.executeQuery();
		// ResultSet es un objeto que tiene toda la lista
		// de registros que ha devuelto la consulta

		Cliente cliente = null;

		// asi pues, podemos recorrernos la lista
		while (rs.next()) {// preguntamos si hay un registro mas
			cliente = MainSpringBBDDClientes.context.getBean("cliente",Cliente.class);
			cliente.setId(rs.getInt(1));// el id esta en la primera posicion
			cliente.setDni(rs.getString(2));
			cliente.setNombre(rs.getString(3));
			cliente.setEdad(rs.getInt(4));
			
		}
		return cliente;
	} catch (SQLException e) {
		System.out.println("Error en buscar por id");
		e.printStackTrace();
		return null;
	} finally {
		// el bloque finally se va a ejecutar SIEMPRE
		// no importa si ha pasado por el bloque try o
		// por el bloque catch
		cerrarConexion();
	}
}

public List<Cliente> buscarPorNombre(String Nombre) {
	if (!abrirConexion()) {
		return null;
	}
	String query = "select id,dni,nombre,edad from " 
			+ "clientes where nombre=?";
	

	try {
		// le decimos a la conexion que nos haga una consulta
		// parametrizada a partir de la query anterior
		PreparedStatement ps = conexion.prepareStatement(query);
		// sustimos la primera interrogante por la matricula
		// del coche
		ps.setString(1, Nombre);

		// esta funcion me devuelve el numero de filas
		// afectadas
		ResultSet rs = ps.executeQuery();
		// ResultSet es un objeto que tiene toda la lista
		// de registros que ha devuelto la consulta

		Cliente cliente = null;
		//tambien podriamos hacerlo aqui si damos de alta el libro
		List<Cliente> listaClientesNombre = new ArrayList<Cliente>();
		// asi pues, podemos recorrernos la lista
		while (rs.next()) {// preguntamos si hay un registro mas
			cliente = MainSpringBBDDClientes.context.getBean("cliente",Cliente.class);
			cliente.setId(rs.getInt(1));// el id esta en la primera posicion
			cliente.setDni(rs.getString(2));
			cliente.setNombre(rs.getString(3));
			cliente.setEdad(rs.getInt(4));
			
			
			listaClientesNombre.add(cliente);
		}
		return listaClientesNombre;
	} catch (SQLException e) {
		System.out.println("Error en buscar por nombre");
		e.printStackTrace();
		return null;
	} finally {
		// el bloque finally se va a ejecutar SIEMPRE
		// no importa si ha pasado por el bloque try o
		// por el bloque catch
		cerrarConexion();
	}
	
	
}

//METODO PARA BORRAR POR ID
		public boolean borrar(int id) {
			if (!abrirConexion()) {
				return false;
			}

			String query = "delete from clientes where id=?";

			try {
				
				PreparedStatement ps = conexion.prepareStatement(query);
				
				ps.setInt(1, id);

				// esta funcion me devuelve el numero de filas
				// afectadas
				int numeroFilas = ps.executeUpdate();
				if (numeroFilas == 0) {
					return false;
				} else {
					return true;
				}
			} catch (SQLException e) {
				System.out.println("Error al borrar cliente");
				e.printStackTrace();
				return false;
			} finally {
			cerrarConexion();
			}
		}

}


