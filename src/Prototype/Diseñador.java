
package Prototype;

public class Diseñador {
    
    private ElfoConcreto elfo;
    private HumanoConcreto humano;
    private OrcoConcreto orco;
            
    public Diseñador(){
        
        elfo=new ElfoConcreto();
        humano=new HumanoConcreto();
        orco=new OrcoConcreto();
        
        elfo.setAspecto("elfo2.png");
        elfo.setArma("arco.png");
        elfo.setEscudo("escudoElfo.png");
        elfo.setMontura("reno.png");
        
        humano.setAspecto("hombre2.png");
        humano.setArma("espadaHombre.png");
        humano.setEscudo("escudoHombre.png");
        humano.setMontura("caballodeguerra.png");
        
        orco.setAspecto("cosaverde2.png");
        orco.setArma("martillo.png");
        orco.setEscudo("escudoOrco2.png");
        orco.setMontura("original.png");
    }
 
    public PrototipoPersonajes retrievePersonaje(String id) {
        if (null != id) switch (id) {
            case "elfo":
                return (PrototipoPersonajes) elfo.clone();
            case "humano":
                return (PrototipoPersonajes) humano.clone();
            case "orco":
                return (PrototipoPersonajes) orco.clone();
            default:
                break;
        }

        return null;
    } // method retrieveAnimal
}