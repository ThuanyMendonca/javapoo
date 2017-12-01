package br.edu.fatecfranca.exe1;
public class Assistente extends Funcionario {

    public Assistente() {
        super();
    }
    public Assistente(String nome, String matricula, float salario){
        super(nome,matricula,salario);
    }
    @Override
    public float calculaSalario(){
        return this.salario;
    }
    @Override
    public String mostra(){
        return "Assistente: " + super.mostra();
    }
}
