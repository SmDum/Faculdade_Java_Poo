package com.mycompany.aluno;

public class AlunoClasse {
    private String nome;
    private String endereco;
    private int idade;
    private String Sexo;
    private int RG;
    private String Curso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    public int getRG() {
        return RG;
    }
    public void setRG(int rG) {
        RG = rG;
    }
    public String getCurso() {
        return Curso;
    }
    public void setCurso(String curso) {
        Curso = curso;
    }

    @Override
    public String toString() {
        return "AlunoClasse{" + "nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", Sexo=" + Sexo + ", RG=" + RG + ", Curso=" + Curso + '}';
    }
    
    
}