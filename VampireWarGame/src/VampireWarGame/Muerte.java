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
       if(Tablero.Arreglo[YposDestino][XposDestino]==null){
            
                Tablero.Arreglo[YposDestino][XposDestino]=new Zombie("ZOM"+nombreFicha.charAt(3), colorFicha);
                return true;
            
       }else 
           return false;
    }
    
    public boolean CastZombie(String posDestino){
       
       String p2= ""+posDestino.charAt(1);
      
        
        int XposDestino = x(posDestino.charAt(0));
        int YposDestino = Integer.parseInt(p2)-1;
        return castZombie(XposDestino,YposDestino);
        
    }

    @Override
    public boolean validarMovieminto(int XposActual, int YposActual, int XposDestino, int YposDestino, int Mov) {
        
       
        
        
        if(YposActual<YposDestino&&Mov>0){
                    if(XposActual<XposDestino){
                        
                        if(Mov==1){
                              if(Tablero.Arreglo[YposActual+1][XposActual-1]==null&&YposActual+1<6&&XposActual-1>=0
                                      &&YposActual+1==YposDestino&&XposActual-1==XposDestino
                                      ||Tablero.Arreglo[YposActual+1][XposActual-1]==null&&YposActual+1<6&&XposActual-1>=0
                                      &&YposActual-1==YposDestino&&XposActual+1==XposDestino){
                                  
                                    Mov=0;
                                        return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual+1][XposActual+1]==null&&YposActual+1<6&&XposActual+1<6){
                                                     
                                                     
                            return validarMovieminto(XposActual+1,YposActual+1,XposDestino,YposDestino,Mov-1);
                        }     
                    } 

                    if(XposActual>XposDestino&&Mov>0){
                        
                        if(Mov==1){
                              if(Tablero.Arreglo[YposActual+1][XposActual+1]==null&&YposActual+1<6&&XposActual+1<6
                                      &&YposActual+1==YposDestino&&XposActual+1==XposDestino
                                      ||Tablero.Arreglo[YposActual-1][XposActual-1]==null&&YposActual-1>=0&&XposActual-1>=0
                                      &&YposActual-1==YposDestino&&XposActual-1==XposDestino){
                                        Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual+1][XposActual-1]==null&&YposActual+1<6&&XposActual-1>=0){
                                           
                            return validarMovieminto(XposActual-1,YposActual+1,XposDestino,YposDestino,Mov-1);
                            
                    }
                   }

                  if(XposActual==XposDestino&&Mov>0){
                      
                      if(Mov==1){
                              if(Tablero.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0
                                      &&YposActual==YposDestino&&XposActual-1==XposDestino
                                      ||Tablero.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6
                                      &&YposActual==YposDestino&&XposActual+1==XposDestino){
                                       Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                      
                      
                   if(Tablero.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6&&Mov>0){
                                            
                            return validarMovieminto(XposActual,YposActual+1,XposDestino,YposDestino,Mov-1);
                            
                   }
                   
                   }
                    
            }
                        
            
            
            if(YposActual>YposDestino&&Mov>0){
                    if(XposActual<XposDestino){
                        
                         if(Mov==1){
                              if(Tablero.Arreglo[YposActual+1][XposActual+1]==null&&YposActual+1<6&&XposActual+1<6
                                      &&YposActual+1==YposDestino&&XposActual+1==XposDestino
                                      ||Tablero.Arreglo[YposActual-1][XposActual-1]==null&&YposActual-1>=0&&XposActual-1>=0
                                      &&YposActual-1==YposDestino&&XposActual-1==XposDestino){
                                        Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual-1][XposActual+1]==null&&YposActual-1>=0&&XposActual+1<6)
                                               
                            return validarMovieminto(XposActual+1,YposActual-1,XposDestino,YposDestino,Mov-1);
                            
                    }

                    if(XposActual>XposDestino){
                        
                        if(Mov==1){
                              if(Tablero.Arreglo[YposActual-1][XposActual+1]==null&&YposActual-1>=0&&XposActual+1<6
                                      &&YposActual-1==YposDestino&&XposActual+1==XposDestino
                                      ||Tablero.Arreglo[YposActual+1][XposActual-1]==null&&YposActual+1<6&&XposActual-1>=0
                                      &&YposActual+1==YposDestino&&XposActual-1==XposDestino){
                                        Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual-1][XposActual-1]==null&&YposActual-1>=0&&XposActual-1>=0)
                                            
                            return validarMovieminto(XposActual-1,YposActual-1,XposDestino,YposDestino,Mov-1);
                            
                    }

                    if(XposActual==XposDestino&&Mov>0){
                        
                        if(Mov==1){
                              if(Tablero.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0
                                      &&YposActual==YposDestino&&XposActual-1==XposDestino
                                      ||Tablero.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6
                                      &&YposActual==YposDestino&&XposActual+1==XposDestino){
                                        Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0)
                                      
                            return validarMovieminto(XposActual,YposActual-1,XposDestino,YposDestino,Mov-1);
                            
                    } 
                   
            }          
                    
            
            
          if(YposActual==YposDestino&&Mov>0){
                    if(XposActual<XposDestino){
                        
                        if(Mov==1){
                              if(Tablero.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6
                                      &&YposActual+1==YposDestino&&XposActual==XposDestino
                                      ||Tablero.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0
                                      &&YposActual-1==YposDestino&&XposActual==XposDestino){
                                       Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual][XposActual+1]==null&&XposActual+1<6)
                                               
                            return validarMovieminto(XposActual+1,YposActual,XposDestino,YposDestino,Mov-1);
                            
                      }
                    
                    if(XposActual>XposDestino){
                        
                        if(Mov==1){
                              if(Tablero.Arreglo[YposActual+1][XposActual]==null&&YposActual+1<6
                                      &&YposActual+1==YposDestino&&XposActual==XposDestino
                                      ||Tablero.Arreglo[YposActual-1][XposActual]==null&&YposActual-1>=0
                                      &&YposActual-1==YposDestino&&XposActual==XposDestino){
                                        Mov=0;
                                  return true;
                              }                           
                                                     
                                  }
                        
                        if(Tablero.Arreglo[YposActual][XposActual-1]==null&&XposActual-1>=0)
                                    
                            return validarMovieminto(XposActual-1,YposActual,XposDestino,YposDestino,Mov-1);
                            
                    }

                    if(XposActual==XposDestino&&Mov>0){
                        
                        return false;
                            
                    } 
                    
                        
                   
          }
          
          if(YposActual==YposDestino&&XposActual==XposDestino&&Mov<1){
              return true;
          }else
              return false;
            
           
        
        
    }
    /**
     * 
     * @param codFichaContraria
     * @Param Lista de codigos de fichas:
     *        1 Hombre Lobo
     *        2 Vampiro
     *        3 Muerte
     *        4 Zombie
     * @return el daño total que le hace a la ficha contraria, este valo
     *         se lo restamos a los LP's de la ficha atacada
     */
    
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
                Tablero.Arreglo[YposDestino][XposDestino]!=null&&Tablero.Arreglo[YposActual][XposActual]!=null){
            
            return true;
        
        }else if(
                Math.abs(XposActual-XposDestino)>=2&&Math.abs(XposActual-XposDestino)<=3&&
                Math.abs(YposActual-YposDestino)==0&&
                Tablero.Arreglo[YposDestino][XposDestino]!=null&&Tablero.Arreglo[YposActual][XposActual]!=null){
            
        return true;
        
        }else if(
                Math.abs(YposActual-YposDestino)>=2&&Math.abs(YposActual-YposDestino)<=3&&
                Math.abs(XposActual-XposDestino)==0&&
                Tablero.Arreglo[YposDestino][XposDestino]!=null&&Tablero.Arreglo[YposActual][XposActual]!=null){
           
        return true;
        
        
    }else{
             
            return false;
        }
    } 
}
