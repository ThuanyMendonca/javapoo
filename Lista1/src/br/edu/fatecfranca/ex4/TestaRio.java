package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class TestaRio {

    public static void main(String[] args) {
        Rio obj1 = new Rio();
        
        //nome, nivel e poluido (variaveis)
        obj1.nome = JOptionPane.showInputDialog("Nome: ");
        obj1.nivel = Float.parseFloat(JOptionPane.showInputDialog("Nivel: "));
        obj1.poluido = Boolean.parseBoolean(JOptionPane.showInputDialog("Poluido?"));
        obj1.chover(Float.parseFloat(JOptionPane.showInputDialog("Quantidade aumentada: ")));
        obj1.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Quantidade diminuida: ")));
        obj1.limpar();
        obj1.sujar();
        
        String a = JOptionPane.showInputDialog("Nome: ");
        float b = Float.parseFloat(JOptionPane.showInputDialog("Nivel: "));
        boolean c = Boolean.parseBoolean(JOptionPane.showInputDialog("Poluido?: "));
        
        Rio obj2 = new Rio(a,b,c);
        
        obj2.chover(Float.parseFloat(JOptionPane.showInputDialog("Quantidade aumentada: ")));
        obj2.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Quantidade diminuida: ")));
        obj2.limpar();
        obj2.sujar();
        
        JOptionPane.showMessageDialog(null, obj1.mostrar());
        JOptionPane.showMessageDialog(null, obj2.mostrar());
    }
    
}
