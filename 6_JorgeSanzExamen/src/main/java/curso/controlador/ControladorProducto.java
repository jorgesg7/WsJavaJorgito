package curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Producto;
import curso.modelo.negocio.GestorProducto;



@Controller
public class ControladorProducto {
	@Autowired
	private GestorProducto gp;
	
//  mostrar pagina de alta de pelicula
	@RequestMapping("mostrarAltaProducto")
	public String mostrarAltaProducto() {
		System.out.println("Introduzca los datos del producto");
		
		return "altaProducto";
	}
	@RequestMapping("altaProducto")
	
	public ModelAndView altaProducto(
			@RequestParam() String nombre,
			@RequestParam() Double precio,
			@RequestParam() String categoria,
			ModelAndView mav) {
		
		
		//esto lo suyo es en el gestor, pero podemos
		//validar los datos
			
		//si no hay errores hago lo que tenga que hacer
		Producto pr = new Producto();
		pr.setNombre(nombre);
		pr.setPrecio(precio);
		pr.setCategoria(categoria);

		int respuesta = gp.altaProducto(pr);
		if(respuesta == 1) {
			mav.getModelMap().addAttribute("error1", "Falta el nombre");
			return mav;
		}
		
		if(respuesta == 2) {
			mav.getModelMap().addAttribute("error2", "Falta el precio");
			return mav;
		}
		
		if(respuesta == 3) {
			mav.getModelMap().addAttribute("error3", "Falta la categoria");
			return mav;
		}
		
		if(respuesta ==0) {
			return mav;
		}
	
		gp.altaProducto(pr);
		
		mav.getModelMap().addAttribute("mensaje", "Operacion dada de alta. Id: " + pr.getId());
		mav.setViewName("redirect:mostrarAltaProducto");
		return mav;
	}
}


