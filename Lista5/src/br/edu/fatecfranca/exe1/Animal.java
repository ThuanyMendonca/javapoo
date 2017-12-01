package br.edu.fatecfranca.exe1;
public class Animal {
    protected String nome;
    

    public Animal(String nome) {
        this.nome = nome;
    }
    public Animal() {
        this.nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String fala(){
        return "Eu não falo";
    }
    public String imp(){
        return "Nome: " + this.nome + 
                "\nClasse do animal: " + this.getClass().getSimpleName();
    }
}
