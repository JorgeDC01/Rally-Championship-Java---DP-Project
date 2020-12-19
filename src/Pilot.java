/* ----------
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Pilot implements IPilot {
    private String namePilot;
    private ICar carPilot;
    private Concentration concentration;
    // Map as a collection to store all the results from a pilot with the name of the track
    // as a key.
    private Map<String, Result> results;
    private boolean disqualifyPilot;

    /*
        Initialize a Pilot. Parameterized Constructor
        @param The name of the pilot, The car that will be driven by the pilot, The concentration
        and if he is qualified to stay on the championship.
     */
    protected Pilot(String namePilot, ICar carPilot, Concentration concentration) {
        this.namePilot = namePilot;
        this.carPilot = carPilot;
        this.concentration = concentration;
        this.results = new HashMap<String, Result>();
        this.disqualifyPilot = false;
    }

    /*
        Get the name of the Pilot.
        @return The name of the Pilot as a String
     */
    public String getNamePilot() {
        return namePilot;
    }

    /*
        Set the name of the pilot.
        @param The name of the Pilot as a String
     */
    public void setNamePilot(String namePilot) {
        this.namePilot = namePilot;
    }

    /*
       Get the Car of the Pilot.
       @return The Car of the Pilot as a Car
    */
    public ICar getCarPilot() {
        return carPilot;
    }

    /*
        Set the Car of the pilot.
        @param The car of the Pilot as a Car
     */
    public void setCarPilot(ICar carPilot) {
        this.carPilot = carPilot;
    }

    /*
        Get the name of the Pilot.
        @return The name of the Pilot as a String
     */
    public Concentration getConcentration() {
        return concentration;
    }

    /*
        Set the concentration of the pilot.
        @param The Concentration of the Pilot as a enum concentration
     */
    public void setConcentration(Concentration concentration) {
        this.concentration = concentration;
    }

    /*
        Check and show if the Pilot is disqualified or not at the championship
     */
    public void isDisqualifyPilot() {
        if (disqualifyPilot) {
            System.out.println("The pilot can't participate in the championship anymore");
        } else {
            System.out.println("The pilot is qualified to keep going in the championship");
        }
    }

    /*
        Set the state if the pilot is qualified or not
        @param The state of the Pilot as a boolean
     */
    public void setDisqualifyPilot(boolean disqualifyPilot) {
        this.disqualifyPilot = disqualifyPilot;
    }

    /*
        Get the state of a pilot if he is qualified or not to keep going into the championship
        @return True if he is qualified and False if not
     */
    public boolean getDisqualifyPilot() {
        return this.disqualifyPilot;
    }

    /*
        Get the Map of results of a Pilot.
        @return The maps as a Map
     */
    public Map<String, Result> getResults() {
        return results;
    }

    /*
        Set the map of results of a Pilot
        @param The collection Map of results
     */
    public void setResults(Map<String, Result> results) {
        this.results = results;
    }

    /*
        Override the equals method to compare if two pilots are identical(with their fields)
        @return True if both cars are identical, and False if they aren't identical
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //Both refer to the same car
        }
        if (!(obj instanceof Pilot)) {
            return false; //They have different types
        }
        Pilot other = (Pilot) obj;
        return getNamePilot().equals(other.getNamePilot()) && getCarPilot().equals(other.getCarPilot()) &&
                getConcentration().getName().equals(other.getConcentration().getName()) &&
                getDisqualifyPilot() == other.getDisqualifyPilot();
    }

    /*
        Override the hashcode method.
        @return The code of a pilot as a Int
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 7 * result + ((getCarPilot() == null) ? 0 : getCarPilot().hashCode());
        result = 13 * result + ((getConcentration() == null) ? 0 : getConcentration().getName().hashCode());
        result = 11 * result + getResults().hashCode();

        return result;
    }

    /*
        Find the track's result of a pilot and println it in console
        @param The name of the track where a pilot competed
     */
    public void specificResultTrack(String track) {
        if (results.containsKey(track)) {
            Result r = results.get(track);
            if(r != null)
            System.out.println(r); //calls toString of a result
            else{
                System.out.println("Track didn't find ");
            }
        }
    }

    /*
        Calculate and return the total of points earned by a Pilot
        @return The total of points of results as a Int
     */
    public int totalPointsStored() {
        int total = 0;
        for (Result result : results.values()) {
            total += result.getPoints();
        }
        return total;
    }

    /*
        Calculate the total number of races that the Pilot has participated
        @return The total number of races competed by a pilot as a Int (races finished + left)
     */
    public int numberRacesCompeted() {
        int total = 0;
        for (Result result : results.values()) {
            total++;
        }
        return total;
    }

    /*
        Check if the Pilot has a car assigned to compete in a race.
        @return True if he can compete, and false if the pilot can't compete, showing a message
        saying that he hasn't got a available car.
     */
    public boolean canCompetePilot() {
        if (getCarPilot() == null) {
            System.out.println("The pilot can't be sent to the race bs he hasn't got car");
            return false;
        }
        return true;
    }
    /*
        Abstract method. This method calculate the skill of a pilot, depending if the pilot
        is a beginner,experienced or stars.
        @return The skills as a Double
     */
    public abstract double calculateSkills();

    /*

        @param The track where the pilot will run
    */
    public void funcionalidadPilot(Track track) {

        if(canCompetePilot()){
             if(!isConcentrationEnough(track)){
                 storeResult(track,minutesToFinishRace(track) - getConcentration().getConcentrationPilot());
                 reduceFuelOfCar(getConcentration().getConcentrationPilot());
                }
             else if(!isFuelEnough(track)){
                 storeResult(track,minutesToFinishRace(track) - getCarPilot().getFuelLeftOver());
                 reduceFuelOfCar(getCarPilot().getFuelLeftOver());
             }
             else{
                double minutesToFinish = minutesToFinishRace(track);
                storeResult(track,minutesToFinish);
                reduceFuelOfCar(minutesToFinish);
             }
        }
    }
    /*
        Check if the pilot's concentration is enough to finish the race
        @param The track where the pilot will run as a Track
        @return True(concentration >= minutesToFinishRace) if he can finish the race and False(concentration < minutesToFinishRace) if he can't finish the race
     */
    public boolean isConcentrationEnough(Track track) {
        double concentration = getConcentration().getConcentrationPilot();
        double minutesToFinishRace = minutesToFinishRace(track);
        return (concentration >= minutesToFinishRace);
    }
    /*
        Check if the fuel of the pilot's car is enough to finish the race
        @param The track where the pilot will run as a Track
        @return True if he can finish it (fuel of car >= minutesToFinishRace) and False (fuel of car < minutesToFinishRace) if he can't finish the race
     */
    public boolean isFuelEnough(Track track) {
        double fuel = getCarPilot().getFuelLeftOver();
        double minutesToFinishRace = minutesToFinishRace(track);
        return (fuel >= minutesToFinishRace);
    }
    /*
        Calculate the minutes needed to finish the race by a pilot with a car in a track.
        @param The track where the pilot will run
        @return The minutes to finish the race as a Double
     */
    public double minutesToFinishRace(Track track){
        return getCarPilot().getTimeRace(track.getDistance(),getCarPilot().getRealSpeed(calculateSkills(),track.getComplexity()));
    }
    /*
        Save in the collection results a new result with the name of the track as a key and a new Result
        as a value
        @param The track where the pilot run and The time to save in the result
     */
    public void storeResult(Track track,double time){
        Result result = new Result();
        result.setTime(time);
        results.put(track.getNameTrack(),result);
    }
    /*
        Reduce the fuel of a car using the minutes that the pilot has been running in the race
        @param The minutes run by the pilot
     */
    public void reduceFuelOfCar(double minutesRunning){
        getCarPilot().reduceFuel(minutesRunning);
    }
}
