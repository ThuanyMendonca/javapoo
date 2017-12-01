package br.edu.fatecfranca.ex1;

public class Aluno {
    //Declaração das variáveis
    public int numeroAluno,idade;
    public float p1,p2;
    public String nome;
    
    //Criação dos métodos construtores
    //sem parâmetros
    public Aluno(){
        // this representa o objeto obj1
        this.idade = 0;
        this.numeroAluno = 0;
        this.p1 = 0;
        this.p2 = 0;
        this.nome = "";
    }
    //com parâmetros - valores do usuário
    public Aluno(int idade, int numeroAluno, float p1, float p2, String nome){
        this.idade = idade;
        this.numeroAluno = numeroAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }
    //Criação dos métodos da classe
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String passou(){
        //Operador ternário
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }
    public String dadosAluno(){
        return "numero do aluno: " + this.numeroAluno + 
                "\n nome do aluno: " + this.nome + 
                "\nP1:" + this.p1 +
                "\nP2:" + this.p2;
    }
}
