package br.edu.fatecfranca.ex0;
public class Filme {
    private int codigo;
    private String classificacao,titulo;
    
    public Filme() {

    }
    
    public Filme(int codigo, String classificacao, String titulo) {
        this.codigo = codigo;
        this.classificacao = classificacao;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Filme{" + "codigo=" + codigo + ", classificacao=" + classificacao + ", titulo=" + titulo + '}';
    }
    
}
