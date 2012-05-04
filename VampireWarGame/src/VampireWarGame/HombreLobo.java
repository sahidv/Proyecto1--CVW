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
    protected int codigoFicha = 1;
    
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
    
    /**
     * 
     * @param codFichaContraria
     * @Param Lista de codigos de fichas:
     *        1 Hombre Lobo
     *        2 Vampiro
     *        3 Muerte
     *        4 Zombie
     * @return el daño total que le hace a la ficha contraria, este valo
     *         se lo restamos a los LP's de la ficha atacada
     */
    @Override
    protected int setDamagePoints(int codFichaContraria){
        switch (codFichaContraria){
            case 1:
                return -3;
            case 2:
                return -2;
            case 3:
                return -1;
            case 4:
                return -2;
            default: return 0;     
        } 
    }
    
}
