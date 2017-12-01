package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TestaCurso {
    public static void main(String[] args) {
        Topico t1 = new Topico("Algebra");
        Topico t2 = new Topico("Portugues");
        Topico t3 = new Topico("História");
        
        Disciplina d1 = new Disciplina();
        d1.setCodigo("D1");
        d1.associaTopico(t1);
        d1.associaTopico(t2);
        
        Disciplina d2 = new Disciplina();
        d1.setCodigo("D2");
        d1.associaTopico(t3);
        
        Curso c1 = new Curso();
        c1.setNome("Ensino Médio");
        c1.associaDisciplina(d1);
        
        JOptionPane.showMessageDialog(null, c1.toString());
    }
    
}
