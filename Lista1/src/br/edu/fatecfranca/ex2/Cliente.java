package br.edu.fatecfranca.ex2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    //Criação dos métodos construtores:
    public Cliente(){
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = " ";
        this.saldo = 0;
    }
    
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(float dep){
        this.saldo += dep;
    }
    
    public void realizarSaque(float saq){
        this.saldo -= saq;
    }
    
    public String dadosCliente(){
        return "Numero da conta: " + this.numeroConta +
                "\n Nome do cliente: " + this.nome +
                "\n Saldo: " + this.saldo;
    }
}
