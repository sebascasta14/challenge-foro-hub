package com.challenge.challenge_foro_hub.domain.topicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @Column(unique = true)
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Boolean status;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistro) {
        this.status = true;
        this.titulo = datosRegistro.titulo();
        this.mensaje = datosRegistro.mensaje();
        this.fechaCreacion = LocalDateTime.now(ZoneId.of("America/Bogota"));
        this.autor = datosRegistro.autor();
        this.curso = datosRegistro.curso();
    }
}
