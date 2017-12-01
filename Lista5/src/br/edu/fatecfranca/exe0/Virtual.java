package br.edu.fatecfranca.exe0;
//Para reutilizar, usa o extends e o nome da classe
public class Virtual extends Produto {
    private String emailEntrega;
    private float espacoHd, ramMinima;
    
    //Herda os get e set, porque tudo é herdado do pai

    public Virtual(String emailEntrega, float espacoHd, float ramMinima, String nome, String descricao, float valor) {
        super(nome, descricao, valor); // chama o construtor da superclasse
        this.emailEntrega = emailEntrega;
        this.espacoHd = espacoHd;
        this.ramMinima = ramMinima;
    }
    public Virtual(){
        super();
        this.emailEntrega = "";
        this.espacoHd = 0;
        this.ramMinima = 0;
    }

    public String getEmailEntrega() {
        return emailEntrega;
    }

    public float getEspacoHd() {
        return espacoHd;
    }

    public float getRamMinima() {
        return ramMinima;
    }

    public void setEmailEntrega(String emailEntrega) {
        this.emailEntrega = emailEntrega;
    }

    public void setEspacoHd(float espacoHd) {
        this.espacoHd = espacoHd;
    }

    public void setRamMinima(float ramMinima) {
        this.ramMinima = ramMinima;
    }
    @Override
    //Anulando o que herdou
    public String mostra(){
        //Nome e descrição 
        return super.mostra() + "\nEmail: " + this.emailEntrega + "\nEspaço HD: " + this.espacoHd +
                "\nRam Minima: " + this.ramMinima;
    }
    
}
