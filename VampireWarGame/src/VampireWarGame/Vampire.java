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
    public static final int codFicha = 2;
    
    public Vampire (String nombre, String col){
        super(nombre,col);
    }
    
       
    //FUNCIÓN PARA OBETNER LA DISTANCIA A QUE ESTA DE LA OTRA CASILLA
    //PARA ASI HACER LA FUNCION DE ATAQUE
       
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
    public boolean validarMovieminto(String posInicial, String posDestino) {
       String p1= ""+posInicial.charAt(1);
       String p2= ""+posDestino.charAt(1);
      
        int YposActual = y(posInicial.charAt(0));
        int XposActual = Integer.parseInt(p1);
        int YposDestino = y(posDestino.charAt(0));
        int XposDestino = Integer.parseInt(p2);
        
        //aqui va validar el movimiento
        if(posInicial.equals(posDestino)){
            System.out.println("Moviento Invalido");
            return false;
        }
        
        if((posDestino.charAt(1) - posInicial.charAt(1)) == 1){
            Tablero.HacerElMovimiento(XposActual, YposActual, XposDestino, YposDestino);
            return true;
        }
        System.out.println("Moviento Invalido");
        return false;
    }

    @Override
    public boolean ValidarAtaque(String posInicial, String posEnemigo) {
        String p1= ""+posInicial.charAt(1);
        String p2= ""+posEnemigo.charAt(1);
      
        int YposActual = y(posInicial.charAt(0));
        int XposActual = Integer.parseInt(p1);
        int YposDestino = y(posEnemigo.charAt(0));
        int XposDestino = Integer.parseInt(p2);
        
        //aqui va validar el Ataque
       
        //aqui llama la funcion de que Hace el Atque y hace el dano a la ficha contraria
        // y retorna true a tablero
        //
        return true;
    }
}