package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import modelo.entidad.Coche;

/**
 * Esta clase se encarga de la persistencia con la clase coche. esta clase hara un CRUD ( create, read, update,Delete)
 * sobre la entidad coche. un DAO es el acronimo de dataaccessobject y es un objeto que suele encargarse de interactuar los objetos
 * coche con la BBDD.
 * 
 * Nosotros vamos a desarrollar este DAO mediante el API de java JDBC ( java data base connection), un API es un conjunto de librerias que 
 * prpporcionan una funcionalidad, y en este caso nos daran la funcionalidad para conectarnos a una base de daros. Hay otras APIs para acceso a datos
 * como por ejemoplo JPA (Java Persistence API)
 * 
 * para usar JDBC o JPA, necesitamops los drivers de conexion que ha hecho el proveedor de nuestra baase de datos, en nuestro caso MYSQL, dependiendo del la
 * base de datos a la que nos conecctamos, necesitaremos unos driver u otros por ejemplo Oracle, Postgres, SQLite, etc.
 * 
 * asi pues lo primero que tenemos que hacer es objeter los drivers y incluirnos en nuestro proyecto. en nuestro caso necesitaremos los drivers de MYSQL 8.0(ojo con la version)
 * , que los meteremos en la carpeta lib( que tenemos que crear), y a continuacion decirle a java que tiene que utilizar dichos drivers, para ello tenemos que modificar el classpath de nuestra aplicacion java
 * Para modificar el Classpath boton derecho sobre el proyecto -> build Path -> configure Class Path
 * 
 * 
 * 
 * @author jorge
 *@see coche
 *@since 04-12-2019
 *@version 1.0
 *
 */

public class DaoCoche {
//Esto es una interfaz, el objeto que realiza la conexion a la bbdd estan dentro de las librerias de MySql
	private Connection conexion;
	//Bloque estatico, este bloque se ejecutara justo al cargar esta clase en la jvm, se ejecutara antes que el metodo main
	//esto para versiones anteriores a java 1.7
	/*static {
		//le decimos a java que carge en memoria el driver de conexion con la bbdd , para poder recuperarlo cuando hagamos la conexion
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("driver NO cargado");
		e.printStackTrace();
	}
	}*/
	public boolean abrirConexion() {
		//protocolo: subprotocolo//IP:PUERTO/NOMBRE_ESQUEMA
		//esta url depende de la bbdd a la que nos conectemos
		//la url se busca por internet (MYQSL 8.0)
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";
		//getConection me devuelve un objeto que lleva la conexion a la bbdd, esta clase(DriverManager) es la clase
		//que lleva el control del driver, estamos aplicando la iyeccion de dependencia, es decir, no creo el objeto aqui (no hago new),
		//sino que es el metodo getConnection el que me crea el objeto en mi lugar
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			//se pincha al fallo de conexion a la izquie y le damos al add. no al otro y se nos crea el catch y luego añadimos el retun los dos el false y true nosotros.
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}		
	}
	
	public boolean cerrarConexiones() {
	try {
		conexion.close();
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	
	}
	
	public boolean alta(Coche coche) {
		if(!abrirConexion()) {
			return false;
			
			
		}
		
		boolean alta = true;
		//asi no se debe hacer, por que no es optimo ni seguro para el motor de la base de datos
		/*
		String query = "insert into coches  (matricula,marca,modelo) " 
		+ " value("+ coche.getMatricula() + ","+coche.getMarca() + ","+coche.getModelo() + ")";*/
		// como hay que hacer una consulta preparada, parametrizadas...
		String query = "insert into coches ( matricula," + " marca,modelo) values(?,?,?)";
		try {
			//le decimos a la conexion que nosn haga una consuklta parametrizada a partir de la query snterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustituimos la primera interrogante por la matricula del coche
			ps.setString(1, coche.getMatricula());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			
			//esta funcion me devuelve el numero de filas adectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
					return true;
				
			}
		} catch (SQLException e) {
			System.out.println("error en el insertar");
			
			e.printStackTrace();
			return false;
			
		} finally {
			// el bloque finally se va a ejecutar SIEMPRE no importa si ha pasado por el bloque try o por el bloque catch
			cerrarConexiones();
		}
	}
	public boolean modificar(Coche coche) {
		if(!abrirConexion()) {
			return false;
		}		
		//así no se debe hacer, porque no es optimo ni seguro 
		//para el motor de la base de datos
		/*
		String query = "insert into coches (matricula,marca,modelo) "
				+ " value("+ coche.getMatricula()+
				"," + coche.getMarca() + ","+
				coche.getModelo() +	")";*/
		//como hay que hacer es con consultas preparadas, parametrizadas
		String query = "update coches set matricula=?, marca=?"
				+ ", modelo=? where id=?";
		
		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la matricula
			//del coche
			ps.setString(1, coche.getMatricula());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setInt(4, coche.getId());
			
			//esta funcion me devuelve el numero de filas
			//afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return false;
		} finally {
		//el bloque finally se va a ejecutar SIEMPRE
		//no importa si ha pasado por el bloque try o
		//por el bloque catch
			cerrarConexiones();
		}
	}
	
	public boolean borrar(Coche coche) {
		if(!abrirConexion()) {
			return false;
		}		
		
		String query = "delete from coches where id=?";
		
		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la matricula
			//del coche
			ps.setInt(1, coche.getId());
			
			//esta funcion me devuelve el numero de filas
			//afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return false;
		} finally {
		//el bloque finally se va a ejecutar SIEMPRE
		//no importa si ha pasado por el bloque try o
		//por el bloque catch
			cerrarConexiones();
		}
	}
	
	public Coche obtener(int id) {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select id,matricula,marca,modelo from "
				+ "coches where id=?";
		
		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la matricula
			//del coche
			ps.setInt(1, id);
			
			//esta funcion me devuelve el numero de filas
			//afectadas
			ResultSet rs = ps.executeQuery();
			//ResultSet es un objeto que tiene toda la lista
			//de registros que ha devuelto la consulta
			
			Coche coche = null;
			
			//asi pues, podemos recorrernos la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				coche = new Coche();
				coche.setId(rs.getInt(1));//el id esta en la primera posicion
				coche.setMatricula(rs.getString(2));
				coche.setMarca(rs.getString(3));
				coche.setModelo(rs.getString(4));
			}
			return coche;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
		//el bloque finally se va a ejecutar SIEMPRE
		//no importa si ha pasado por el bloque try o
		//por el bloque catch
			cerrarConexiones();
		}
		
	}
	
	public List<Coche> listar() {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select id,matricula,marca,modelo from coches";
		
		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//esta funcion me devuelve el numero de filas
			//afectadas
			ResultSet rs = ps.executeQuery();
			//ResultSet es un objeto que tiene toda la lista
			//de registros que ha devuelto la consulta
			
			Coche coche = null;
			List<Coche> listaCoches = new ArrayList<Coche>();
			//asi pues, podemos recorrernos la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				coche = new Coche();
				coche.setId(rs.getInt(1));//el id esta en la primera posicion
				coche.setMatricula(rs.getString(2));
				coche.setMarca(rs.getString(3));
				coche.setModelo(rs.getString(4));
				
				listaCoches.add(coche);
			}
			return listaCoches;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
		//el bloque finally se va a ejecutar SIEMPRE
		//no importa si ha pasado por el bloque try o
		//por el bloque catch
			cerrarConexiones();
		}
	}

}
       
