package br.edu.fatecfranca.ex2;

public class Cliente {
    public String numeroConta;
    public String numeroAgencia;
    public String nome;
    static float saldo;
    
    //Construtores
    public Cliente(){
        this.numeroConta = " ";
        this.numeroAgencia = " ";
        this.nome = "";
    }
    public Cliente(String numeroConta, String numeroAgencia,String nome){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }
    
    public void realizarDeposito(float dep){
        Cliente.saldo += dep;
    }
    
    public void realizarSaque(float saq){
        Cliente.saldo -= saq;
    }
    public String mostra(){
        return "Numero da conta: " + this.numeroConta +
                "\n Nome do cliente: " + this.nome +
                "\n Saldo: " + Cliente.saldo;
    }
    
     public static void alteraSaldo(float x){
        Cliente.saldo = x;
    }

    public static float retornaSaldo(){
        return Cliente.saldo;
    }
    public void alteraAgencia(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    public String retornaAgencia(){
        return this.numeroAgencia;
    }
    static Cliente retornaNovoCliente(Cliente n1, Cliente n2){
        Cliente n3 = new Cliente();
        Cliente.saldo = Cliente.saldo + Cliente.saldo;
        n3.numeroAgencia = n1.numeroAgencia;
        n3.numeroConta = n1.numeroConta;
        n3.nome = "Fulano";
        return n3;
    }
    public static String verificaTamanho(String tam){
        return (tam.length() == 6)? "tem tamanho 6" : "não tem tamanho 6"; 
    }
}
