package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.model.DTO.DatosJWTToken;
import med.voll.api.model.DTO.DatosLoginUsuario;
import med.voll.api.model.Usuario;
import med.voll.api.service.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity AutenticarUsuario(@RequestBody @Valid DatosLoginUsuario datosLoginUsuario){
        //genero user & pass
        Authentication authToken =new UsernamePasswordAuthenticationToken(
                datosLoginUsuario.login(),
                datosLoginUsuario.clave());
        //guardo como manager
        var UsuarioAutenticado = authenticationManager.authenticate(authToken);
        //genera token
        var jwtToken = tokenService.generarToken((Usuario) UsuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(jwtToken));
    }
}
