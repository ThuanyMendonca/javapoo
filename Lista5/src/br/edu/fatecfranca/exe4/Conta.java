package br.edu.fatecfranca.exe4;
public class Conta {
 
private String nome;
    private float salario, saldo, limite;
    private int numeroConta;
    
    public Conta(String nome, float salario, float saldo, float limite, int numeroConta) {
        this.nome = nome;
        this.salario = salario;
        this.saldo = saldo;
        trataLimite(limite);
        this.numeroConta = numeroConta;
    }

    private void trataLimite(float limite) {
        if(limite > this.salario) {
            this.limite = this.salario;
        }
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String toString() {
        return "Conta{" + "nome=" + nome + ", salario=" + salario + ", saldo=" + saldo + ", limite=" + limite + ", numeroConta=" + numeroConta + '}';
    }
    
    //
    public void deposito(float x) {
        this.saldo += x;
    }
    
    public boolean retira(float x) {
        if(x > this.saldo) {
            return false;
        }
        return true;
    }
}
