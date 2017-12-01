package br.edu.fatecfranca.ex0;

public class Data {
    private int dia, mes,ano;
    
    //Construtores
    public Data(){
        this.dia = 1; this.mes = 1; this.ano = 2017;
    }
    
    public Data(int dia, int mes, int ano){
        this.trataDia(dia); this.trataMes(mes); this.trataAno(ano);
    }
    private void trataDia(int dia){
        if((dia >= 1) && (dia<=31)){
            this.dia = dia;
        }
        else throw new IllegalArgumentException("Dia inválido");
    }
    
    private void trataMes(int mes){
        if((mes >= 1) && (mes<=12)){
            this.mes = mes;
        }
        else throw new IllegalArgumentException("Mes inválido");
    }
    
    private void trataAno(int ano){
        if(ano >= 0){
            this.ano = ano;
        }
        else throw new IllegalArgumentException("Dia inválido");
    }
    
    public void setDia(int dia){
        if((dia >= 1)&&(dia <= 31)){
            this.dia = dia;
        }
        else throw new IllegalArgumentException("Dia inválido");
    }
    public void setMes(int mes){
        if((mes >=1)&&(mes <= 12)){
            this.mes = mes;
        }
        else throw new IllegalArgumentException("Mês inválido");
    }
    public void setAno(int ano){
        if(ano >= 0){
            this.ano = ano;
        }
        else throw new IllegalArgumentException("Ano inválido");
    }
    //Get não recebe nada, eles só retornam
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
   
}
