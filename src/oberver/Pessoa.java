package oberver;

public class Pessoa {
	
	public void teste(Telefone t) {
		System.out.println("------------");
		t.atendeFone();
		System.out.println("------------");
		t.addTelefoneListener(new TelefoneAdapter() {
			@Override
        	public void telefoneAtendido(TelefoneEvent e) {
        		System.out.println("A pessoa atendeu a extensão!");
        	}
		});
	}
	  
    public void escutaTelefone(Telefone t) {  
  
        t.addTelefoneListener(new TelefoneAdapter() {
        	@Override
        	public void telefoneTocou(TelefoneEvent e) {
        		System.out.println("Eu pego!");
                ((Telefone)(e.getSource())).atendeFone();
        	}
        });  
    }  
} 
