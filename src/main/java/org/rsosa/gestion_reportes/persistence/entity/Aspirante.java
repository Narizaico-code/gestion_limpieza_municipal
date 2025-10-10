package org.rsosa.gestion_reportes.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Aspirantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aspirante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aspirante_id")
    private Long CodigoAspirante;
    @Column(nullable = false)
    private String Nombre;
    @Column(nullable = false)
    private String Apellido;
    @Column(nullable = false)
    private Integer Telefono;
    @Column(nullable = false)
    private String correo;
    @ManyToOne
    @JoinColumn(name = "hiring_id", referencedColumnName = "hiring_id")
    private Contratacion contratacion;
}
