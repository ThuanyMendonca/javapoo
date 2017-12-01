package br.edu.fatecfranca.exe0;
public class PessoaB implements Diabetico, Alcoolatra, Fumante {
    @Override
    public String comerDoce() {
        return "Somente aos finais de semana, moderadamente";
    }

    @Override
    public boolean herdaPais() {
        return true;
    }

    @Override
    public String beber() {
        return "Somente aos finais de semana";
    }

    @Override
    public String fumar() {
        return "20 cigarro por dia, todo dia";
    }
    
}
