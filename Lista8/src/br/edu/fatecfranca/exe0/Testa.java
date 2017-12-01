package br.edu.fatecfranca.exe0;
public class Testa {
    public static void main(String[] args) {
        PessoaA pa = new PessoaA();
        System.out.println(pa.beber());
        System.out.println(pa.comerDoce());
        
        PessoaB pb = new PessoaB();
        System.out.println(pb.beber());
        System.out.println(pb.comerDoce());
        System.out.println(pb.fumar());
        
        // NÃO PODE FAZER UM NEW EM UMA CLASSE INTERFACE
        // Só pode criar um objeto de uma classe que tem o objeto que implementei
        
        Diabetico di = new PessoaA();
        System.out.println(di.comerDoce());
        System.out.println(di.herdaPais());
        
        Alcoolatra al = new PessoaA();
        System.out.println(al.beber());
        
        Alcoolatra al2 = new PessoaB();
        System.out.println(al2.beber());
        
        /*
            NÃO PODE:
            Fumante fu = new PessoaA();
            Porque fumante não faz parte da classe PessoaA, apenas da PessoaB
            
        */
        
    }
    
}
