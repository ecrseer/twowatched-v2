package br.twowatch.twowatch;


import br.twowatch.twowatch.model.Usuario;
import br.twowatch.twowatch.service.UsuarioServiceImpl;
import br.twowatch.twowatch.service.UsuarioServiceOld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UsuarioServiceOldTests {
    @Autowired
    UsuarioServiceImpl usuarioService;

    @Test
    @DisplayName("Deve garantir que usuarios sao inseridos")
    public void testaInserirUsuario() {
        List<Usuario> usuarios = this.usuarioService.findAll();
        assertNotNull(usuarios);
        this.usuarioService.save(new Usuario("Gabriel", "gab@gmail.com", "123"));
        List<Usuario> usuariosEinserido = this.usuarioService.findAll();
        assertTrue(usuariosEinserido.size() > usuarios.size());
    }


}
