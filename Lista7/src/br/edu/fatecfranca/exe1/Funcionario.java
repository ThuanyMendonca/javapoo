package br.edu.fatecfranca.exe1;
public abstract class Funcionario {
    protected String nome, matricula;
    protected float salario;
    
    //Construtores
    public Funcionario() {
    }

    public Funcionario(String nome,String matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    //Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
     public abstract float calculaSalario();
    
    public String mostra(){
        return "Nome: " + this.nome + "\nMatrícula: " + this.matricula + "\nSalário: " + this.calculaSalario();
    }
    
    
}
