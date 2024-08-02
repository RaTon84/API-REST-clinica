package med.voll.api.model;

public record DatosListadoMedico(

        Long id,
        String nombre,
        String email,
        String telefono,
        String especialidad) {
    public DatosListadoMedico(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEmail(), medico.getTelefono(), medico.getEspecialidad().toString());
    }

}
