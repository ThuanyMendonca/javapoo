package br.edu.fatecfranca.exe1;
import br.edu.fatecfranca.exe1.Cachorro;

public class ViraLata extends Cachorro {
    private boolean abandonado;

    public ViraLata(boolean abandonado, boolean lateMuito, String nome) {
        super(lateMuito, nome);
        this.abandonado = abandonado;
    }

    public ViraLata() {
        this.abandonado = true;
    }

    public boolean isAbandonado() {
        return abandonado;
    }

    public void setAbandonado(boolean abandonado) {
        this.abandonado = abandonado;
    }
    
    public void adotado(){
        this.abandonado = true;
    }
    
    public String mostrarInfo(){
        return super.imp();
    }
    
}
