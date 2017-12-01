package br.edu.fatecfranca.exe4;
import br.edu.fatecfranca.exe4.Conta;

public class Cartao extends Conta{
    
    @SuppressWarnings("unused")
	private String senha;
    
    public Cartao(String nome, float salario, float saldo, float limite, int numeroConta) {
        super(nome, salario, saldo, limite, numeroConta);
    }

    
    public void alterarSenha(String senhaAntiga, String senhaNova) {
        this.senha = senhaNova;
    }
    
    public void retirada() {
        
    }
}
