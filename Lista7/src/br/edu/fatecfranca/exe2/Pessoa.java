package br.edu.fatecfranca.exe2;
public class Pessoa implements Eleitor, Cidadao{

    @Override
    public String vota() {
        return "Pessoa votando ...";
    }

    @Override
    public String tiraTitulo() {
        return "Pessoa tirando título ...";
    }

    @Override
    public String tiraCpf() {
        return "Pessoa tirando CPF ...";
    }

    @Override
    public String pagaIrpf() {
        return "Pessoa pagando IRPF ...";
    }
    
}
