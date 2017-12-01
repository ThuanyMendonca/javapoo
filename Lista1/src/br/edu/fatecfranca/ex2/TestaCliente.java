package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente(); 
        
        obj1.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta: "));
        obj1.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe numero da agencia: "));
        obj1.nome = JOptionPane.showInputDialog("Informe um nome");
        obj1.saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
        obj1.realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("Deposito: ")));
        obj1.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Saque: ")));
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência: "));
        String c = JOptionPane.showInputDialog("Informe um nome");
        float d = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
           
        Cliente obj2 = new Cliente(a,b,c,d);
        
        obj2.realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog("Deposito: ")));
        obj2.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Saque: "))); 
        JOptionPane.showMessageDialog(null, obj1.dadosCliente());
        JOptionPane.showMessageDialog(null, obj2.dadosCliente());
    }    
}
