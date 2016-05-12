/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VampireWarGame;

import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class Jugadores {
    
        protected ArrayList<String> players;
        
       public Jugadores(){
           players = new ArrayList<>();
           
       }
       
       
      public boolean AddPlayer(String n){
    
          
          players.add(n);
      return true;
      }
      
    @Override
      public String toString(){
          return players.toString();
      }
              
}
