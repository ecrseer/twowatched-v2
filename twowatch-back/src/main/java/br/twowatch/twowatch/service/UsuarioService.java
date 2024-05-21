package br.twowatch.twowatch.service;

import br.twowatch.twowatch.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(Usuario usuario) {
        usuario.setId(usuarios.size() + 1);
        this.usuarios.add(usuario);
    }

    public List<Usuario> mostrarTodos() {
        return this.usuarios;
    }

    public int atualizar(Usuario atualizacoes) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == atualizacoes.getId()) {
                usuario.setNome(atualizacoes.getNome());
                usuario.setEmail(atualizacoes.getEmail());
                return usuario.getId();
            }
        }
        return -1;
    }

    public int removerPorId(int id) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                return usuario.getId();
            }
        }
        return -1;
    }
}
