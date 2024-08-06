package med.voll.api.model.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;


public record DatosDireccion(

        @NotBlank
        String calle,

        @NotBlank
        String ciudad,

        @NotBlank
        String numero
) {
}
