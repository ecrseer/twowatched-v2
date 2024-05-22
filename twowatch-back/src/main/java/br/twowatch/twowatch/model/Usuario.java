package br.twowatch.twowatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;

}
