package br.edu.fatecfranca.exe1;
public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        Cidade franca = new Cidade();
        
        // Chama o professor, pq pessoa esta relacionada diretamente com Professor
        
        //Coersão transforma um objeto de uma classe em outra classe
        franca.contrata((Empregado) fulano);
        franca.cobraDe(fulano);
        franca.registra(fulano);
        franca.alimenta(fulano);
        
    }
    
}
