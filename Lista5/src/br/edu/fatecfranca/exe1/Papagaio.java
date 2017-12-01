package br.edu.fatecfranca.exe1;
public class Papagaio extends Passaro {
    private String vocabulario;

    public Papagaio(String vocabulario, String nome) {
        super(nome);
        this.vocabulario = vocabulario;
    }

    public Papagaio() {
        this.vocabulario = "";
    }

    public String getVocabulario() {
        return vocabulario;
    }

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
    
    @Override 
    public String fala(){
        return super.imp() + "Vocabulario: " + this.vocabulario;
    }
    @Override
    public String imp(){
        return super.imp() + "papagaio";
    }
}   
