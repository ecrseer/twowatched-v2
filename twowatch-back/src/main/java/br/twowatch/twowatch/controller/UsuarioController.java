package br.twowatch.twowatch.controller;

import br.twowatch.twowatch.model.Usuario;
import br.twowatch.twowatch.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PutMapping("/atualizar")
    public int atualizaUsuario(@RequestBody Usuario usuario) {
        System.out.println("PUT");
        return this.usuarioService.atualizar(usuario);
    }

    @PostMapping("/criar")
    public int cadastraUsuario(@RequestBody Usuario usuario) {
        usuarioService.cadastrar(usuario);
        return usuario.getId();
    }


    @DeleteMapping
    public int removeUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.removerPorId(usuario.getId());
    }

    @GetMapping
    public List<Usuario> listaUsuarios() {
        return this.usuarioService.mostrarTodos();
    }

}
