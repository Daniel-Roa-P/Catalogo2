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
    
    
    @Override
        public void construirPersonaje() {
        
        personaje=new Personaje();
            
        }
        
    @Override
    public void construirArma() {
        personaje.setArma("espadaHombre.png");
    }

    @Override
    public void construirEscudo() {
        personaje.setEscudo("escudoHombre.png");
    }

    @Override
    public void construirMontura() {
        personaje.setMontura("caballodeguerra.png");
    }

    
    
}
