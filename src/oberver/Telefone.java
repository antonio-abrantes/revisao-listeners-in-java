package oberver;

import java.util.ArrayList;
import java.util.Collection;

public class Telefone {  
	  
    private Collection <TelefoneListener> telefoneListeners = new ArrayList<TelefoneListener>();  
 
    // método de suporte para testar a solução  
    public void tocaFone() {  
        disparaTelefoneTocou();  
    }  
  
    public void atendeFone() {  
        disparaTelefoneAtendido();  
    }  
  
    public synchronized void addTelefoneListener(TelefoneListener listener) {   
        if(!telefoneListeners.contains(listener)) {   
            telefoneListeners.add(listener);  
        }  
    }  
  
    public synchronized void removeTelefoneListener(TelefoneListener listener) {  
        telefoneListeners.remove(listener);  
    }  
  
    private void disparaTelefoneTocou() {  
        Collection <TelefoneListener> tl;  
        
        synchronized (this) { 
            tl = (Collection)(((ArrayList)telefoneListeners).clone());  
        }  
  
        TelefoneEvent evento = new TelefoneEvent(this);                  
  
        for (TelefoneListener t : tl) {  
            t.telefoneTocou(evento);  
        }  
    }  
  
    private void disparaTelefoneAtendido() {  
  
        Collection <TelefoneListener> tl;  
  
        synchronized (this) {  
            tl = (Collection)(((ArrayList)telefoneListeners).clone());  
        }  
  
        TelefoneEvent evento = new TelefoneEvent(this);  
  
        for (TelefoneListener t : tl) {
            t.telefoneAtendido(evento);
        }          
    }  
} 
