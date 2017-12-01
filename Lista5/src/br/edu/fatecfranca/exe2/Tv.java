package br.edu.fatecfranca.exe2;
public class Tv extends Produto {
    private String canal;
    
    //Construtores
    public Tv() {
        super();
        this.canal = "Globo";
    }

    public Tv(String canal, int serial, int volume) {
        super(serial, volume);
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
    
    public String assistir(){
        return this.canal;
    } 
    public void trocaCanal(){
        this.canal = "HBO";
    }
    @Override
    public String toString(){
        return "Produto" + "\nSerial: " + serial + "\nVolume: " + volume + "\nValor: " + valor
                + "\nTv" + "\nCanal: " + canal;
    }
    
}
