
package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.numeroConta = JOptionPane.showInputDialog("Informe o número da Conta: ");
        fulano.numeroAgencia = JOptionPane.showInputDialog("Informe o número da Agência: ");
        fulano.nome = JOptionPane.showInputDialog("Informe o nome: ");
        fulano.realizarDeposito(100);
        fulano.realizarSaque(50);
        
        String numeroConta = JOptionPane.showInputDialog("Informe o número da Conta");
        String numeroAgencia = JOptionPane.showInputDialog("Informe o número da Agencia");
        String nome = JOptionPane.showInputDialog("Informe o nome do cliente");
        
        Cliente beltrano = new Cliente(numeroConta, numeroAgencia,nome);        
        
        Cliente novoCliente = new Cliente();
        JOptionPane.showMessageDialog(null,fulano.mostra());
        JOptionPane.showMessageDialog(null,beltrano.mostra());
        JOptionPane.showMessageDialog(null,novoCliente.retornaNovoCliente(fulano, beltrano).mostra());
        JOptionPane.showMessageDialog(null,Cliente.verificaTamanho(numeroAgencia));
    }
    
    
    
}
