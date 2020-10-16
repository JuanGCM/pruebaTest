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
public class LineaPedido {

    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private Productos idPro;

    @ManyToOne
    private Pedidos idPe;

}
