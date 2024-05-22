package br.twowatch.twowatch.controller;

import br.twowatch.twowatch.model.Usuario;
import br.twowatch.twowatch.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Usuario> atualizaUsuario(@RequestBody Usuario usuario) {
        System.out.println("PUT");
        Usuario atualizado = this.usuarioService.atualizar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(atualizado);
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

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> encontraUsuarioPorId(@PathVariable int id) {
        Usuario usuario = this.usuarioService.encontrarPorId(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public List<Usuario> listaUsuarios() {
        return this.usuarioService.mostrarTodos();
    }

}
