package com.challenge.challenge_foro_hub.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosActualizarTopico(
        @NotBlank
        String mensaje,
        @NotBlank
        String curso,
        @NotBlank
        String titulo
) {
}
