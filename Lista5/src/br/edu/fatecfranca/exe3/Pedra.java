package br.edu.fatecfranca.exe3;
public class Pedra extends Coisa {
    @Override
    public String quemSouEu(){
        return "Pedra";
    }  
    @Override
    public String compara(Coisa c){
        String aux = c.quemSouEu(); //Polimorfismo
        
        switch(aux){
            case "Papel" : return "Pedra perde papel";
            case "Pedra" : return "Pedra empata pedra";
            case "Tesoura" : return "Pedra ganha tesoura";
            default: return "Impossível comparar";
        }
    }
}
