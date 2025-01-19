package com.challenge.challenge_foro_hub.domain.topicos;

public record DatosEspecificoTopico(
        Long id,
                String titulo,
                String mensaje,
                String fechaCreacion,
                String status,
                String autor,
                String curso
) {}
