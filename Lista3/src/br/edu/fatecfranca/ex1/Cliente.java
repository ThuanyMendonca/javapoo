package br.edu.fatecfranca.ex1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;
    
    //Construtores:
    /* Sem parâmetro */
    public Cliente(){
        // iniciando as variaveis
        this.nroConta = "00000-0";
        this.nroAgencia = "0000-0";
        this.nome = "";
        this.saldo = 0;
    }
    /* Com parâmetro */
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        //Chama o trata no construtor Não pode passar o set no construtor
        this.trataNroConta(nroConta);
        this.trataNroAgencia(nroAgencia);
        this.trataNome(nome);
        this.saldo = saldo;
    }
    //Criando os métodos que retornam
    //Get
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
       return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    /*
        em alguma outra classe
        Cliente obj = new Cliente();
        obj.setNroConta("234567-6");
        obj.trataNroConta("123456-6"); //Metodo privado - isso não pode
    */
    //Set
    
    public void setNroConta(String nroConta){
        //charAt para verificar o - na posição 6
        //fazer if para verificar se o tamanho é menor que 8
        this.trataNroConta(nroConta);
    }
        
    //Tratando o número conta, precisa ser privado
    private void trataNroConta(String nroConta){
        if((nroConta.length() == 8) && (nroConta.charAt(6) == '-')){
            this.nroConta = nroConta;
        }
        else throw new IllegalArgumentException("Número de conta inválido");
    }  
    //Set da agência
    public void setNroAgencia(String nroAgencia){
        this.trataNroAgencia(nroAgencia);
    }
    //Tratando o número da agência, precisa ser privado
    private void trataNroAgencia(String nroAgencia){
        if((nroAgencia.length() == 6) && (nroAgencia.charAt(5) == '-')){
            this.nroAgencia = nroAgencia;
        }
        else throw new IllegalArgumentException("Número da agência inválida");
    }
    public void setNome(String nome){
        this.trataNome(nome);
    }
    private void trataNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome inválido");
    }
    //Fazer o set do saldo (o get está em cima)
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo = this.saldo + x;
    }
    public void sacar(float x){
        if(this.saldo - x >= 0){
            this.saldo = this.saldo - x;
        }
        else throw new IllegalArgumentException("Saldo insuficiente");
    }
    public String mostra(){
        //não precisa usar o get, pois está dentro da classe
        return "Número da conta: " + this.nroConta +
                "\n Número da Agência: " + this.nroAgencia +
                "\n Nome: " + this.nome +
                "\n Saldo: " + this.saldo;
    }
}
