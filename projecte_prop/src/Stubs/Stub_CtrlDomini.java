/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stubs;

import static Controladors.CtrlDomini.Id_global_element;

/**
 *
 * @author pol
 */
public class Stub_CtrlDomini {
    
      static String path_adjacencies_store =
   "src\\Fitxers\\saved_adjacencys.txt";
    
    static String path_adjacencies_load =
   "src\\Fitxers\\saved_adjacencys.txt";
     
    static String path_elements_load =
   "src\\Fitxers\\saved_elements.txt";
    
    static String path_elements_store =
   "src\\Fitxers\\saved_elements.txt";
    
    static public int Id_global_element;
    
    public void iniciarDomini(){
        
    }
    
    public static int getnewID(){
    int id = Id_global_element;
    ++Id_global_element;
    return id;
    }
    
    public static String get_path_adjacencies_store(){
        return path_adjacencies_store;
    }
    public static String get_path_adjacencies_load(){
        return path_adjacencies_load;
    }
    
    public static void edit_path_adjacencies_store(String st){
        path_adjacencies_store = st;
    }
    public static void edit_path_adjacencies_load(String st){
        path_adjacencies_load = st;
    }
    
     public static String get_path_elements_store(){
        return path_elements_store;
    }
    public static String get_path_elements_load(){
        return path_elements_load;
    }
    
    public static void edit_path_elements_store(String st){
        path_elements_store = st;
    }
    public static void edit_path_elements_load(String st){
        path_elements_load = st;
}
}
    