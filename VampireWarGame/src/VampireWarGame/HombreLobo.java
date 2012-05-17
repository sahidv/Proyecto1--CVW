package VampireWarGame;

/**
 *
 * @author drako
 * 
 */
public class HombreLobo extends Fichas{
    
    public static final int codigoFicha = 1;
    
    
    public HombreLobo(String nombre, String color){
        super(nombre,color);
        lifePoints = 10;
        cantMovientos=2;
       
        
    }

     
    
    /**
     * 
     * @param codFichaContraria
     * @Param Lista de codigos de fichas:
     *        1 Hombre Lobo
     *        2 Vampiro
     *        3 Muerte
     *        4 Zombie
     * @return el daño total que le hace a la ficha contraria, este valor
     *         se lo restamos a los LP's de la ficha atacada
     */
    
    @Override
    public int setDamagePoints(int codFichaContraria){
        switch (codFichaContraria){
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 2;
            default: return 0;       
        } 
    }

    @Override
    public int getlifePoints() {
       return lifePoints;
    }
      
}
        