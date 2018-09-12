
package Builder;

class Impresion {
   
    private ConstructorPersonajes constructor;

    public void setConstructor(ConstructorPersonajes constructor) {
        
        this.constructor = constructor; 
        
    }
    
    public Personaje getPersonaje(){
        return constructor.getPersonaje();
    }
    
    public void construirPersonaje(){
        
        constructor.construirPersonaje();
        constructor.construirArma();
        constructor.construirMontura();
        constructor.construirEscudo();
    }
    
}
