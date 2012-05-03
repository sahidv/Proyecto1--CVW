package VampireWarGame;
/**
 *
 * @author drako
 * 
 */
public abstract class Fichas {
    public String nombreFicha;
    public String colorFicha;
    
    public Fichas(String nombre, String color){
        nombreFicha = nombre;
        colorFicha = color;
    }
    
    protected abstract void setCantMovimientos(int cant);
    
    protected abstract void setCantLP(int lp);
    
}
