/*
    This class represents the teams that will compete to win the championship of teams and the same with
    their pilots. Each object is formed with the name of the team,
 */
import java.util.*;

public class Team {

    private String nameTeam;
    //A List, the dinamic type is a ArrayList
    private List<IPilot> pilotsTeam;
    private  List<ICar> carsTeam;
    //field that stores a strategy 's comparator
    Comparator<IPilot> comparatorPilots;
    Comparator<ICar> comparatorCars;
    private boolean ascOrDescPilots;
    private boolean ascOrDescCars;

    /*
        Parameterized constructor of a team.
        @param nameTeam The name of the team
        @param ascOrDescPilots The direction to order the collection of pilots.
        @param ascOrDescCars The direction to order the collection of cars.
     */
    public Team(String nameTeam,boolean ascOrDescPilots, boolean ascOrDescCars, Comparator<IPilot> compPilots,Comparator<ICar> compCars) {
        this.nameTeam = nameTeam;
        this.pilotsTeam = new ArrayList<IPilot>();
        this.carsTeam = new ArrayList<ICar>();
        this.ascOrDescPilots = ascOrDescPilots;
        this.ascOrDescCars = ascOrDescCars;
        this.comparatorPilots = compPilots;
        this.comparatorCars = compCars;

    }
    /*
        Get the name of the team
        @return The name of the team
    */
    public String getNameTeam() { return nameTeam; }
    /*
        Set the name of the team.
        @param nameTeam The name of the team.
    */
    public void setNameTeam(String nameTeam) { this.nameTeam = nameTeam; }
    /*
        Get the pilots of the Team.
        @return The pilots of a team.
    */
    public List<IPilot> getPilotsTeam() { return pilotsTeam; }
    /*
        Set the pilots of the team.
        @param pilotsTeam The List of pilots to set into the team.
    */
    public void setPilotsTeam(List<IPilot> pilotsTeam) { this.pilotsTeam = pilotsTeam; }
    /*
        Get the cars of the team.
        @return The cars of the team as a List.
    */
    public List<ICar> getCarsTeam() { return carsTeam; }
    /*
        Set the cars of the team.
        @param carsTeam The List of cars that the team will have.
    */
    public void setCarsTeam(List<ICar> carsTeam) { this.carsTeam = carsTeam; }
    /*
      Get if the collection of pilots will be sorted in a ascendant way or descendant way.
      @return The direction of sorting.
    */
    public boolean getAscOrDescPilots(){return this.ascOrDescPilots;}
    /*
        Set the direction of the ranking.
        @param ascOrDescPilots The Direction as a Boolean: 1 if its ascending and 0 if it is descending.
    */
    public void setAscOrDescPilots(boolean ascOrDescPilots) { this.ascOrDescPilots = ascOrDescPilots;}
    /*
        Get the direction of the ranking.
        @return The direction of sorting as a Boolean: TRUE if its sorted ascendant and FALSE if its sorted in descendant way.
     */
    public boolean getAscOrDescCars() { return ascOrDescCars; }
    /*
        Set the direction of the ranking. TRUE: ASCENDANT. FALSE: DESCENDANT.
        @param ascOrDescCars The direction.
     */
    public void setAscOrDescCars(boolean ascOrDescCars) { this.ascOrDescCars = ascOrDescCars; }
    /*
        Set the Strategy comparator of the Pilots.
        @param comp The Comparator for The list of pilots.
    */
    public void setComparatorPilots(Comparator<IPilot> comp){this.comparatorPilots = comp;}
    /*
        Set the Strategy comparator of the Pilots.
        @param comp The Comparator for the List of pilots.
     */
    public void setComparatorCars(Comparator<ICar> comp){this.comparatorCars = comp;}
    /*
        Sort the collection of Pilots of a Team.
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
        Sort the collection of Pilots of a Team.
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
        Show all Pilots that the Team has in console.
     */
    public void showPilotsOfTeam(){
        Iterator<IPilot> it = getPilotsTeam().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /*
        Show all Cars that the Team has in console.
     */
    public void showCarsOfTeam(){
        Iterator<ICar> it = getCarsTeam().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /*
        Insert the pilot given into the Collection of pilots.
        @param pilot The pilot who will be competing with the team.
     */
    public void addPilot(Pilot pilot){this.getPilotsTeam().add(pilot);}
    /*
        Insert the car given into de Collection of Cars.
        @param car The Car which will be competing with the team by a pilot.
     */
    public void addCar(ICar car){getCarsTeam().add(car);}
    /*
        Get the total races completed of the team by his pilots during the championship.
        @return The total of races completed.
     */
    public int getRacesCompleted(){
        Iterator<IPilot> it = getPilotsTeam().iterator();
        int countRacesCompleted = 0;
        while(it.hasNext()){
            countRacesCompleted =+ it.next().numberRacesCompleted();
        }
        return countRacesCompleted;
    }
    /*
        The team registers in the Championship with the Organization.
     */
    public void registerTeam(){
        Organization.getInstance().registeredTeam(this);
    }
    /*
        Override the method hashCode because The organization will collect all teams registered in a Set,
        So it's needed the hashcode to work with the HashSet.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 7 * result + getNameTeam().hashCode();
        result = 13 * result + getPilotsTeam().hashCode();
        result = 11 * result + getCarsTeam().hashCode();
        result = 5 * result + pointsTeam();
        return result;
    }
    /*
        Override the method equals to be used with the collection of teams in the Organization as a HashCode.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //Both refer to the same car
        }
        if (!(obj instanceof Pilot)) {
            return false; //They have different types
        }
        Team other = (Team) obj;
        return  getNameTeam().equals(other.getNameTeam()) && getAscOrDescCars() == other.getAscOrDescCars() &&
                getAscOrDescPilots() == getAscOrDescPilots();
    }
    /*
        Override the method toString.
        @return The output of a team in console.
     */
    @Override
    public String toString() {
        String output = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" +
                "%%%" + getNameTeam() + "%%%" + "\n";
        for(int i = 0; i < getPilotsTeam().size(); i++){
            output = output + getPilotsTeam().get(i).toString() + "\n";
        }

        for(int i = 0; i < getCarsTeam().size(); i++){
            output = output + getCarsTeam().get(i).toString() + "\n";
        }
        output = output + "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        return output;
    }
    /*
        Send a list of all the pilots available of a team to the Organization. If the pilot doesn't have a car,
        shows in console a message.
        @return The list of pilots who have a car assigned.
     */
    public List<IPilot> sendPilotsTeam(){
        Iterator <IPilot> itPilot = getPilotsTeam().iterator();
        Iterator <ICar> itCar = getCarsTeam().iterator();
        IPilot p;
        ICar c;
        List<IPilot> list = new ArrayList<IPilot>();
        while(itPilot.hasNext()){
            boolean noCarFound = true;
            p = itPilot.next();
            // return the pilot with a car assigned or within it.
            while(itCar.hasNext() && !p.getDisqualifyPilot() && noCarFound){
                c = itCar.next();
                if(c.hasFuelCar()){
                    p.setCarPilot(c);
                    noCarFound = false;
                    list.add(p);
                }
            }
            p.canCompetePilot();
        }
        return list;
    }
    /*
        Return a list of all the pilots that aren't disqualified in a ArrayList
        @return The list of pilots qualified of the team.
     */
    public List<IPilot> qualifiedPilotsTeam(){
        List<IPilot> list = new ArrayList<IPilot>();
        for(IPilot pilot: getPilotsTeam()){
            if(!pilot.getDisqualifyPilot()){
                list.add(pilot);
            }
        }
        return list;
    }
    /*
        Return a list of all the pilots that are  disqualified in a ArrayList
        @return The list of pilots disqualified of the team.
     */
    public List<IPilot> disqualifiedPilotsTeam(){
        List<IPilot> list = new ArrayList<IPilot>();
        for(IPilot pilot: getPilotsTeam()){
            if(pilot.getDisqualifyPilot()){
                list.add(pilot);
            }
        }
        return list;
    }
    /*
        Indicates if the team is qualified or disqualified at the end of the championship.
        @return True if it is qualified and false if it is disqualified.
     */
    public boolean isQualifiedTeamEnd(){
        boolean qualified = false;
        Iterator<IPilot> it = getPilotsTeam().iterator();
        while(it.hasNext() && !qualified){
            if(!it.next().getDisqualifyPilot()){
                qualified = true;
            }
        }
        return qualified;
    }
    /*
        Calculate the total of points scored by the team's pilots.
        @return The total points scored by the team.
     */
    public int pointsTeam(){
        int cont = 0;
        for(IPilot pilot: getPilotsTeam()) {
            if(!pilot.getDisqualifyPilot()) {
                cont = cont + pilot.totalPointsStored();
            }
        }
        return cont;
    }
}
