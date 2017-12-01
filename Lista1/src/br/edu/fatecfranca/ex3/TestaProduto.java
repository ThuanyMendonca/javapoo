package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        Produto obj1 = new Produto();
        
        obj1.id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        obj1.descricao = JOptionPane.showInputDialog("Descrição do pdoruto: ");
        obj1.qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
        obj1.preco = Float.parseFloat(JOptionPane.showInputDialog("Preço:"));
        obj1.comprar(Integer.parseInt(JOptionPane.showInputDialog("Comprar: ")));
        obj1.vender(Integer.parseInt(JOptionPane.showInputDialog("Vender: ")));
        obj1.subir(Integer.parseInt(JOptionPane.showInputDialog("Aumentar valor: ")));
        obj1.descer(Integer.parseInt(JOptionPane.showInputDialog("Diminuir valor: ")));
        
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String b = JOptionPane.showInputDialog("Descrição do produto: ");
        int c = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));
        
        Produto obj2 = new Produto(a,b,c,d);
        
        obj2.comprar(Integer.parseInt(JOptionPane.showInputDialog("Comprar: ")));
        obj2.vender(Integer.parseInt(JOptionPane.showInputDialog("Vender: ")));
        obj2.subir(Integer.parseInt(JOptionPane.showInputDialog("Aumentar valor: ")));
        obj2.descer(Integer.parseInt(JOptionPane.showInputDialog("Diminuir valor: ")));
        
        JOptionPane.showMessageDialog(null,obj1.mostra());
        JOptionPane.showMessageDialog(null,obj2.mostra());   
    }
}
