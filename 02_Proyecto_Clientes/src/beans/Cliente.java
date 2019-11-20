package beans;

public class Cliente {
	
	   private String  usuario, pwe, nombre, apellidos, direccion;
	   
	   
	
	public Cliente(String usuario, String pwe, String nombre, String apellidos, String direccion) {
		super();
		this.usuario = usuario;
		this.pwe = pwe;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}
	
	public Cliente() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwe() {
		return pwe;
	}

	public void setPwe(String pwe) {
		this.pwe = pwe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", pwe=" + pwe + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + "]";
	}

	public static Cliente dameCliente() {
		return new Cliente("tomas", "tomas" , " tomasin","escu", "calle pez, 3, madrid"); 
	}
	public  static Cliente [] dameClientes() {
		   Cliente []clientes = {
			   new Cliente("tomas", "tomas" , " tomasin","escu", "calle pez, 3, madrid"),
			   new Cliente("sara", "sara" , "sarita","perez", "calle nuez, 32, sevilla"),
			   new Cliente("eva", "ruiz" , "evita","goma", "calle lirio, 35, cadiz"),
			   new Cliente("ana", "ana" , "anita", "lista", "calle rosa, 333, cuenca")}; 
		   
			   return clientes;
			   
			   
			   
		   }
	   }
	   

