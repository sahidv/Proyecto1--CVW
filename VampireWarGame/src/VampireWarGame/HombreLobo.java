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
     * @return el daño total que le hace a la ficha contraria, este valor
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
    public void Movientos() {
        
    }

    @Override
    public void setMovimientos(String posActual, String posDestino) {
        Tablero tb = new Tablero();
        tb.Movimiento(posActual, posDestino);
    }

    @Override
    public boolean validarMovieminto(String posInicial, String posDestino) {
       String p1= ""+posInicial.charAt(1);
       String p2= ""+posDestino.charAt(1);
      
        int YposActual = y(posInicial.charAt(0));
        int XposActual = Integer.parseInt(p1);
        int YposDestino = y(posDestino.charAt(0));
        int XposDestino = Integer.parseInt(p2);
        
        //aqui va validar el movimiento
       
        
        Tablero.MMovimiento(YposActual,XposActual,YposDestino,XposDestino);
        return true;
    }
    
        
}
        