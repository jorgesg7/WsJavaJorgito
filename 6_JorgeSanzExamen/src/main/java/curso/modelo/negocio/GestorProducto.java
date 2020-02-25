package curso.modelo.negocio;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.modelo.entidad.Producto;
import curso.modelo.persistencia.DaoProducto;

@Service
public class GestorProducto {
	@Autowired
	private DaoProducto dp;

	/**
	 * Dar de alta un producto
	 * 
	 * @param Producto producto a dar de alta
	 * @return 0 en caso de que haya ido bien, 1,2,3... en caso de fata de algún
	 *         parametro
	 */
	@Transactional
	public int altaProducto(Producto producto) {
		if (producto.getNombre().isEmpty()) {
			return 1;
		}

		if (producto.getPrecio()==0) {
			return 2;
		}
		
		if (producto.getCategoria().isEmpty()) {
			return 3;

		}

		dp.save(producto);
		return 0;
	}
}
