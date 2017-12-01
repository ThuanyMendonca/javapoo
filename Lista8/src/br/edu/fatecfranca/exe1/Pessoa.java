package br.edu.fatecfranca.exe1;
public class Pessoa extends Animal implements Professor, Cidadao, Contribuinte {

    @Override
    public String ensina() {
        return "Pessoa ensinando";
    }

    @Override
    public String trabalha() {
        return "Pessoa trabalhando";
    }

    @Override
    public String vota() {
        return "Pessoa votando";
    }

    @Override
    public String getRG() {
        return "Pessoa tirando RG";
    }

    @Override
    public String pagarIR() {
        return "Pessoa pagando IR";
    }

    @Override
    public String getCPF() {
        return "Pessoa tirando CPF";
    }


}
    