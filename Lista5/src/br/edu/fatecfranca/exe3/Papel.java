package br.edu.fatecfranca.exe3;

public class Papel extends Coisa {
    // Quando uma classe herda de uma superclasse abstrata, tem q implementar os métodos abstratos
    public String quemSouEu(){
        return "Papel";
    }
    //Implementando o método compara
    public String compara(Coisa c){
        String aux = c.quemSouEu(); //Polimorfismo
        
        switch(aux){
            case "Papel" : return "Papel empata papel";
            case "Pedra" : return "Papel ganha pedra";
            case "Tesoura" : return "Papel perde tesoura";
            default: return "Impossível comparar";
        }
    }
}
