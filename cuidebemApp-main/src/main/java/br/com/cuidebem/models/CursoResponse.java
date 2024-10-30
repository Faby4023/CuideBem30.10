package br.com.cuidebem.models;




public record CursoResponse(
        String nomeDoCurso,
        String instituicao,
        String periodo,
        String certificacao) {

    public CursoResponse(Curso curso) {
        this(curso.getNomeDoCurso(), curso.getInstituicao(), curso.getPeriodo(), curso.getCertificacao());
    }
}
