package br.twowatch.twowatch.service;

import br.twowatch.twowatch.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(int id) {
        return this.usuarioRepository.findById(id);
    }


    public Usuario findByNome(String nome) {
        return this.usuarioRepository.findAllByNome(nome).get();
    }

    @Override
    public Usuario save(Usuario usuario) {
        Usuario salvo = this.usuarioRepository.save(usuario);
        return salvo;
    }

}
