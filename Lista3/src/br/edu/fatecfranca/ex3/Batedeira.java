package br.edu.fatecfranca.ex3;
public class Batedeira {
    private int ligada;
    private int velocidade;
    
    public Batedeira(){
        this.ligada = 1;
        this.velocidade = 0;
    }
    //Construtor com parametro
    public Batedeira(int ligada, int velocidade){
        this.ligada = ligada;
        this.velocidade = velocidade;
    }
    //Seters
    public void setLigada(int ligada){
        this.ligada = ligada;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    } 
    //Get
    public int getLigada(){
        return this.ligada;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    //Metodo desligar
    public void desligar(){
        if(this.velocidade != 0){
            throw new IllegalArgumentException("Batedeira não pode ser desligada!");
        }
        this.ligada = 0;
    }
    public void aumentarVelocidade(int x){
        this.velocidade += x;
    }
    public static Batedeira batedeiraBat(Batedeira a, Batedeira b){
        if(a.velocidade > b.velocidade){
            return a;
        }
        else if(b.velocidade > a.velocidade){
            return b;
        } 
        else {
            throw new IllegalArgumentException("As duas Batedeiras tem a mesma velocidade!");
        }
    }
    
    public String mostrar(){
        return "Ligada: " + this.ligada +
                "\n Velocidade: " + this.velocidade;
    }
}
