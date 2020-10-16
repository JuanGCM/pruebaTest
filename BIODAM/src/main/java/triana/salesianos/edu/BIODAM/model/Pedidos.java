package triana.salesianos.edu.BIODAM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity @AllArgsConstructor
@Data @NoArgsConstructor
public class Pedidos {

    @Id @GeneratedValue
    private long id;

    private LocalDate fecha;

    @ManyToOne
    private Usuarios idUsu;

    private String estado;



}
