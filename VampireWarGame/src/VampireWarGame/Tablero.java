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
        public static int Mov;
        public static int Damage;
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
    
    public void Iniciar(){
        
                
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
    
       
    public void Imprimir(){
        
        System.out.println("  "+"  A  "+"  B  "+"  C  "+"  D  "+"  E  "+"  F  ");
        for(int y=0;y<6;y++){
            System.out.print(y+1+" ");
                for(int x=0;x<6;x++){
                    
                    
                    if(Arreglo[y][x] instanceof HombreLobo ){
                            if(((HombreLobo)Arreglo[y][x]).lifePoints<=0){
                                Arreglo[y][x]=null;
                                
                            }
                       }
                        if(Arreglo[y][x] instanceof Vampire){
                            if(((Vampire)Arreglo[y][x]).lifePoints<=0){
                                Arreglo[y][x]=null;
                               
                            }
                        }
                         if(Arreglo[y][x] instanceof Muerte){
                                 if(((Muerte)Arreglo[y][x]).lifePoints<=0){
                                Arreglo[y][x]=null;
                                
                            }
                         }
                        
                        if(Arreglo[y][x] instanceof Zombie){
                                if(((Zombie)Arreglo[y][x]).lifePoints<=0){
                                    
                                Arreglo[y][x]=null;
                               
                                }
                        }
                    
                    
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
    
    public boolean Movimiento(String posInicial,String posDestino){
       String p1= ""+posInicial.charAt(1);
       String p2= ""+posDestino.charAt(1);
      
        int XposActual = x(posInicial.charAt(0));
        int YposActual = Integer.parseInt(p1)-1;
        int XposDestino = x(posDestino.charAt(0));
        int YposDestino = Integer.parseInt(p2)-1;
        
        if(Arreglo[YposActual][XposActual] instanceof HombreLobo )
            Mov=((HombreLobo)Arreglo[YposActual][XposActual]).cantMovientos;
                
        if(Arreglo[YposActual][XposActual] instanceof Vampire)
                Mov=((Vampire)Arreglo[YposActual][XposActual]).cantMovientos;
                
        if(Arreglo[YposActual][XposActual] instanceof Muerte){
                Mov=((Muerte)Arreglo[YposActual][XposActual]).cantMovientos;
        
        if(((Muerte)Arreglo[YposActual][XposActual]).validarMovieminto(XposActual, YposActual, XposDestino, YposDestino,Mov)){
           HacerElMovimiento(XposActual,YposActual,XposDestino,YposDestino);
           return true;
         }else{
           return false;
            }
        }else
        
       if(Arreglo[YposActual][XposActual].validarMovieminto(XposActual, YposActual, XposDestino, YposDestino,Mov)){
           HacerElMovimiento(XposActual,YposActual,XposDestino,YposDestino);
           return true;
         }else{
           return false;
            }
           
    }
    
    public void HacerElMovimiento(int XposActual,int YposActual,int XposDestino,int YposDestino){
      Arreglo[YposDestino][XposDestino]=Arreglo[YposActual][XposActual];
      Arreglo[YposActual][XposActual]=null;
    }
    
    public boolean Ataque(String posInicial,String posDestino){
        String p1= ""+posInicial.charAt(1);
       String p2= ""+posDestino.charAt(1);
      
        int XposActual = x(posInicial.charAt(0));
        int YposActual = Integer.parseInt(p1)-1;
        int XposDestino = x(posDestino.charAt(0));
        int YposDestino = Integer.parseInt(p2)-1;
        
  if(Arreglo[YposActual][XposActual] instanceof Muerte ){
               
                if(((Muerte)Arreglo[YposActual][XposActual]).AtaqueMortal(XposActual, YposActual, XposDestino, YposDestino)){
                   
                    if(Arreglo[YposDestino][XposDestino]instanceof Vampire){
                            
                        Damage=((Muerte)Arreglo[YposActual][XposActual]).setDamagePoints(2);
                        ((Vampire)Arreglo[YposDestino][XposDestino]).lifePoints=((Vampire)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }else if(Arreglo[YposDestino][XposDestino]instanceof Zombie){
                          
                        Damage=((Muerte)Arreglo[YposActual][XposActual]).setDamagePoints(4);
                        ((Zombie)Arreglo[YposDestino][XposDestino]).lifePoints=((Zombie)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }else if(Arreglo[YposDestino][XposDestino]instanceof Muerte){

                        Damage=((Muerte)Arreglo[YposActual][XposActual]).setDamagePoints(3);
                        ((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }else if(Arreglo[YposDestino][XposDestino]instanceof HombreLobo){

                        Damage=((Muerte)Arreglo[YposActual][XposActual]).setDamagePoints(1);
                        ((HombreLobo)Arreglo[YposDestino][XposDestino]).lifePoints=((HombreLobo)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }
                      }else{
                    
                      return false;
                      
                      }
           }
        
        if(Arreglo[YposActual][XposActual]!=null&&Arreglo[YposActual][XposActual].ValidarAtaque(XposActual, YposActual, XposDestino, YposDestino)){
            
            
         if(Arreglo[YposActual][XposActual] instanceof HombreLobo ){
             
            if(Arreglo[YposDestino][XposDestino]instanceof Vampire){
                
            Damage=((HombreLobo)Arreglo[YposActual][XposActual]).setDamagePoints(2);
            ((Vampire)Arreglo[YposDestino][XposDestino]).lifePoints=((Vampire)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(Arreglo[YposDestino][XposDestino]instanceof Zombie){
                
            Damage=((HombreLobo)Arreglo[YposActual][XposActual]).setDamagePoints(4);
            ((Zombie)Arreglo[YposDestino][XposDestino]).lifePoints=((Zombie)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(Arreglo[YposDestino][XposDestino]instanceof Muerte){
                
            Damage=((HombreLobo)Arreglo[YposActual][XposActual]).setDamagePoints(3);
            ((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(Arreglo[YposDestino][XposDestino]instanceof HombreLobo){
                
            Damage=((HombreLobo)Arreglo[YposActual][XposActual]).setDamagePoints(1);
            ((HombreLobo)Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            }
         }
         
           if(Arreglo[YposActual][XposActual] instanceof Vampire ){
               
            if(Arreglo[YposDestino][XposDestino]instanceof Vampire){
                
            Damage=((Vampire)Arreglo[YposActual][XposActual]).setDamagePoints(1);
            ((Vampire)Arreglo[YposDestino][XposDestino]).lifePoints=((Vampire)Arreglo[YposDestino][XposDestino]).lifePoints=-Damage;
            
            if(((Vampire)Arreglo[YposActual][XposActual]).lifePoints<12){
              ((Vampire)Arreglo[YposActual][XposActual]).lifePoints=((Vampire)Arreglo[YposActual][XposActual]).lifePoints+((Vampire)Arreglo[YposActual][XposActual]).DrenarVida(2);
            }
            if(((Vampire)Arreglo[YposActual][XposActual]).lifePoints>12){
            ((Vampire)Arreglo[YposActual][XposActual]).lifePoints=12;
            }
            
            }else if(Arreglo[YposDestino][XposDestino]instanceof Zombie){
                
            Damage=((Vampire)Arreglo[YposActual][XposActual]).setDamagePoints(4);
            ((Zombie)Arreglo[YposDestino][XposDestino]).lifePoints=((Zombie)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(Arreglo[YposDestino][XposDestino]instanceof Muerte){
                
            Damage=((Vampire)Arreglo[YposActual][XposActual]).setDamagePoints(3);
            ((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(Arreglo[YposDestino][XposDestino]instanceof HombreLobo){
                
            Damage=((Vampire)Arreglo[YposActual][XposActual]).setDamagePoints(1);
            ((HombreLobo)Arreglo[YposDestino][XposDestino]).lifePoints=((HombreLobo)Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            if(((Vampire)Arreglo[YposActual][XposActual]).lifePoints<12){
              ((Vampire)Arreglo[YposActual][XposActual]).lifePoints=((Vampire)Arreglo[YposActual][XposActual]).lifePoints+((Vampire)Arreglo[YposActual][XposActual]).DrenarVida(1);
            }
            if(((Vampire)Arreglo[YposActual][XposActual]).lifePoints>12){
            ((Vampire)Arreglo[YposActual][XposActual]).lifePoints=12;
            }
            
            }
           }
           
                
        
        
        
            return true;
         }else{
           return false;
            }
        
       
        
       
           
    }
        
    public int x(char x){
        switch(x){   
    case 'A': return 0;
    case 'B': return 1;
    case 'C': return 2;
    case 'D': return 3;
    case 'E': return 4;
    case 'F': return 5;
    default: return -1;
        }
    }
    
    public void HacerAtaque(int XposActual,int YposActual,int XposDestino,int YposDestino){
        //Arreglo[YposDestino][XposDestino].lifePoints=Arreglo[YposDestino][XposDestino].lifePoints-Damage;
      
        
        
    }
}   