package br.edu.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class Controle {
    public static void main(String[] args) {
        //Criando produto com serial (int) e volume (int)
        Produto p1 = new Produto(1234, 70);
        
        //Criando Radio
        Radio r1 = new Radio(123,10);
        
        //Criando TV
        Tv t1 = new Tv("Multishow",1234,20);
        
        p1.testaUnidade();
        p1.toString();
        
        r1.escutar();
        r1.trocaBanda();
        r1.trocaEstacao();
        r1.toString();
        
        t1.assistir();
        t1.trocaCanal();
        t1.toString();
        
        JOptionPane.showMessageDialog(null, p1.toString());
        JOptionPane.showMessageDialog(null, r1.toString());
        JOptionPane.showMessageDialog(null, t1.toString());
    }
    
    
}
