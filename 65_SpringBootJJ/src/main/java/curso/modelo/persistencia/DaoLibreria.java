package curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidad.Libro;

public interface DaoLibreria extends JpaRepository<Libro, Integer>{
	
}
