package br.edu.fatecfranca.ex0;
// É abstrata porque possui um ou mais métodos abstratos
public abstract class Ps {
    protected float salario, horasT;

    public Ps() {
        this.salario = 0;
        this.horasT = 0;
    }
    // Não coloca o construtor com parâmetro porque o usuário não pode colocar o valor
    public float getSalario() {
        return salario;
    }

    public float getHorasT() {
        return horasT;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    private void setHorasT(float horasT) {
        this.horasT = horasT;
    }
    //Método abstrato é um método não implementado
    public abstract void calculaSalario();
    //Método abstrato é um método não implementado
    public abstract void atende();
    
    public String mostra(){
        return "Salário: " + this.salario + "\nHoras trabalhadas: " + this.horasT;
    }
    
}
