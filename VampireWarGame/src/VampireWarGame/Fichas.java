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
    protected static int POSICION_X;
    protected static int POSICION_Y;
    protected String nombreFicha;
    protected String colorFicha;

    public Fichas(String nombre, String color){
        nombreFicha = nombre;
        colorFicha = color;
    }
    
   public abstract boolean validarMovieminto(String posInicial, String posDestino);
    
    public abstract boolean ValidarAtaque(String posInicial, String posEnemigo);
    
    public abstract int setDamagePoints(int codigoFicha);
    
    public int y (char y){
        switch(y){   
    case 'A': return 0;
    case 'B': return 1;
    case 'C': return 2;
    case 'D': return 3;
    case 'E': return 4;
    case 'F': return 5;
    default: return -1;
        }
    }

//    public abstract void setPOSICION_X(int POSICION_X);

  //  public abstract void setPOSICION_Y(int POSICION_Y);
}
