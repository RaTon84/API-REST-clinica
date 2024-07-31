package med.voll.api.model;

public record DatosListadoMedico(

        String nombre,
        String email,
        String telefono,
        String especialidad) {
    public DatosListadoMedico(Medico medico){
        this(medico.getNombre(), medico.getEmail(), medico.getTelefono(), medico.getEspecialidad().toString());
    }

}
