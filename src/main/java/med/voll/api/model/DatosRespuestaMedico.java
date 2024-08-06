package med.voll.api.model;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        Especialidad Especialidad,
        DatosDireccion direccion) {
}
