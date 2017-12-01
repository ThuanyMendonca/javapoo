package br.edu.fatecfranca.ex2;

import java.util.ArrayList;

public class Onibus {
    private String numero;
    private ArrayList <Passageiro> passageiros;

    public Onibus() {
        this.passageiros = new ArrayList();
    }

    public Onibus(String numero, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.passageiros = passageiros;
    }

    public String getNumero() {
        return numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        String saida = "Onibus{" + "numero=" + numero + ", passageiros=";
        //para cada passageiro
        for(Passageiro passageiro: this.passageiros){
            saida = saida + passageiro.toString() + "\n";
        }
        return saida;
    }
    
    public void associaPassageiro(Passageiro passageiro){
        //pega o objeto e coloca dentro do ArrayList
        this.passageiros.add(passageiro);
    }
    //Se ele conseguir remover, retorna true
    public boolean desvincularPassageiro(Passageiro passageiro){
        //Remove o passageiro com todos atributos dele
        return this.passageiros.remove(passageiro);
    }
    
    public boolean obterPassageiro(Passageiro passageiro){
        //para obter um passageiro, usa contains
        return this.passageiros.contains(passageiro);
    }
    //pode ter metodos com nomes iguais, porem precisa ter o parametro diferente
    public boolean obterPassageiro(String cpf){
        for(Passageiro passageiro: this.passageiros){
            //Verifica se o passageiro tem o mesmo cpf que eu quero, se sim (true)
            if(passageiro.getCpf().equals(cpf)){
                return true;
            }  
        }
        return false;
    }
    private int obterPosicaoPassageiro(Passageiro passageiro){
        //se achar, retorna a posição, senao retorna -1
        return this.passageiros.indexOf(passageiro);
    }
    public int obterPosicaoPassageiro(String cpf){
        for(Passageiro passageiro: this.passageiros){
            if(passageiro.getCpf().equals(cpf)){
                return this.passageiros.indexOf(passageiro);
            }  
        }
        return -1;
    }
    public boolean atualizaPassageiro(Passageiro passageiro){
        int pos = obterPosicaoPassageiro(passageiro.getCpf());
        if(pos != -1){
            this.passageiros.set(pos, passageiro);
            return true;
        }
        else return false;
    }
}
