package br.edu.fatecfranca.exe1;
import br.edu.fatecfranca.exe1.BemTeVi;
import br.edu.fatecfranca.exe1.Cachorro;
import br.edu.fatecfranca.exe1.Papagaio;
import br.edu.fatecfranca.exe1.Vaca;
import javax.swing.JOptionPane;
public class TestaAnimal {
    public static void main(String[] args) {
        BemTeVi bemTeVi = new BemTeVi("Bem-Te-Vi");
        Cachorro cachorro = new Cachorro();
        Papagaio papagaio = new Papagaio();
        Vaca vaca = new Vaca("Vaca");
        
        cachorro.setNome("dog");
        papagaio.setNome("passarinho");
        
        JOptionPane.showMessageDialog(null, bemTeVi.imp());
        JOptionPane.showMessageDialog(null, cachorro.imp());
        JOptionPane.showMessageDialog(null, papagaio.imp());
        JOptionPane.showMessageDialog(null, vaca.imp());
    }
    
}
