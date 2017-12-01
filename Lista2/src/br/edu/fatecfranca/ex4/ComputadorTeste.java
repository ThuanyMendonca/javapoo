package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class ComputadorTeste {

    public static void main(String[] args) {
        /*
        Instancie objetos e faça chamadas aos métodos criados com objetivo de testá-los.
        */
    
        Computador obj1 = new Computador();
        obj1.processador = JOptionPane.showInputDialog("Informe o processador: ");
        Computador.ram = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da memoria RAM"));
        Computador.aumentarRam();
        JOptionPane.showMessageDialog(null, obj1.mostra());
        obj1.alteraProcessador(JOptionPane.showInputDialog("Informe o nome do novo processador: "));
        Computador.ram = Integer.parseInt((JOptionPane.showInputDialog("Informe o novo valor da memória RAM ")));
        Computador.aumentarRam();
        JOptionPane.showMessageDialog(null,obj1.mostra());
    }
}