package triana.salesianos.edu.BIODAM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class Categorias {

    @Id @GeneratedValue
    private long id;

    private String nombre;
}
