package br.edu.fatecfranca.exe2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Testa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(4000);
        Assistente assistente = new Assistente();
        assistente.setSalario(2000);
        Vendedor vendedor = new Vendedor();
        vendedor.setSalario(1000);
        vendedor.setComissao(2000);
      
        ArrayList<Funcionario> funcionarios = new ArrayList();
        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);
        float folha = 0;
        for(int i=0;i<funcionarios.size();i++){
            folha += funcionarios.get(i).calculaSalario();
        }
        JOptionPane.showMessageDialog(null, folha);
    }
}
