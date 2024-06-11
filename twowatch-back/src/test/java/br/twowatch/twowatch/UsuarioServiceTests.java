package br.twowatch.twowatch;


import br.twowatch.twowatch.service.UsuarioService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UsuarioServiceTests {
    @Autowired
    UsuarioService usuarioService;

    @Test
    @DisplayName("resgata usuarios")
    public void testaObterTodosUsuarios() {
        

    }


}
