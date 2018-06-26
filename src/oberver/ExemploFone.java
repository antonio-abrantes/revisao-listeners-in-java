package oberver;

/*
 * http://rollingwithcode.blogspot.com/2009/04/criando-seus-proprios-eventos-no-java.html
 * http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/arqu/observer.htm
 * */

public class ExemploFone {  
	  
    public static void main(String[] args) {   
  
        Telefone fone = new Telefone();  
  
        Pessoa fulano = new Pessoa();  
  
        SecretariaEletronica se = new SecretariaEletronica();  
  
        fone.addTelefoneListener(se);  
  
//        fulano.escutaTelefone(fone);
//        fulano.teste(fone);
  
        fone.tocaFone(); // começa a brincadeira  
  
    }  
  
} 
