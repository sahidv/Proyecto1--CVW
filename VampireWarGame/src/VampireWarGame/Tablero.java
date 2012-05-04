/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VampireWarGame;

/**
 *
 * @author Familia Sevilla
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
        
            
        Fichas HL1N=new HombreLobo("HL1B","Negro");
        Fichas VP1N=new Vampire("VP1B","Negro");
        Fichas MR1N=new Muerte("MR1B","Negro");
        Fichas HL2N=new HombreLobo("HL2B","Negro");
        Fichas VP2N=new Vampire("VP2B","Negro");
        Fichas MR2N=new Muerte("MR2B","Negro");
        
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
    }

}   