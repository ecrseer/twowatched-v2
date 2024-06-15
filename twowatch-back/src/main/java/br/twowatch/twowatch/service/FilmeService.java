package br.twowatch.twowatch.service;

import br.twowatch.twowatch.model.Filme;

import java.util.List;

public interface FilmeService {
    Filme save();

    List<Filme> findAll();
}
