/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VampireWarGame;

/**
 *
 * @author drako
 * 
 */
public class Vampire extends Fichas{
    protected int lifePoints;
    protected int damagePoints;
    protected int cantMovientos;
    
    public Vampire (String nombre, String col){
        super(nombre,col);
    }
    
    @Override
    protected void setCantMovimientos(int cant){
        lifePoints = cant;
    }
    
    @Override
    protected void setCantLP(int lp){
        lifePoints = lp;
    }
}
