package br.edu.fatecfranca.exe2;

public class Vendedor extends Funcionario{
    private float comissao;
    public Vendedor(){
        super();
        this.comissao = 0;
    }
    public Vendedor(String nome, String matricula, float salario, float comissao){
        super(nome, matricula, salario);
        this.comissao = comissao;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
  
    @Override
    public float calculaSalario() {
        return this.salario + this.comissao;
    }
}
