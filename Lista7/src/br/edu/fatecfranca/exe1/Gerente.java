package br.edu.fatecfranca.exe1;
public class Gerente extends Funcionario {
    //Quando não tem variáveis próprias, faz o construtor chamando a super classe
    public Gerente(){
        super();
    }
    public Gerente(String nome, String matricula, float salario){
        super(nome,matricula,salario);
    }
    @Override
    public float calculaSalario(){
        return this.salario * 2;
    }
    //Para mostrar algo que não está no mostra() da super classe, faz o Override
    
    //Mostrando as informações Nome, matricula e salário do gerente
    @Override
    public String mostra(){
        return "Gerente: " + super.mostra();
    }
}
