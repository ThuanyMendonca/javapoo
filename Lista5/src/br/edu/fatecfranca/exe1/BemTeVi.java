package br.edu.fatecfranca.exe1;
public class BemTeVi extends Passaro{

    public BemTeVi(String nome) {
        super(nome);
    }

    public BemTeVi() {
    }
    @Override
    public String fala(){
        return super.imp() + "Bem-te-vi";
    }
}
