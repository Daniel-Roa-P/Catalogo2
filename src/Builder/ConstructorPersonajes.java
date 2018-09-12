/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author danbr
 */
public class ConstructorPersonajes extends Constructor {
        
    private String id;
    
    ConstructorPersonajes(String id) {
        this.id=id;
    }
    
    
    @Override
        public void construirPersonaje() {
        
        personaje=new Personaje();
            
        }
        
    @Override
    public void construirArma() {
        
        if("elfo".equals(id)){
            
            personaje.setArma("arco.png");
        
        } else if("humano".equals(id)){
            
            personaje.setArma("espadaHombre.png");
            
        } else if("orco".equals(id)){
            personaje.setArma("martillo.png");
        }
    }

    @Override
    public void construirEscudo() {
        
        if("elfo".equals(id)){
            
            personaje.setEscudo("escudoElfo.png");
        
        } else if("humano".equals(id)){
            
            personaje.setEscudo("escudoHombre.png");
            
        } else if("orco".equals(id)){
            personaje.setEscudo("escudoOrco2.png");
        }
    }

    @Override
    public void construirMontura() {
       
        if("elfo".equals(id)){
            
            personaje.setMontura("reno.png");
        
        } else if("humano".equals(id)){
            
            personaje.setMontura("caballodeguerra.png");
            
        } else if("orco".equals(id)){
            personaje.setMontura("original.png");
        }
        
        
    }

    
    
}
