
package Builder;

public class EjercicioBuilder {
    
    private String Arma;
    private String Escudo;
    private String Montura;
    
    public void Operacion(){
   
        Impresion i=new Impresion();
        i.setConstructor(new ConstructorPersonajes());
        i.construirPersonaje();
        
        Personaje personaje = i.getPersonaje();
        Arma=personaje.getArma();
        Escudo=personaje.getEscudo();
        Montura=personaje.getMontura();
    }
    
    public String getArma() {
        return Arma;
    }
    
    public String getEscudo() {
        return Escudo;
    }
    
    public String getMontura() {
        return Montura;
    }
    
}
