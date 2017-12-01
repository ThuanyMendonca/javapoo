package br.edu.fatecfranca.exe2;

public class Assistente extends Funcionario {
    
    public Assistente(){
        super();
    }
    public Assistente(String nome, String matricula, float salario){
        super(nome, matricula, salario);
    }

    @Override
    public float calculaSalario() {
        return this.salario;
    }
    
}
