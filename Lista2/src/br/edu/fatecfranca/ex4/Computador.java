package br.edu.fatecfranca.ex4;
public class Computador {
    public String processador;
    public static int ram;
    
    public Computador(){
        this.processador = "";
    }
    public Computador(String processador){
        this.processador = processador;
    }
    public void alteraProcessador(String a){
       this.processador = a; 
    }
    public static void ram(int r){
        Computador.ram = r;
    }
    public static void aumentarRam(){
        Computador.ram += 256;
    }
    public String mostra(){
        return "Processador: " + this.processador +
                "\n Memória RAM: " + Computador.ram;
    }
}
