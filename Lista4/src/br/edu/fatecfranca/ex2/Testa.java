package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("Fulano", "123", 10);
        Passageiro p2 = new Passageiro("Beltrano", "456", 11);
        Passageiro p3 = new Passageiro("Thuany", "876", 12);
        Passageiro p4 = new Passageiro("Maria", "122", 13);
        
        Onibus o1 = new Onibus();
        o1.setNumero("F2");
        o1.associaPassageiro(p1);
        o1.associaPassageiro(p2);
        
        Onibus o2 = new Onibus();
        o2.setNumero("X2");
        o2.associaPassageiro(p3);
        o2.associaPassageiro(p4);
        
        Rodoviaria r1 = new Rodoviaria();
        r1.setCidade("Franca");
        r1.setNome("Rodoviária de Franca");
        r1.associaOnibus(o1);
        r1.associaOnibus(o2);
        JOptionPane.showMessageDialog(null, r1.toString());
    }
    
}
