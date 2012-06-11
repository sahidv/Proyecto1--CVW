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
    
        Fichas Arreglo[][]=new Fichas[6][6];
        Fichas HL1B=new HombreLobo("HL1B","Blanco");
        Fichas VP1B=new Vampire("VP1B","Blanco");
        Fichas MR1B=new Muerte("MR1B","Blanco");
        Fichas HL2B=new HombreLobo("HL2B","Blanco");
        Fichas VP2B=new Vampire("VP2B","Blanco");
        Fichas MR2B=new Muerte("MR2B","Blanco");
        
        Fichas HL1N=new HombreLobo("HL1N","Negro");
        Fichas VP1N=new Vampire("VP1N","Negro");
        Fichas MR1N=new Muerte("MR1N","Negro");
        Fichas HL2N=new HombreLobo("HL2N","Negro");
        Fichas VP2N=new Vampire("VP2N","Negro");
        Fichas MR2N=new Muerte("MR2N","Negro");
    
    public Tablero(){
    
        
        
            Arreglo[0][0]=HL1B;
            Arreglo[0][1]=VP1B;
            Arreglo[0][2]=MR1B;
            Arreglo[0][5]=HL2B;
            Arreglo[0][4]=VP2B;
            Arreglo[0][3]=MR2B;
        
        
            Arreglo[5][0]=HL1N;
            Arreglo[5][1]=VP1N;
            Arreglo[5][2]=MR1N;
            Arreglo[5][5]=HL2N;
            Arreglo[5][4]=VP2N;
            Arreglo[5][3]=MR2N;
        
    }
    
    public void Limpiar_Iniciar(){
    
        for(int y=0;y<6;y++){
                for(int x=0;x<6;x++){
                    
                    Arreglo[y][x]=null;

                }
        
        }
        
            Arreglo[0][0]=HL1B;
            Arreglo[0][1]=VP1B;
            Arreglo[0][2]=MR1B;
            Arreglo[0][5]=HL2B;
            Arreglo[0][4]=VP2B;
            Arreglo[0][3]=MR2B;
        
        
            Arreglo[5][0]=HL1N;
            Arreglo[5][1]=VP1N;
            Arreglo[5][2]=MR1N;
            Arreglo[5][5]=HL2N;
            Arreglo[5][4]=VP2N;
            Arreglo[5][3]=MR2N;
        
    }
}