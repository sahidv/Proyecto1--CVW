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
public class Muerte extends Fichas{
    public static final int codFicha = 3;
    
    public Muerte (String nombre, String col){
        super(nombre,col);
    }
    
    public void castZombie(){
        
    }
    
    @Override
    public void setCantMovimientos(int cant){
        cantMovientos = cant;
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
    public int setDamagePoints(int codFichaContraria){
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

    @Override
    public void setMovimientos(String x, String y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Movientos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarMovieminto(String posInicial, String posDestino) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
