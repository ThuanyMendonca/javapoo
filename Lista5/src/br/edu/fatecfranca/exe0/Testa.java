package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Casa", "Térrea", 80000);
        // emailEntrega, espacoHd, ramMinima, herdados: nome, descrição, valor
        Virtual p2 = new Virtual("eu@eu.com.br", 500, 4, "LOL", "League of Legends", 200);
        Fisico p3 = new Fisico("Franca", 34345, 3, "Sinuca", "Sinuca AAA", 70);
        
        JOptionPane.showMessageDialog(null, prod1.mostra());
        JOptionPane.showMessageDialog(null, p2.mostra());
        JOptionPane.showMessageDialog(null, p3.mostra());
    }
    
}
