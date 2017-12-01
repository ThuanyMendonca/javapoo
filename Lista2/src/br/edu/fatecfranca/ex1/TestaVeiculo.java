package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        Veiculo moto = new Veiculo();
        
        Veiculo.nomeDono = JOptionPane.showInputDialog("Digite o nome do dono: ");
        
        carro.tipo = JOptionPane.showInputDialog("Digite o tipo do carro: ");
        carro.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de rodas do carro: "));
        carro.cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
        carro.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: "));
        
        JOptionPane.showMessageDialog(null, carro.mostra());
        
        moto.tipo = JOptionPane.showInputDialog("Digite o tipo da moto: ");
        moto.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de rodas da moto: "));
        moto.cor = JOptionPane.showInputDialog("Digite a cor do moto: ");
        moto.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da moto: "));
        
        
        JOptionPane.showMessageDialog(null, moto.mostra());
        
        moto.alteraTipo("AAAAAAAAA");
        Veiculo.alteraNome("BBBBBBBBBBBBBB");
        moto.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de rodas: "));
        moto.cor = JOptionPane.showInputDialog("Informe a cor: ");
        moto.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
        
        
        JOptionPane.showMessageDialog(null, carro.mostra());
        JOptionPane.showMessageDialog(null, moto.mostra());
        JOptionPane.showMessageDialog(null, Veiculo.nroRodas(10));
        JOptionPane.showMessageDialog(null, Veiculo.retornaNovoVeiculo(carro,moto).mostra());
    }
}    

