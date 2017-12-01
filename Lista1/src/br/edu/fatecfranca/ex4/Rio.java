package br.edu.fatecfranca.ex4;

public class Rio {
    /*nome(String), nível (float) e poluído (boolean)*/
    public String nome;
    public float nivel;
    public boolean poluido;
    
    //Método construtor sem parâmetros
    public Rio(){
        this.nome = " ";
        this.nivel = 0;
        this.poluido = false;
    }
    
    //Método construtor com parâmetros
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    //Métodos (retornar os valores)
    public float chover(float x){
        return this.nivel += x;
    }
    public float ensolarar(float y){
        return this.nivel -= y;
    }
    public boolean limpar(){
        return this.poluido = false;
    }
    public boolean sujar(){
        return this.poluido = true ;
    }
    public String mostrar(){
        return " Nome do Rio: " + this.nome +
                "\n Nível do Rio: " +  this.nivel +
                "\n Poluido? " + this.poluido;
    }
    
}
