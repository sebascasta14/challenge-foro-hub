package com.challenge.challenge_foro_hub.domain.usuarios;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(
        @NotBlank
        String username,
        @NotBlank
        String password
) {
}
