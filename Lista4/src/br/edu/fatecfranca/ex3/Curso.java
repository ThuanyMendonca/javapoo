package br.edu.fatecfranca.ex3;

import java.util.ArrayList;

public class Curso {
    private String nome;
        private ArrayList<Disciplina> disciplina;


    public Curso() {
        this.nome = "";
        this.disciplina = new ArrayList();

    }

    public Curso(String nome, ArrayList<Disciplina> disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        String saida =  "Curso{" + ", nome=" + nome;
        for(Disciplina disciplina: this.disciplina){
            saida = saida + disciplina.toString() + "\n";            
        }
        return saida;
    }
   
    public void associaDisciplina(Disciplina disciplina){
        this.disciplina.add(disciplina);
    }
   
    public boolean associaTopicoDisciplina(Disciplina dis, Topico top){
        if(this.disciplina.contains(dis)){
            dis.associaTopico(top);
            return true;
        }
        return false;
    }
    
    public boolean desvinculaDisciplina(Disciplina disciplina){
        return this.disciplina.remove(disciplina);
    }
    
    public boolean desvinculaTopicoDisciplina(Topico top, Disciplina dis){
        //Vê se o topico está dentro da disciplina
        if(this.disciplina.contains(dis)){
            //se o onibus está na rodoviária, tira o passageiro do onibus
            dis.desvincularTopico(top);
            return true;
        }
        return false;
    }
    
    public boolean obterDisciplina (Disciplina disciplina){
        return this.disciplina.contains(disciplina);

    }
    
    public boolean obterTopicoDisciplina (Disciplina dis, Topico top){
        if(this.disciplina.contains(dis)){
            return dis.obterTopico(top);
        }
        return false;
    }
    
    public boolean obterDisciplina(int codigo){
        for(Disciplina dis: this.disciplina){
            //Saber se onibus está na rodoviária, se tiver pegar onibus pelo número do onibus
            if(dis.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
    private int obterPosicaoDisciplina(Disciplina disciplina){
         return this.disciplina.indexOf(disciplina);
    }
    
    private int obterPosicaoDisciplina(String codigo){
        for(Disciplina disciplina: this.disciplina){
            if(disciplina.getCodigo().equals(codigo)){
                return this.disciplina.indexOf(disciplina);
            }
        }
        return -1;
    }
    public boolean atualizaDisciplina (Disciplina atual, Disciplina nova){
        int pos = this.obterPosicaoDisciplina(nova);
        if(pos != -1){
            this.disciplina.set(pos, nova);
            return true;
        }
        else return false;
    }
    
    public boolean atualizaPassageiroOnibus(Disciplina dis, Topico top){
         if(this.disciplina.contains(dis)){
            return dis.atualizaTopico(top);
        }
        return false;
    }
}
