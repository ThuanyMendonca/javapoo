package br.edu.fatecfranca.ex0;

public class Enfermeiro extends Ps{
    private int coren;

    public Enfermeiro() {
        super();
        this.coren = 0;
    }

    public Enfermeiro(int coren) {
        super();
        this.coren = coren;
    }

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }
      
    
    @Override
    public void calculaSalario(){
        this.salario = this.salario * 15;
    }
    
    @Override
    public void atende(){
        this.horasT = this.horasT + 3;
    }
    
    @Override
    public String mostra(){
        return "Coren: " + this.coren + super.mostra();
    }
    
}
