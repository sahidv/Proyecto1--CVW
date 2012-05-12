/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VampireWarGame;

/**
 *
 * @author Familia Sevilla
 * 
 */
public class Tablero {
        public static Fichas Arreglo[][]=new Fichas[6][6];
    
    public void Iniciar(){
        Fichas HL1B=new HombreLobo("HL1B","Blanco");
        Fichas VP1B=new Vampire("VP1B","Blanco");
        Fichas MR1B=new Muerte("MR1B","Blanco");
        Fichas HL2B=new HombreLobo("HL2B","Blanco");
        Fichas VP2B=new Vampire("VP2B","Blanco");
        Fichas MR2B=new Muerte("MR2B","Blanco");
                
            Arreglo[0][0]=HL1B;
            Arreglo[1][0]=VP1B;
            Arreglo[2][0]=MR1B;
            Arreglo[3][0]=HL2B;
            Arreglo[4][0]=VP2B;
            Arreglo[5][0]=MR2B;
        
            
        Fichas HL1N=new HombreLobo("HL1N","Negro");
        Fichas VP1N=new Vampire("VP1N","Negro");
        Fichas MR1N=new Muerte("MR1N","Negro");
        Fichas HL2N=new HombreLobo("HL2N","Negro");
        Fichas VP2N=new Vampire("VP2N","Negro");
        Fichas MR2N=new Muerte("MR2N","Negro");
        
            Arreglo[0][5]=HL1N;
            Arreglo[1][5]=VP1N;
            Arreglo[2][5]=MR1N;
            Arreglo[3][5]=HL2N;
            Arreglo[4][5]=VP2N;
            Arreglo[5][5]=MR2N;
    }
    
    public void Imprimir(){
        for(int y=0;y<6;y++){
                for(int x=0;x<6;x++){
                if(Arreglo[x][y]!=null){
                        System.out.print(Arreglo[x][y].nombreFicha+" ");
                }else{
                    System.out.print("  -  ");
                }
                    
                }
                System.out.println(" ");
        }
      System.out.println(" "); 
    }
    
    public boolean Movimiento(String posActual,String posDestino){
       String p1= ""+posActual.charAt(1);
       
        int YposActual = y(posActual.charAt(0));
        int XposActual = Integer.parseInt(p1);
        
       return Arreglo[XposActual][YposActual].validarMovieminto(posActual, posDestino);
    }
    
    public static void HacerElMovimiento(int XposActual,int YposActual,int XposDestino,int YposDestino){
      Arreglo[XposDestino][YposDestino]=Arreglo[XposActual][YposActual];
      Arreglo[XposActual][YposActual]=null;
    }
    
    public int y(char y){
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
    
    public boolean Ataque(String posActual,String posEnemigo){
       String p1= ""+posActual.charAt(1);
      
        int YposActual = y(posActual.charAt(0));
        int XposActual = Integer.parseInt(p1);
        return Arreglo[YposActual][XposActual].ValidarAtaque(posActual, posEnemigo);
    }
}   