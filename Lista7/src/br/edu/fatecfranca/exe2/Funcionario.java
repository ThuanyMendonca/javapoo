package br.edu.fatecfranca.exe2;
public abstract class Funcionario {
    protected String nome, matricula;
    protected float salario;
    public Funcionario() {
        this.nome = "";
        this.matricula = "";
        this.salario = 0;
    }
    public Funcionario(String nome, String matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public abstract float calculaSalario();
}
