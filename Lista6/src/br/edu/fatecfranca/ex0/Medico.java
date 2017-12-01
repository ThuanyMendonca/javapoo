package br.edu.fatecfranca.ex0;

public class Medico extends Ps {
    private int crm;
    public Medico(){
        super();
        this.crm = 0;
    }
    public Medico(int crm){
        super();
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
    
    @Override
    public void calculaSalario(){
        this.salario = this.horasT * 40;
    }
    
    @Override
    public void atende(){
        this.horasT = this.horasT + 8;
    }
    
    @Override
    public String mostra(){
        return "CRM: " + this.crm + super.mostra();
    }
}
