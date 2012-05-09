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
    
    public abstract void setCantMovimientos(int cant);
    
    public abstract boolean validarMovieminto(String posInicial, String posDestino);
    
    public abstract int setDamagePoints(int codigoFicha);
    
    public abstract void setMovimientos(String x, String y);
    
    public abstract void Movientos();

//    public abstract void setPOSICION_X(int POSICION_X);

  //  public abstract void setPOSICION_Y(int POSICION_Y);
}
