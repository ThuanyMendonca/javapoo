package br.edu.fatecfranca.exe1;
public class Vendedor extends Funcionario {
    private float comissao;

    public Vendedor() {
        super();
        this.comissao = 0;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public Vendedor(float comissao, String nome, String matricula, float salario) {
        super(nome, matricula, salario);
        this.comissao = comissao;
    }
    @Override
    public float calculaSalario(){
        return this.salario + this.comissao;
    }
    
    @Override
    public String mostra(){
        return "Vendedor: " + "Comissão: " + this.comissao + super.mostra();
    }
    
}
