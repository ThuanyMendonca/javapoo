package br.edu.fatecfranca.ex1;

public class Veiculo {
    public String tipo;
    public int nroRodas;
    public String cor;
    public int ano;
    public static String nomeDono;

    //Sem parametro
    public Veiculo(){
        this.tipo = ""; 
        this.nroRodas = 0;
        this.cor = "";
        this.ano = 0;        
    }
    //Com parametro
    public Veiculo(String tipo,int nroRodas, String cor, int ano){
        this.tipo = tipo;
        this.nroRodas = nroRodas;
        this.cor = cor;
        this.ano = ano;
    }
    //Metodo de instancia
    public void alteraTipo(String tipo){
        this.tipo = tipo;
    }
    //metodo de instancia
    public String mostra(){
        return "Tipo: " + this.tipo + 
                "\n Nº rodas: " + this.nroRodas + 
                "\n Cor: " + this.cor + 
                "\n Ano: " + this.ano +
                "\n Nome do dono: " + Veiculo.nomeDono;
    }
    //Metodo de classe
    public static void alteraNome(String x){
        Veiculo.nomeDono = x;
    }
    //Metodo de classe
    public static String retornaNome(String nome){
        return Veiculo.nomeDono = nome;
    } 
    //Metodo de classe
    public static String nroRodas(int a){
        return (a % 2 == 0) ? "par" : "impar";
    }
    //Metodo de classe
    public static Veiculo retornaNovoVeiculo(Veiculo v1, Veiculo v2){
        Veiculo ve = new Veiculo();
        ve.tipo = v1.tipo;
        ve.nroRodas = v1.nroRodas + v2.nroRodas;
        ve.cor = v2.cor;
        ve.ano = (v1.ano > v2.ano) ? v1.ano : v2.ano;
        return ve;
    }
}