package br.edu.fatecfranca.exe1;
public class Vaca extends Mamifero {

    public Vaca(String nome) {
        super(nome);
    }

    public Vaca() {
    }
    @Override
    public String fala(){
        return "Muuuu";
    }
}
