package VampireWarGame;

/**
 *
 * @author drako
 * 
 */

public abstract class Fichas {
    protected int lifePoints;
    protected int damagePoints;
    protected int cantMovientos;
    
    protected String nombreFicha;
    protected String colorFicha;

        
    public Fichas(String nombre, String color){
        nombreFicha = nombre;
        colorFicha = color;
    }
    public abstract int getlifePoints();
    
    
   public boolean validarMovieminto(int XposActual,int YposActual,int XposDestino,int YposDestino,int Mov) {
              
  
            if(YposActual<YposDestino&&Mov>0){
                    if(XposActual<XposDestino){
                        
                        if(SystemJuego.TB.Arreglo[YposActual+1][XposActual+1]==null&&YposActual+1<6&&XposActual+1<6)
                                                     
                            return validarMovieminto(XposActual+1,YposActual+1,XposDestino,YposDestino,Mov-1);
                            
                    } 

                    if(XposActual>XposDestino&&Mov>0){
                        if(SystemJuego.TB.Arreglo[YposActual+1][XposActual-1]==null&&YposActual+1<6&&XposActual-1>=0)
                                           
                            return validarMovieminto(XposActual-1,YposActual+1,XposDestino,YposDestino,Mov-1);
                            
                    }

                  if(XposActual==XposDestino&&Mov>0){
                   if(SystemJuego.TB.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6&&Mov>0){
                                            
                            return validarMovieminto(XposActual,YposActual+1,XposDestino,YposDestino,Mov-1);
                            
                   }
                   
                   }
                    
            }
                        
            
            
            if(YposActual>YposDestino&&Mov>0){
                    if(XposActual<XposDestino){
                        
                        if(SystemJuego.TB.Arreglo[YposActual-1][XposActual+1]==null&&YposActual-1>=0&&XposActual+1<6)
                                               
                            return validarMovieminto(XposActual+1,YposActual-1,XposDestino,YposDestino,Mov-1);
                            
                    }

                    if(XposActual>XposDestino){
                        if(SystemJuego.TB.Arreglo[YposActual-1][XposActual-1]==null&&YposActual-1>=0&&XposActual-1>=0)
                                            
                            return validarMovieminto(XposActual-1,YposActual-1,XposDestino,YposDestino,Mov-1);
                            
                    }

                    if(XposActual==XposDestino&&Mov>0){
                        if(SystemJuego.TB.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0)
                                      
                            return validarMovieminto(XposActual,YposActual-1,XposDestino,YposDestino,Mov-1);
                            
                    } 
                   
            }          
                    
            
            
          if(YposActual==YposDestino&&Mov>0){
                    if(XposActual<XposDestino){
                        
                        if(SystemJuego.TB.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6)
                                               
                            return validarMovieminto(XposActual+1,YposActual,XposDestino,YposDestino,Mov-1);
                            
                      }
                    
                    if(XposActual>XposDestino){
                        if(SystemJuego.TB.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0)
                                    
                            return validarMovieminto(XposActual-1,YposActual,XposDestino,YposDestino,Mov-1);
                            
                    }

                    if(XposActual==XposDestino&&Mov>0){
                        return true;
                            
                    } 
                    
                        
                   
          }
          
          if(YposActual==YposDestino&&XposActual==XposDestino){
              return true;
          }else
              return false;
            
           
                  
    }
   
    public boolean ValidarAtaque(int XposActual,int YposActual,int XposDestino,int YposDestino){
        if(Math.abs (XposActual-XposDestino)==1&&Math.abs (YposActual-YposDestino)==1&&
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]!=null&&SystemJuego.TB.Arreglo[YposActual][XposActual]!=null){
       
            return true;
        
        }else if(Math.abs (XposActual-XposDestino)==0&&Math.abs (YposActual-YposDestino)==1&&
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]!=null&&SystemJuego.TB.Arreglo[YposActual][XposActual]!=null){
            
        return true;
        
        }else if(Math.abs (XposActual-XposDestino)==1&&Math.abs (YposActual-YposDestino)==0&&
                SystemJuego.TB.Arreglo[YposDestino][XposDestino]!=null&&SystemJuego.TB.Arreglo[YposActual][XposActual]!=null){
           
        return true;
        
        
    }else{
            return false;
        }
    }
    
    public abstract int setDamagePoints(int codigoFicha);
    
       
    

}