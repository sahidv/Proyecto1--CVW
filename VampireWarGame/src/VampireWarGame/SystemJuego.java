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
public class SystemJuego {
        
        public static int Mov;
        public static int Damage;
        
        public static Tablero TB;
    
     
    public SystemJuego(){
    
        
        TB= new Tablero();
        
    
    }
    
    public void Limpiar_Iniciar(){
            TB.Limpiar_Iniciar();
    }
      
       
    public void Imprimir(){
        
        System.out.println("  "+"  A  "+"  B  "+"  C  "+"  D  "+"  E  "+"  F  ");
        for(int y=0;y<6;y++){
            System.out.print(y+1+" ");
                for(int x=0;x<6;x++){
                    
                    
                    if(TB.Arreglo[y][x] instanceof HombreLobo ){
                            if(((HombreLobo)TB.Arreglo[y][x]).lifePoints<=0){
                                TB.Arreglo[y][x]=null;
                                
                            }
                       }
                        if(TB.Arreglo[y][x] instanceof Vampire){
                            if(((Vampire)TB.Arreglo[y][x]).lifePoints<=0){
                                TB.Arreglo[y][x]=null;
                               
                            }
                        }
                         if(TB.Arreglo[y][x] instanceof Muerte){
                                 if(((Muerte)TB.Arreglo[y][x]).lifePoints<=0){
                                TB.Arreglo[y][x]=null;
                                
                            }
                         }
                        
                        if(TB.Arreglo[y][x] instanceof Zombie){
                                if(((Zombie)TB.Arreglo[y][x]).lifePoints<=0){
                                    
                                TB.Arreglo[y][x]=null;
                               
                                }
                        }
                    
                    
                if(TB.Arreglo[y][x]!=null){
                    
                       System.out.print(TB.Arreglo[y][x].nombreFicha+" ");
                        
                }else{
                    System.out.print("  -  ");
                }
                    
                }
                System.out.println(" ");
        }
      System.out.println(" "); 
    }
    
    public boolean Movimiento(int XposActual,int YposActual,int XposDestino,int YposDestino){
               
        if(TB.Arreglo[YposActual][XposActual] instanceof HombreLobo )
            Mov=((HombreLobo)TB.Arreglo[YposActual][XposActual]).cantMovientos;
                
        if(TB.Arreglo[YposActual][XposActual] instanceof Vampire)
                Mov=((Vampire)TB.Arreglo[YposActual][XposActual]).cantMovientos;
                
        if(TB.Arreglo[YposActual][XposActual] instanceof Muerte){
                Mov=((Muerte)TB.Arreglo[YposActual][XposActual]).cantMovientos;
        
        if(((Muerte)TB.Arreglo[YposActual][XposActual]).validarMovieminto(XposActual, YposActual, XposDestino, YposDestino,Mov)){
           HacerElMovimiento(XposActual,YposActual,XposDestino,YposDestino);
           return true;
         }else{
           return false;
            }
        }else
        
       if(TB.Arreglo[YposActual][XposActual].validarMovieminto(XposActual, YposActual, XposDestino, YposDestino,Mov)){
           HacerElMovimiento(XposActual,YposActual,XposDestino,YposDestino);
           return true;
         }else{
           return false;
            }
           
    }
    
    private void HacerElMovimiento(int XposActual,int YposActual,int XposDestino,int YposDestino){
      TB.Arreglo[YposDestino][XposDestino]=TB.Arreglo[YposActual][XposActual];
      TB.Arreglo[YposActual][XposActual]=null;
    }
    
    public boolean Ataque(int XposActual,int YposActual,int XposDestino,int YposDestino){
       
        
  if(TB.Arreglo[YposActual][XposActual] instanceof Muerte ){
               
                if(((Muerte)TB.Arreglo[YposActual][XposActual]).AtaqueMortal(XposActual, YposActual, XposDestino, YposDestino)){
                   
                    if(TB.Arreglo[YposDestino][XposDestino]instanceof Vampire){
                            
                        Damage=((Muerte)TB.Arreglo[YposActual][XposActual]).setDamagePoints(2);
                        ((Vampire)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Vampire)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }else if(TB.Arreglo[YposDestino][XposDestino]instanceof Zombie){
                          
                        Damage=((Muerte)TB.Arreglo[YposActual][XposActual]).setDamagePoints(4);
                        ((Zombie)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Zombie)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }else if(TB.Arreglo[YposDestino][XposDestino]instanceof Muerte){

                        Damage=((Muerte)TB.Arreglo[YposActual][XposActual]).setDamagePoints(3);
                        ((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }else if(TB.Arreglo[YposDestino][XposDestino]instanceof HombreLobo){

                        Damage=((Muerte)TB.Arreglo[YposActual][XposActual]).setDamagePoints(1);
                        ((HombreLobo)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((HombreLobo)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
                            return true;
                        }
                      }else{
                    
                      return false;
                      
                      }
           }
        
        if(TB.Arreglo[YposActual][XposActual]!=null&&TB.Arreglo[YposActual][XposActual].ValidarAtaque(XposActual, YposActual, XposDestino, YposDestino)){
            
            
         if(TB.Arreglo[YposActual][XposActual] instanceof HombreLobo ){
             
            if(TB.Arreglo[YposDestino][XposDestino]instanceof Vampire){
                
            Damage=((HombreLobo)TB.Arreglo[YposActual][XposActual]).setDamagePoints(2);
            ((Vampire)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Vampire)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(TB.Arreglo[YposDestino][XposDestino]instanceof Zombie){
                
            Damage=((HombreLobo)TB.Arreglo[YposActual][XposActual]).setDamagePoints(4);
            ((Zombie)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Zombie)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(TB.Arreglo[YposDestino][XposDestino]instanceof Muerte){
                
            Damage=((HombreLobo)TB.Arreglo[YposActual][XposActual]).setDamagePoints(3);
            ((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(TB.Arreglo[YposDestino][XposDestino]instanceof HombreLobo){
                
            Damage=((HombreLobo)TB.Arreglo[YposActual][XposActual]).setDamagePoints(1);
            ((HombreLobo)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            }
         }
         
           if(TB.Arreglo[YposActual][XposActual] instanceof Vampire ){
               
            if(TB.Arreglo[YposDestino][XposDestino]instanceof Vampire){
                
            Damage=((Vampire)TB.Arreglo[YposActual][XposActual]).setDamagePoints(1);
            ((Vampire)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Vampire)TB.Arreglo[YposDestino][XposDestino]).lifePoints=-Damage;
            
            if(((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints<12){
              ((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints=((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints+((Vampire)TB.Arreglo[YposActual][XposActual]).DrenarVida(2);
            }
            if(((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints>12){
            ((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints=12;
            }
            
            }else if(TB.Arreglo[YposDestino][XposDestino]instanceof Zombie){
                
            Damage=((Vampire)TB.Arreglo[YposActual][XposActual]).setDamagePoints(4);
            ((Zombie)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Zombie)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(TB.Arreglo[YposDestino][XposDestino]instanceof Muerte){
                
            Damage=((Vampire)TB.Arreglo[YposActual][XposActual]).setDamagePoints(3);
            ((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((Muerte)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            }else if(TB.Arreglo[YposDestino][XposDestino]instanceof HombreLobo){
                
            Damage=((Vampire)TB.Arreglo[YposActual][XposActual]).setDamagePoints(1);
            ((HombreLobo)TB.Arreglo[YposDestino][XposDestino]).lifePoints=((HombreLobo)TB.Arreglo[YposDestino][XposDestino]).lifePoints-Damage;
            
            if(((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints<12){
              ((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints=((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints+((Vampire)TB.Arreglo[YposActual][XposActual]).DrenarVida(1);
            }
            if(((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints>12){
            ((Vampire)TB.Arreglo[YposActual][XposActual]).lifePoints=12;
            }
            
            }
           }
           
                
        
        
        
            return true;
         }else{
           return false;
            }
        
       
        
       
           
    }
        
    
    private void HacerAtaque(int XposActual,int YposActual,int XposDestino,int YposDestino){
       
        TB.Arreglo[YposDestino][XposDestino].lifePoints=TB.Arreglo[YposDestino][XposDestino].lifePoints-Damage;
              
        
    }
    
    public Fichas SaberQueHay(int XposDestino,int YposDestino){
            
            return TB.Arreglo[YposDestino][XposDestino];
    
    }
    
    public boolean BuscarVacia(int XposDestino,int YposDestino){
    
        if(TB.Arreglo[YposDestino][XposDestino]==null){
        return true;
        }else{
        return false;
        }
        
    
    }
}