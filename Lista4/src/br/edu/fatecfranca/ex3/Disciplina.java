
package br.edu.fatecfranca.ex3;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private ArrayList<Topico> topico;

    public Disciplina() {
        this.codigo = "";
        this.topico = new ArrayList();
    }
    
    public Disciplina(String codigo, ArrayList<Topico> topico) {
        this.codigo = codigo;
        this.topico = topico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String saida = "Disciplina{" + "codigo=" + codigo + "}";
        //para cada passageiro no ônibus:
        //passageiro é objeto da classe Passageiro. Passageiros tem vários elementos dentro
        for(Topico top : this.topico){
            saida = saida + topico.toString() + "\n";
        }
        return saida;
                
    }
    
    public void associaTopico(Topico topico){
        this.topico.add(topico);
    }
        
    public void desvincularTopico(Topico topico){
        this.topico.remove(topico);
    }
    
    public boolean obterTopico(Topico topico){
        this.topico.contains(topico);
        return true;
    }
    
    public boolean obterTopico(String assunto){
        //for para pegar a informação dentro do array passageiros
        for(Topico topico: this.topico){
            if(topico.getAssunto().equals(assunto)){
                return true;
            }
        }
        return false;
    }
    
    private int obterPosicaoTopicoo(Topico topico){
        return this.topico.indexOf(topico);
    }

    private int obterPosicaoTopico(String assunto){
        //para cada passageiro
        for(Topico top: this.topico){
            //verifica o CPF do passageiro
            if(top.getAssunto().equals(assunto)){
                return this.topico.indexOf(topico);
            }
        }
        //falso, significa que o objeto não foi encotrado.
        return -1;
    }
    
    public boolean atualizaTopico(Topico topico){
        //
        int pos = obterPosicaoTopico(topico.getAssunto());
        if(pos != -1){
            this.topico.set(pos, topico);
            return true;
        }
        else return false;
    }
   
    
}
