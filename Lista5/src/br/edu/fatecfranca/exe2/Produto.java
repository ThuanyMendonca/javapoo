package br.edu.fatecfranca.exe2;
public class Produto {
    protected int serial;
    protected int volume;
    protected String valor = "Não testado";
    
    //Construtores
    
    public Produto() {
        this.serial = 1;
        this.volume = 1;
    }

    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
    }
    //Get e set

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public boolean testaUnidade(){
        if(Math.random() >= 0.9){
            this.valor = "Aprovado";
            return true;
        }
        else{
            this.valor = "Reprovado";
            return false;
        }
    }
    @Override
    public String toString(){
        return "Produto: " + "serial: " + serial + "volume: " + volume + "teste: " + valor;
    }
}
