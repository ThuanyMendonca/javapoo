package br.edu.fatecfranca.ex3;
public class Topico {
    private String assunto;

    public Topico() {
        this.assunto = "";
    }
    
    public Topico(String assunto) {
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString(){
        return "Topico{" + "assunto=" + assunto + '}';
    }
}
