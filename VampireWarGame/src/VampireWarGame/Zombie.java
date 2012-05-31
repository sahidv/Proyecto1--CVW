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
public class Zombie extends Fichas{
    public static final int codFicha = 4;
    
    public Zombie(String nombre, String col){
        super(nombre,col);
        cantMovientos=0;
        lifePoints = 2;
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
        return 0;     
        
    }

 @Override
    public int getlifePoints() {
       return lifePoints;
    }
 @Override
    public boolean validarMovieminto(int XposActual, int YposActual, int XposDestino, int YposDestino, int Mov) {
        return false;
    }

    @Override
    public boolean ValidarAtaque(int XposActual, int YposActual, int XposDestino, int YposDestino) {
        return false;
    }
 
}
