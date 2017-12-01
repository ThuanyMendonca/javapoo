package br.edu.fatecfranca.exe1;
public class Cidade {
    // O método recebe por parametro um objeto que é do tipo de interface
    public String contrata(Professor p){
        return p.ensina() + "" + p.trabalha();
    }

    public String contrata(Empregado e){
        return e.trabalha();
    }

    public String cobraDe(Contribuinte c) {
        return c.pagarIR();
    }

    public String registra(Cidadao c) {
        return c.getRG();
    }

    public String alimenta(Animal a ){
        return a.come();
    }

}
