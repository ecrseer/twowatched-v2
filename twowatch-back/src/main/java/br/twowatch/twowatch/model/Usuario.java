package br.twowatch.twowatch.model;

import lombok.Data;

@Data
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;

}
