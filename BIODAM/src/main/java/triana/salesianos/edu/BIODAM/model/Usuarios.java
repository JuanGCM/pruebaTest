package triana.salesianos.edu.BIODAM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuarios {

    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    private String contraseña;
    private String email;
    private boolean esAdmin;


}
