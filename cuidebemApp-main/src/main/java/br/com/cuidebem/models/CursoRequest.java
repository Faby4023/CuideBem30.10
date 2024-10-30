package br.com.cuidebem.models;

import jakarta.validation.constraints.NotBlank;



public record CursoRequest(@NotBlank(message = "O nome não pode está vazio!")
                           String nomeDoCurso,
                           String instituicao,
                           String periodo,
                           String certificacao) {


    public Curso toCurso() {
        return new Curso(null, nomeDoCurso(), instituicao(), periodo(), certificacao());
    }
}