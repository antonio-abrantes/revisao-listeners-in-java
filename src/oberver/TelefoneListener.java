package oberver;

public interface TelefoneListener extends java.util.EventListener {  
	  
    void telefoneTocou(TelefoneEvent e);  
  
    void telefoneAtendido(TelefoneEvent e);  
} 
