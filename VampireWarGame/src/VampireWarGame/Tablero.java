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
    
    public Tablero(){
    
    }
    
    public void Iniciar(){
        Fichas HL1B=new HombreLobo("HL1B","Blanco");
        Fichas VP1B=new Vampire("VP1B","Blanco");
        Fichas MR1B=new Muerte("MR1B","Blanco");
        Fichas HL2B=new HombreLobo("HL2B","Blanco");
        Fichas VP2B=new Vampire("VP2B","Blanco");
        Fichas MR2B=new Muerte("MR2B","Blanco");
                
            Arreglo[0][0]=HL1B;
            Arreglo[0][1]=VP1B;
            Arreglo[0][2]=MR1B;
            Arreglo[0][3]=HL2B;
            Arreglo[0][4]=VP2B;
            Arreglo[0][5]=MR2B;
        
            
        Fichas HL1N=new HombreLobo("HL1N","Negro");
        Fichas VP1N=new Vampire("VP1N","Negro");
        Fichas MR1N=new Muerte("MR1N","Negro");
        Fichas HL2N=new HombreLobo("HL2N","Negro");
        Fichas VP2N=new Vampire("VP2N","Negro");
        Fichas MR2N=new Muerte("MR2N","Negro");
        
            Arreglo[5][0]=HL1N;
            Arreglo[5][1]=VP1N;
            Arreglo[5][2]=MR1N;
            Arreglo[5][3]=HL2N;
            Arreglo[5][4]=VP2N;
            Arreglo[5][5]=MR2N;
            
    }
    public void Imprimir(){
        for(int y=0;y<6;y++){
                for(int x=0;x<6;x++){
                if(Arreglo[y][x]!=null){
                        System.out.print(Arreglo[y][x].nombreFicha+" ");
                }else{
                    System.out.print("  -  ");
                }
                    
                }
                System.out.println(" ");
        }
      System.out.println(" "); 
    }
    
    public void Movimiento(String xy,String xyp){
       String p= ""+xy.charAt(1);
       String p1= ""+xyp.charAt(1);
      
        int y = y(xy.charAt(0));
        int x = Integer.parseInt(p);
        int yp = y(xyp.charAt(0));
        int xp = Integer.parseInt(p1);
        
       Arreglo[yp][xp]=Arreglo[y][x];
       Arreglo[y][x]=null;
        
    
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
}   