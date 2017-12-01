package br.edu.fatecfranca.exe2;
import java.util.ArrayList;

public class Curso {
    
    private int qtdeDisciplinas, codigo;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso(int qtdeDisciplinas, int codigo, String nome) {
        this.qtdeDisciplinas = qtdeDisciplinas;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Curso() {
    }

    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }

    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        String saida = "Curso{" + "qtdeDisciplinas=" + qtdeDisciplinas + ", codigo=" + codigo + ", nome=" + nome + ", disciplinas=";
        for(Disciplina disciplina: this.disciplinas) {
            saida = saida + disciplina.toString() + "\n";
        }
        return saida;
    }
    
    //
    public void criaDisciplinaObrigatoria() {
        
    }
    
    public void criaDisciplinaOptativa() {
        
    }
}
