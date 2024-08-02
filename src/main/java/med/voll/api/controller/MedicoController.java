package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private IMedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
        System.out.println("llego el request");
        System.out.println(datosRegistroMedico);
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public Page<DatosListadoMedico> ListarMedicos(@PageableDefault(size = 3,sort = "nombre") Pageable paginacion){
        //return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new); metodo sin filtro
        return medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new);
    }

    @PutMapping
    @Transactional
    public void ModificarMedico(@RequestBody DatosActualizarMedico datosActualizarMedico){
        Medico medico = medicoRepository.getReferenceById(datosActualizarMedico.id());
        medico.actualizarDatosMedico(datosActualizarMedico);
    }

    // delete logico
    @DeleteMapping("/{id}")
    @Transactional
    public void EliminarMedico(@PathVariable Long id){
        Medico medico = medicoRepository.getReferenceById(id);
        medico.EliminarMedico();
    }

     //delete a nivel base de datos
    @DeleteMapping("/{id}")
    @Transactional
    public void EliminarMedicoDb(@PathVariable Long id){
        Medico medico = medicoRepository.getReferenceById(id);
        medicoRepository.delete(medico);
    }
}
