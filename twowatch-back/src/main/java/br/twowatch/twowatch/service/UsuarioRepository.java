package br.twowatch.twowatch.service;

import br.twowatch.twowatch.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
