package br.edu.fatecfranca.exe0;
// A classe que implementa uma interface, é obrigada a implementar todos os métodos abstratos
public class PessoaA implements Diabetico, Alcoolatra {

    @Override
    public String comerDoce() {
        return "Todos os dias após as refeições";
    }

    @Override
    public boolean herdaPais() {
        return false;
    }

    @Override
    public String beber() {
        return "4 vezes por semana, 5 latinhas";
    }
    
}
