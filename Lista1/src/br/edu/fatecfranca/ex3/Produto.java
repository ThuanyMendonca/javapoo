package br.edu.fatecfranca.ex3;

public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;    
    /*
        Metodos construtores
    */
    
    //Sem parametro
    
    public Produto(){
        this.id = 0;
        this.descricao = " ";
        this.qtde = 0;
        this.preco = 0;
    }
    
    //Com parametro
    
    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    //Metodos
    public void comprar(int x){
        this.qtde += x;
    }
    public void vender(int x){
        this.qtde -= x;
    }
    public void subir(float x){
        this.preco += x;
    }
    public void descer(float x){
        this.preco -= x;
    }
    public String mostra(){
        return "ID: " + this.id + "\n Descrição: " + this.descricao +
                "\n Quantidade: " + this.qtde + "\n Preço: " + this.preco;
    }
}
