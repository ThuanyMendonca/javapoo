package br.edu.fatecfranca.exe2;

public class Disciplina {

    private int nroCreditos;
    private String tipo, nome;

    public Disciplina(int nroCreditos, String tipo, String nome) {
        this.nroCreditos = nroCreditos;
        this.tipo = tipo;
        this.nome = nome;
    }

    public Disciplina() {
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nroCreditos=" + nroCreditos + ", tipo=" + tipo + ", nome=" + nome + '}';
    }
}
