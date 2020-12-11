/*
    This class represents the teams that will compete to win the championship of teams and the same with
    their pilots. Each object is formed with the name of the team,
 */
import java.util.*;

public class Team {

    private String nameTeam;
    //A List, the dinamic type is a ArrayList
    private List<Pilot> pilotsTeam;
    private  List<Car> carsTeam;
    //field that stores a strategy 's comparator
    Comparator<Pilot> comparatorPilots;
    Comparator<Car> comparatorCars;
    private boolean ascOrDescPilots;
    private boolean ascOrDescCars;

    public Team(String nameTeam,boolean ascOrDescPilots, boolean ascOrDescCars) {
        this.nameTeam = nameTeam;
        this.pilotsTeam = new ArrayList<Pilot>();
        this.carsTeam = new ArrayList<Car>();
        this.ascOrDescPilots = ascOrDescPilots;
        this.ascOrDescCars = ascOrDescCars;
    }

    /*
        Get the name of the team
        @return The name of the team
     */
    public String getNameTeam() { return nameTeam; }
    /*
        Set the name of the team
        @param The name of the team as a String
     */
    public void setNameTeam(String nameTeam) { this.nameTeam = nameTeam; }
    /*
        Get the pilots of the Team
        @return The pilots of a team as a List
     */
    public List<Pilot> getPilotsTeam() { return pilotsTeam; }
    /*
        Set the pilots of the team
        @param The List of pilots to set into the team.
    */
    public void setPilotsTeam(List<Pilot> pilotsTeam) { this.pilotsTeam = pilotsTeam; }
    /*
        Get the cars of the team
        @return The cars of the team as a List
    */
    public List<Car> getCarsTeam() { return carsTeam; }
    /*
        Set the cars of the team
        @param The List of cars that the team will have.
    */
    public void setCarsTeam(List<Car> carsTeam) { this.carsTeam = carsTeam; }
    /*
      Get if the collection of pilots will be sorted in a ascendant way or descendant way
      @return The direction of sorting as a Boolean.
    */
    public boolean getAscOrDescPilots(){return this.ascOrDescPilots;}
    /*
        Set the direction of the ranking.
        @param Direction as a Boolean: 1 if its ascending and 0 if it is descending
    */
    public void setAscOrDescPilots(boolean ascOrDescPilots) { this.ascOrDescPilots = ascOrDescPilots;}
    /*
        Get the direction of the ranking.
        @return The direction of sorting as a Boolean: TRUE if its sorted ascendant and FALSE if its sorted descendant
     */
    public boolean getAscOrDescCars() { return ascOrDescCars; }
    /*
        Set the direction of the ranking. TRUE: ASCENDANT. FALSE: DESCENDANT
        @param The direction as a Boolean.
     */
    public void setAscOrDescCars(boolean ascOrDescCars) { this.ascOrDescCars = ascOrDescCars; }
    /*
        Set the Strategy comparator of the Pilots.
        @param The Comparator for The list of pilots
    */
    public void setComparatorPilots(Comparator<Pilot> comp){this.comparatorPilots = comp;}
    /*
        Set the Strategy comparator of the Pilots
        @param The Comparator for the List of pilots.
     */
    public void setComparatorCars(Comparator<Car> comp){this.comparatorCars = comp;}
    /*
        Sort the collection of Pilots of a Team
        @param A boolean that represents the direction of the ranking
    */
    public void sortPilots(){
        //1 = ASCENDANT
        if(getAscOrDescPilots()){
            Collections.sort(getPilotsTeam(),comparatorPilots);
        }
        //0 = DESCENDANT
        else{
            Collections.sort(getPilotsTeam(),Collections.reverseOrder(comparatorPilots));
        }
    }
    /*
        Sort the collection of Pilots of a Team
        @param A boolean that represents the direction of the ranking
    */
    public void sortCars(){
        //1 = ASCENDANT
        if(getAscOrDescCars()){
            Collections.sort(getCarsTeam(),comparatorCars);
        }
        //0 = DESCENDANT
        else{
            Collections.sort(getCarsTeam(),Collections.reverseOrder(comparatorCars));
        }
    }
    /*
        Show all Pilots that the Team has in console
     */
    public void showPilotsOfTeam(){
        Iterator<Pilot> it = getPilotsTeam().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /*
        Show all Cars that the Team has in console
     */
    public void showCarsOfTeam(){
        Iterator<Car> it = getCarsTeam().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /*
        Insert the pilot given into the Collection of pilots
        @param The pilot who will be competing with the team
     */
    public void addPilot(Pilot pilot){this.getPilotsTeam().add(pilot);}
    /*
        Insert the car given into de Collection of Cars
        @param The Car which will be competing with the team by a pilot
     */
    public void addCar(Car car){getCarsTeam().add(car);}
}
