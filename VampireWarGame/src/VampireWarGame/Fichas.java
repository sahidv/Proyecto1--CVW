package VampireWarGame;

/**
 *
 * @author drako
 * 
 */

public abstract class Fichas {
    protected int lifePoints;
    protected int damagePoints;
    protected int cantMovientos;
    protected String nombreFicha;
    protected String colorFicha;

    public Fichas(String nombre, String color){
        nombreFicha = nombre;
        colorFicha = color;
    }
    
    public abstract void setCantMovimientos(int cant);
    
    public abstract void setCantLP(int lp);
    
    public abstract int setDamagePoints(int codigoFicha);

    
    
    
}
