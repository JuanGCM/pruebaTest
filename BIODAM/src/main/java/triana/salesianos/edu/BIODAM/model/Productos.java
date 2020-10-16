package triana.salesianos.edu.BIODAM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class Productos {

    @Id @GeneratedValue
    private long id;

    private String nombre;
    private long precio;
    private String estado;

    @ManyToOne
    private Categorias idCate;


}
