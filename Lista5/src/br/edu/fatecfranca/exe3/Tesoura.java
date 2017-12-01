package br.edu.fatecfranca.exe3;
public class Tesoura extends Coisa{
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }
    @Override
    public String compara(Coisa c){
        String aux = c.quemSouEu(); //Polimorfismo
        
        switch(aux){
            case "Papel" : return "Tesoura ganha papel ";
            case "Pedra" : return "Tesoura perde pedra";
            case "Tesoura" : return "Tesoura empata tesoura";
            default: return "Impossível comparar";
        }
    }
}
