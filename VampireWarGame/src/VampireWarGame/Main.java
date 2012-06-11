/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VampireWarGame;

/**
 *
 * @author Familia Sevilla
 */
import java.util.Random;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia Sevilla
 * 
 */
public class Main{
    
    public static void main(String args[]){
   
     Scanner lea = new Scanner(System.in);    
     Random ruleta = new Random(5);
     int r;
     int menu;
     String resp;
     Jugadores jug = new Jugadores();
     String jug1;
     String jug2;
     String posInicial;
     String posDestino;
     
     int XposActual = 0;
     int YposActual = 0;
     int XposDestino =0;
     int YposDestino = 0;
     
     SystemJuego TB=new SystemJuego();
    
    do{
    System.out.println("-----Menu------");
    
        System.out.println("1.\tJugar Castlevania Vampire Wargame");
        System.out.println("2.\tEstadisticas del Juego");
        System.out.println("3.\tSalir");
        menu = lea.nextInt();
        
        switch(menu){
            case 1:
                System.out.print("Ingrese el nombre Jugador 1: ");
                jug1 = lea.next();
                jug.AddPlayer(jug1);
                System.out.println("Ingrese el nombre Jugador 2: ");
                jug2 = lea.next();
                jug.AddPlayer(jug2);
  
                
                 TB.Imprimir();
                 
                 
                 for(int k=1;k>0;k++){
                 TB.Imprimir();
                 System.out.println("Turno del Jugador: " + jug1);
                 System.out.println("Que movimiento desea hacer?: ");
                 resp = lea.next();
                 if(resp.equals("GIRAR")){
                 r = ruleta.nextInt();
                 
                 if(r == 0){
                     
                     for(int v=1;v>0;v++){
                     
                     System.out.println("Escriba las Coordenas de un Vampiro: ");
                     System.out.println("Ejemplo: A1,B1...");
                     posInicial=lea.next();
                     
                        if(TB.SaberQueHay(x(posInicial.charAt(0)),y(posInicial))instanceof Vampire){
                            System.out.print("Mover o Atacar ?");
                            if(lea.next().equals("Mover")){
                                System.out.println("Escriba las Coordenas del destino: ");
                                posDestino=lea.next();
                                if(TB.Movimiento(x(posInicial.charAt(0)),y(posInicial),
                                        x(posDestino.charAt(0)),y(posDestino))){
                                        System.out.println("Movimiento Correcto");
                                        v=0;
                                    }else{
                                System.out.println("Movimiento Invalido");
                                }

                            }
                        }else{
                                System.out.println("Esa Ficha no es un Vampiro");
                        }
                     
                     
                     
                     }
                 }else if(r == 1){
                     System.out.println("Elija un Hombro Lobo");
                     for(int v=1;v>0;v++){
                     
                     System.out.println("Escriba las Coordenas del Hombro Lobo: ");
                     System.out.println("Ejemplo: A1,B1...");
                     posInicial=lea.next();
                     
                        if(TB.SaberQueHay(posInicial.charAt(1))instanceof HombreLobo){
                            System.out.print("Mover o Atacar ?");
                            if(lea.next().equals("Mover")){
                                System.out.println("Escriba las Coordenas del destino: ");
                                posDestino=lea.next();
                                if(TB.Movimiento(posInicial, posDestino)){
                                        System.out.println("Movimiento Correcto");
                                        v=0;
                                    }else{
                                System.out.println("Movimiento Invalido");
                                }

                            }
                        }else{
                                System.out.println("Esa Ficha no es un Hombro Lobo");
                        }
                     
                     
                     
                     }
                     
                 }else if(r==2){
                     System.out.println("Elija una Muerte");
                      for(int v=1;v>0;v++){
                     
                     System.out.println("Escriba las Coordenas de una Muerte: ");
                     System.out.println("Ejemplo: A1,B1...");
                     posInicial=lea.next();
                     
                        if(TB.Saber(posInicial)instanceof Vampire){
                            System.out.print("Mover o Atacar ?");
                            if(lea.next().equals("Mover")){
                                System.out.println("Escriba las Coordenas del destino: ");
                                posDestino=lea.next();
                                if(TB.Movimiento(posInicial, posDestino)){
                                        System.out.println("Movimiento Correcto");
                                        v=0;
                                    }else{
                                System.out.println("Movimiento Invalido");
                                }

                            }
                        }else{
                                System.out.println("Esa Ficha no es una Muerte");
                        }
                     
                     
                     
                     }
                     
                 
                 TB.Imprimir();
                 }else if(resp.equals("RETIRAR")) {
                     k=0;
                 }
                 else
                break;
                }
                
            
            
                 }
        }
    }while(menu !=3);
    
    
    
    
    }
    public static int x (char y){
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
    public static int y(String y){
        
    return 0;
    }
}