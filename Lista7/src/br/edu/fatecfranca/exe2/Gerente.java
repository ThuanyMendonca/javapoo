package br.edu.fatecfranca.exe2;
public class Gerente extends Funcionario{
    
    public Gerente(){
        super();
    }
    public Gerente(String nome, String matricula, float salario){
        super(nome, matricula, salario);
    }

    @Override
    public float calculaSalario() {
        return this.salario * 2;
    }
}
