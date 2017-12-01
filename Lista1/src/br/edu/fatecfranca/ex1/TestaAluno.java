package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {
        //Cria objeto classe aluno - chama o construtor sem parâmetro
        Aluno obj1 = new Aluno();
        //Entrada de dados com usuário
        obj1.nome = JOptionPane.showInputDialog("Informe um nome");
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade"));
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe p1"));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe p2"));
        // calcular nota final
        //obj1.notaFinal();
        
        //Cria objeto da classe Aluno
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Informe p1"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Informe p2"));
        String e = JOptionPane.showInputDialog("Informe um nome");
        
        Aluno obj2 = new Aluno(a,b,c,d,e);
        //obj2.notaFinal();
        
        JOptionPane.showMessageDialog(null, obj1.dadosAluno() + "\nMédia de obj1: " + obj1.notaFinal() + " " + obj1.passou());
        JOptionPane.showMessageDialog(null, obj2.dadosAluno() + "\nMédia de obj2: " + obj2.notaFinal() + " " + obj2.passou());
        
        //JOptionPane.showMessageDialog(null, "Dados alunos obj1\n " + obj1.dadosAluno());
        //JOptionPane.showMessageDialog(null, "Dados alunos obj2\n" + obj2.dadosAluno());
        
        //null - qual janela chamou
        JOptionPane.showMessageDialog(null, "Hello World");
        
    }
    
}
