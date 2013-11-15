
package projecte_prop;

/**
 *
 * @author pol
 */
import java.util.Date;
import static Controladors.CtrlDomini.*;

public class Solution {
    int id;
    String nom;  //El nom de la solució serà el nom de la ciutat-sol_i
    Tour tour;
    Date fecha;
    int cost;

    public Solution (){
    fecha = new Date ();
    }
    
    public Solution(String nom,int cost){
        fecha = new Date ();
        id = getID_sol();

        this.nom = nom;
        tour = new Tour();
        this.cost = cost;
    }
    
    public Tour getTour(){
        return tour;
    }
    
    public void addTour(Tour tour){
        this.tour = tour;
    }
    
    public int getid(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getCostSolution(){
       return cost;
    }
    
    public String getData(){
       return (fecha.toString());   
    }
    
}
