package med.voll.api.model.DTO;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        med.voll.api.model.Especialidad Especialidad,
        DatosDireccion direccion) {
}
