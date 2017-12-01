package br.edu.fatecfranca.ex2;
public class Aluno {
    //numeroAluno (int), nome (String), idade (int), p1 (float) e 
    //p2 (float), e os métodos getters e setters para todas as variáveis privadas
    private String numeroAluno;
    private int idade;
    private String nome;
    private float p1, p2;
    
    //Construtores
    public Aluno(){
        this.numeroAluno = "";
        this.idade = 0;
        this.nome = "";
        this.p1 = 0;
        this.p2 = 0;
    }
    public Aluno(String numeroAluno, String nome, int idade, float p1, float p2){
        this.trataNumeroAluno(numeroAluno);
        this.trataNome(nome);
        this.trataIdade(idade);
        this.trataP1(p1);
        this.trataP2(p2);
    }
    public String getNumeroAluno(){
        return this.numeroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    public void setNumeroAluno(String numeroAluno){
        this.trataNumeroAluno(numeroAluno);
    }
    // não pode ter mais que 6 caracteres
    private void trataNumeroAluno(String numeroAluno){
        if(numeroAluno.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else throw new IllegalArgumentException("Número do aluno inválido");
    }
    public void setIdade(int idade){
        this.trataIdade(idade);
    }
    private void trataIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }
        else throw new IllegalArgumentException("Idade inválida");
    }
    public void setNome(String nome){
        this.trataNome(nome);
    }
    private void trataNome(String nome){
        if(nome.length() < 30){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome inválido");
    }
    public void setP1(float p1){
        this.trataP1(p1);
    }
    private void trataP1(float p1){
        if(p1 > 0){
            this.p1 = p1;
        }
        else throw new IllegalArgumentException("P1 inválida");
    }
    public void setP2(float p2){
        this.trataP2(p2);
    }
    private void trataP2(float p2){
        if(p2 > 0){
            this.p2 = p2;
        }
        else throw new IllegalArgumentException("P2 inválida");
    }
    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }
    public String passou(){
        //Operador ternário
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }
    public String dadosAluno(){
        return "Número aluno: " + this.numeroAluno +
                "\n Nome aluno: " + this.nome +
                "\n Idade: " + this.idade;
    }
    
    
}
