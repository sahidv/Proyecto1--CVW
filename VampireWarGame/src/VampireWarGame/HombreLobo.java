package VampireWarGame;

/**
 *
 * @author drako
 * 
 */
public class HombreLobo extends Fichas{
    protected int lifePoints;
    protected int damagePoints;
    protected int cantMovientos;
    
    public HombreLobo(String nombre, String color){
        super(nombre,color);
    }
    
    @Override
    protected void setCantMovimientos(int cant){
        cantMovientos = cant;
    }
    
    @Override
    protected void setCantLP(int lp){
        lifePoints = lp;
    }
    
}
