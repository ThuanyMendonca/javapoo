package br.edu.fatecfranca.exe1;
public class Cachorro extends Mamifero {
    private boolean lateMuito;

    public Cachorro(boolean lateMuito, String nome) {
        super(nome);
        this.lateMuito = lateMuito;
    }

    public Cachorro() {
        this.lateMuito = true;
    }

    public boolean isLateMuito() {
        return lateMuito;
    }

    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }

   @Override
    public String fala() {
        return "AU! AU!";
    }
    
    @Override
    public String imp() {
        return super.imp() + " dog";
    }
    
    
}
