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
public class Muerte extends Fichas{
    public static final int codFicha = 3;
    
    public Muerte (String nombre, String col){
        super(nombre,col);
        cantMovientos=3;
        lifePoints = 15;
    }
    
    public boolean castZombie(int XposDestino,int YposDestino){
       if(SystemJuego.TB.Arreglo[YposDestino][XposDestino]==null){
            
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]=new Zombie("ZOM"+nombreFicha.charAt(3), colorFicha);
                return true;
            
       }else 
           return false;
    }
    
    public boolean ValidarM(int XposActual, int YposActual, int XposDestino, int YposDestino, int Mov,int t){
        
        
        if(t==0){
            
            if(Mov==1){
                              if(SystemJuego.TB.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6
                                 &&YposActual==YposDestino&&XposActual+1==XposDestino
                                      
                                      
                                 ||SystemJuego.TB.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0
                                 &&YposActual==YposDestino&&XposActual-1==XposDestino){
                                  
                                    Mov=0;
                                    return true;
                                    
                              }                           
                                                     
            }
            
            if(SystemJuego.TB.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6){
                
                    return ValidarM(XposActual,YposActual+1,XposDestino,YposDestino,Mov-1,t);
                    
            }else{
            
                return false;
            }
            
            
        }
        
        if(t==1){
            
            if(Mov==1){
                              if(SystemJuego.TB.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6
                                 &&YposActual==YposDestino&&XposActual+1==XposDestino
                                      
                                      
                                 ||SystemJuego.TB.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0
                                 &&YposActual==YposDestino&&XposActual-1==XposDestino){
                                  
                                    Mov=0;
                                    return true;
                                    
                              }                           
                                                     
            }
            
            if(SystemJuego.TB.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0){
                
                    return ValidarM(XposActual,YposActual-1,XposDestino,YposDestino,Mov-1,t);
                    
            }else{
            
                return false;
            }
            
            
        }
        
        if(t==2){
            
            if(Mov==1){
                              if(SystemJuego.TB.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6
                                 &&YposActual+1==YposDestino&&XposActual==XposDestino
                                      
                                      
                                 ||SystemJuego.TB.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0
                                 &&YposActual-1==YposDestino&&XposActual==XposDestino){
                                  
                                    Mov=0;
                                    return true;
                                    
                              }                           
                                                     
            }
            
            if(SystemJuego.TB.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6){
                
                    return ValidarM(XposActual+1,YposActual,XposDestino,YposDestino,Mov-1,t);
                    
            }else{
            
                return false;
            }
            
            
            
        }
        if(t==3){
            
            if(Mov==1){
                              if(SystemJuego.TB.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6
                                 &&YposActual+1==YposDestino&&XposActual==XposDestino
                                      
                                      
                                 ||SystemJuego.TB.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0
                                 &&YposActual-1==YposDestino&&XposActual==XposDestino){
                                  
                                    Mov=0;
                                    return true;
                                    
                              }                           
                                                     
            }
            
            if(SystemJuego.TB.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0){
                
                    return ValidarM(XposActual-1,YposActual,XposDestino,YposDestino,Mov-1,t);
                    
            }else{
            
                return false;
            }
            
            
            
        }
        
        
        return false;
        
        
    }
    
    
   @Override
    public boolean validarMovieminto(int XposActual, int YposActual, int XposDestino, int YposDestino, int Mov) {
       
       
       if(YposDestino-YposActual==2){
       
           return ValidarM(XposActual,YposActual,XposDestino,YposDestino,Mov,0);
           
        }
       
       if(YposActual-YposDestino==2){
       
           return ValidarM(XposActual,YposActual,XposDestino,YposDestino,Mov,1);
           
        }
       
        if(XposDestino-XposActual==2){
       
           return ValidarM(XposActual,YposActual,XposDestino,YposDestino,Mov,2);
           
        }
        
        if(XposActual-XposDestino==2){
       
           return ValidarM(XposActual,YposActual,XposDestino,YposDestino,Mov,3);
           
        }
       
       return false;
   }
    
    @Override
    public int setDamagePoints(int codFichaContraria){
        switch (codFichaContraria){
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 2;
            default: return 0;     
        } 
    }
     @Override
    public int getlifePoints() {
       return lifePoints;
    }
     
    public boolean AtaqueMortal(int XposActual,int YposActual,int XposDestino,int YposDestino){
       
        if(Math.abs(XposActual-XposDestino)>=2&&Math.abs(YposActual-YposDestino)>=2&&
                Math.abs(XposActual-XposDestino)<=3&&Math.abs(YposActual-YposDestino)<=3&&
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]!=null&&SystemJuego.TB.Arreglo[YposActual][XposActual]!=null){
            
            return true;
        
        }else if(
                Math.abs(XposActual-XposDestino)>=2&&Math.abs(XposActual-XposDestino)<=3&&
                Math.abs(YposActual-YposDestino)==0&&
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]!=null&&SystemJuego.TB.Arreglo[YposActual][XposActual]!=null){
            
        return true;
        
        }else if(
                Math.abs(YposActual-YposDestino)>=2&&Math.abs(YposActual-YposDestino)<=3&&
                Math.abs(XposActual-XposDestino)==0&&
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]!=null&&SystemJuego.TB.Arreglo[YposActual][XposActual]!=null){
           
        return true;
        
        
    }else{
             
            return false;
        }
    } 
}