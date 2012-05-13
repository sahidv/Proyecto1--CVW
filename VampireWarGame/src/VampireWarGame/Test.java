package VampireWarGame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia Sevilla
 * 
 */
public class Test {
    
    public static void main(String args[]){
   
        Fichas HL = new HombreLobo("HB", "Blaco");
        
    Tablero TB=new Tablero();
    TB.Iniciar();
    TB.Imprimir();
    //TB.Movimiento("A1", "C4");
    //TB.Imprimir();
    
    HL.validarMovieminto("A0", "A2");
    TB.Imprimir();
    
    }
}
