package med.voll.api.model.DTO;

public record DatosActualizarMedico(
        Long id,
        String nombre,
        String email,
        String telefono
) {
}
