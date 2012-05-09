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
    
    Tablero TB=new Tablero();
    TB.Iniciar();
    TB.Imprimir();
//    TB.Movimiento("A1", "B3");
//    TB.Imprimir();
    
    
    Fichas ficha = new HombreLobo("HLN","Blanco");
    
    ficha.setMovimientos("A2" , "B4");
    TB.Imprimir();
    }
}
