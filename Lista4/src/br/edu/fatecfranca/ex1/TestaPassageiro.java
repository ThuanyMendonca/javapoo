package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaPassageiro {
    public static void main(String[] args) {                  
        
        Voo obj1 = new Voo();
        obj1.setDestino("Paris");
        obj1.setNumero("12345");
        
        Reserva obj2 = new Reserva();
        obj2.setCodigo(123);
        obj2.setVoo(obj1);
        
        Passageiro obj3 = new Passageiro();
        obj3.setNome("Thuany");
        obj3.setReserva(obj2);
        
        JOptionPane.showMessageDialog(null, obj3.toString());
    }
    
}
