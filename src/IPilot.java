import java.util.Map;
/*
    The interface of a Pilot with his methods.
 */
public interface IPilot {
    /*
        Get the name of the Pilot.
        @return The name of the Pilot as a String.
     */
    String getNamePilot();
    /*
        Set the name of the pilot.
        @param namePilot The name of the Pilot as a String.
     */
    void setNamePilot(String namePilot);
    /*
       Get the Car of the Pilot.
       @return The Car of the Pilot as a Car.
    */
    ICar getCarPilot();
    /*
        Set the Car of the pilot.
        @param carPilot The car of the Pilot as a Car.
     */
    void setCarPilot(ICar carPilot);
    /*
        Get the name of the Pilot.
        @return The name of the Pilot as a String.
     */
    Concentration getConcentration();
    /*
        Set the concentration of the pilot.
        @param concentration The Concentration of the Pilot as a enum concentration.
     */
    void setConcentration(Concentration concentration);
    /*
        Check and show if the Pilot is disqualified, so that shows in console that he is disqualified.
        @param neglect The limited numbers of neglect that a pilot can do during the Championship.
     */
    void isDisqualifyPilot(int neglect);
    /*
        Set the state if the pilot is qualified or not.
        @param disqualifyPilot The state of the Pilot as a boolean.
     */
    void setDisqualifyPilot(boolean disqualifyPilot);
    /*
        Get the state of a pilot if he is qualified or not to keep going into the championship.
        @return True if he is qualified and False if not.
     */
    boolean getDisqualifyPilot();
    /*
        Get the times that the pilot has given up during the championship.
        @return The times as a Int.
     */
    int getNumbersGiveUp();
    /*
        Increment the times given up by the pilots in one more time. If the times given up is greater than the limit,
        set the disqualifiedPilot true.
        @param neglect The limited numbers of neglect that a pilot can do during the Championship.
     */
    void incrementNumbersGiveUp(int neglect);
    /*
        Get the Map of results of a Pilot..
        @return The maps as a Map.
     */
    Map<String, Result> getResults();
    /*
        Set the map of results of a Pilot.
        @param results The collection Map of results.
     */
    void setResults(Map<String, Result> results);
    /*
        Get the name of the actual track where the pilot will compete.
        @return The name of the track.
     */
    String getActualTrack();
    /*
        Set the name of the track where the pilot will compete.
        @param actualTrack The name of the track where he will compete as a String.
     */
    void setActualTrack(String actualTrack);
    /*
        Find the track's result of a pilot and return the time and points got it.
        @param track The name of the track where a pilot competed.
        @return The Result of the pilot competed in the track.
     */
    Result specificResultTrack(String track);
    /*
        Calculate and return the total of points earned by a Pilot
        @return The total of points of results as a Int
     */
    int totalPointsStored();
    /*
        Calculate the total number of races that the Pilot has participated
        @return The total number of races competed by a pilot as a Int (races finished + left)
     */
    int numberRacesCompeted();
    /*
        Calculate total of races completed by a pilot.
        @return Int the total of races completed.
     */
    int numberRacesCompleted();
    /*
        Check if the Pilot has a car assigned to compete in a race.
        @return True if he can compete, and false if the pilot can't compete, showing a message
        saying that he hasn't got a available car.
     */
    boolean canCompetePilot();
    /*
        Abstract method. This method calculate the skill of a pilot, depending if the pilot
        is a beginner,experienced or stars.
        @return The skills as a Double
     */
    abstract double calculateSkills();
    /*
        The pilot drives in the track depending on his car's fuel and his concentration. So that there will be many different
        situations in which the pilot will tend to do things.
        @param track The track where the pilot will run.
    */
    void drivePilot(ITrack track);
    /*
        Check if the pilot's concentration is enough to finish the race.
        @param track The track where the pilot will run as a Track.
        @param minutesToFinishRace The minutes that the pilot needs to finish the race.
        @return True(concentration >= minutesToFinishRace) if he can finish the race and False
        (concentration < minutesToFinishRace) if he can't finish the race.
     */
    boolean isConcentrationEnough(ITrack track, double minutesToFinishRace);
    /*
        Check if the fuel of the pilot's car is enough to finish the race.
        @param track The track where the pilot will run as a Track.
        @param minutesToFinishRace The minutes that the pilot needs to finish the race.
        @return True if he can finish it (fuel of car >= minutesToFinishRace) and False
        (fuel of car < minutesToFinishRace) if he can't finish the race.
     */
    boolean isFuelEnough(ITrack track, double minutesToFinishRace);
    /*
        If the concentration of the pilot is not enough, this method will be called to continue processing the driving.
        @param track The track where the pilot is running.
        @param minutesToFinish The minutes that the pilots needs to finish the race.
     */
    void notEnoughConcentration(ITrack track, double minutesToFinish);
    /*
        If the fuel of the pilot's car is not enough, this method will be called to continue processing the driving.
        @param track The track where the pilot is running.
        @param minutesToFinish The minutes that the pilots needs to finish the race.
     */
    void notEnoughFuel(ITrack track, double minutesToFinish);
    /*
        This method is called if the fuel and the concentration is enough to end a race by a pilot.
        Println in console the minutes needed to finish the race.
     */
    void enoughConcentrationAndFuel(ITrack track, double minutesToFinish);
    /*
       Calculate the minutes needed to finish the race by a pilot with a car in a track.
       @param track The track where the pilot will run.
       @return The minutes to finish the race as a Double.
    */
    double minutesToFinishRace(ITrack track);
    /*
        Save in the collection results a new result with the name of the track as a key and a new Result
        as a value.
        @param track The track where the pilot run.
        @param time The time to save in the result.
     */
    void storeResult(ITrack track,double time);
    /*
        Reduce the fuel of a car using the minutes that the pilot has been running in the race.
        @param minutesRunning The minutes run by the pilot.
     */
    boolean reduceFuelOfCar(double minutesRunning);
    /*
        Assign points to the result of a pilot in the track.
        @param nameTrack The name of the track to find the result and points The points that will be assigned.
     */
    void assignPointsPilot(String nameTrack,int points);
    /*
        Show the result of the pilot in console. First of all, it shows the total of points scored, and after that,
        the results in all races.
        @param ranking The ranking of the pilot that i want to show.
     */
    void showResult(int ranking);
    /*
        Check the order to run the conditions in drivePilot.
        @return True if concentration < fuel and false if fuel < concentration
     */
    boolean checkOrder();
}
