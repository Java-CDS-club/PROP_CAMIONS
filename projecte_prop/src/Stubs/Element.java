/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stubs;

/**
 *
 * @author pol
 */
public  class Element {
    int id;
    boolean enabled;
    
<<<<<<< HEAD
    public Element() {
       int id = 1;
       boolean enabled=true;     
    }
    
    public Element(int id){
        
    }
=======
      public Element() {
       id = 1;
       enabled=true;     
    }
     public Element (int id){
         this.id = id;
         enabled = true;
     } 
 
    public int getID(){
        return id;       
    }
    
    public boolean isEnabled(){
        return enabled;       
    }
    
    public void modifyEnabled(boolean newvalue){
        enabled=newvalue;
    }
   public void modifyid(int id){
       this.id=id;
   }
   
   
         
      
>>>>>>> pol
}
