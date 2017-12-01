package br.edu.fatecfranca.exe1;
public class Passaro extends Animal{

    public Passaro(String nome) {
        super(nome);
    }

    public Passaro() {
    }
    @Override
    public String fala(){
        return "Piu piu";
    }
}
