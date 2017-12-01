package br.edu.fatecfranca.exe2;
public class Radio extends Produto {
    private String estacao = "105,5";
    private String banda = "AM";

    public Radio() {
        super();
        this.estacao = "";
        this.banda = "";
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    //Método que retorna a estação
    public Radio(int serial, int volume) {
        super(serial, volume);
    }
    //Método que retorna a banda
    public String escutar(){
        return this.estacao + this.banda;
    }
    // Criando métodos para trocar estação e banda
    public void trocaEstacao(){
        this.estacao = "99,7";
    }
    public void trocaBanda(){
        this.banda = "FM";
    }
    @Override
    public String toString(){
        return "Produto " + "\nSerial: " + serial + "\nVolume: " + volume + "\nValor: " + valor +
                "\nEstação: " + estacao + "\nBanda: " + banda;
    }
}
