package com.challenge.challenge_foro_hub.domain.topicos;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion
) {}
