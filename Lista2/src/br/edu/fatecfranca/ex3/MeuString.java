package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class MeuString {

    public static void main(String[] args) {
        String str1 = "Meu primeiro string";
        //Metodo de instancia
        int comprimento = str1.length();
        //Metodo de classe
        char caracter = str1.charAt(2);
        //Metodo de classe
        String str2 = String.valueOf(comprimento);
        
        JOptionPane.showMessageDialog(null, "String 1: " + str1 + "\nString 2: " + str2);
    }
}