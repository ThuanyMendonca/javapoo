package br.edu.fatecfranca.exe2;
import java.util.ArrayList;

public class Universidade {
    
    private int qtdeCursos;
    private String nome, cidade;
    private ArrayList<Curso> cursos;

    public Universidade() {
    }

    public Universidade(int qtdeCursos, String nome, String cidade) {
        this.qtdeCursos = qtdeCursos;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getQtdeCursos() {
        return qtdeCursos;
    }

    public void setQtdeCursos(int qtdeCursos) {
        this.qtdeCursos = qtdeCursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Universidade{" + "qtdeCursos=" + qtdeCursos + ", nome=" + nome + ", cidade=" + cidade + ", cursos=" + cursos + '}';
    }
    
    //
    public void criaCurso() {
        
    }
    
    
}
