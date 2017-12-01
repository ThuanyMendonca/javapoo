package br.edu.fatecfranca.ex0;

import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPedido {

    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.setCodigo(100);
        p.setData(new Date());
        p.setValorTotal(300);
        p.setItemPedido(400, 3, 400);
        
        JOptionPane.showMessageDialog(null, p.toString());
        
    }
}
