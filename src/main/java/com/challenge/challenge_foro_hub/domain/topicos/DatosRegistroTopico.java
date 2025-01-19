package com.challenge.challenge_foro_hub.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank
        String autor,
        @NotBlank
        String mensaje,
        @NotBlank
        String curso,
        @NotBlank
        String titulo
) {
}
