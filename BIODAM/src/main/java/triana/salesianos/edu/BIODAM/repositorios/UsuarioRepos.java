package triana.salesianos.edu.BIODAM.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import triana.salesianos.edu.BIODAM.model.Usuarios;

public interface UsuarioRepos extends JpaRepository<Usuarios,Long> {

}
