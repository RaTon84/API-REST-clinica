package med.voll.api.model.DTO;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccion(

        @NotBlank
        String calle,

        @NotBlank
        String ciudad,

        @NotBlank
        String numero
) {
}
