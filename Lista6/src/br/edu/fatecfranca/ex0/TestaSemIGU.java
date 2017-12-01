package br.edu.fatecfranca.ex0;
//Testa sem interface gráfica usuário

import javax.swing.JOptionPane;

public class TestaSemIGU {
    //Método que vai para médico e para enfermeiro
    public static void polimorfismo(Ps obj){
        obj.atende();
        obj.calculaSalario();
        JOptionPane.showMessageDialog(null, obj.mostra());
    }
    
    public static void main(String[] args) {
        Medico me = new Medico(123);
        polimorfismo(me);
        
        Enfermeiro en = new Enfermeiro(567);
        polimorfismo(en);
    }
    
}
