/* ----------
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Pilot implements IPilot {
    private String namePilot;
    private ICar carPilot;
    private Concentration concentration;
    // Map as a collection to store all the results from a pilot with the name of the track as a key.
    private Map<String, Result> results;
    private boolean disqualifyPilot;
    private int numbersGiveUp;
    // actualTrack represents the next track where the pilot will compete. It will make easier the sort of pilots
    // to give them points.
    private String actualTrack;

    /*
        Initialize a Pilot. Parameterized Constructor
        @param namePilot The name of the pilot
        @param carPilot The car that will be driven by the pilot
        @param concentration The concentration of the pilot.
     */
    protected Pilot(String namePilot, ICar carPilot, Concentration concentration) {
        this.namePilot = namePilot;
        this.carPilot = carPilot;
        this.concentration = concentration;
        this.results = new HashMap<String, Result>();
        this.disqualifyPilot = false;
        this.numbersGiveUp = 0;
        this.actualTrack = "";
    }
    /*
        Get the name of the Pilot.
        @return The name of the Pilot as a String.
     */
    public String getNamePilot() {
        return namePilot;
    }
    /*
        Set the name of the pilot.
        @param namePilot The name of the Pilot as a String.
     */
    public void setNamePilot(String namePilot) {
        this.namePilot = namePilot;
    }
    /*
       Get the Car of the Pilot.
       @return The Car of the Pilot as a Car.
    */
    public ICar getCarPilot() {
        return carPilot;
    }
    /*
        Set the Car of the pilot.
        @param carPilot The car of the Pilot as a Car.
     */
    public void setCarPilot(ICar carPilot) {
        this.carPilot = carPilot;
    }
    /*
        Get the name of the Pilot.
        @return The name of the Pilot as a String.
     */
    public Concentration getConcentration() {
        return concentration;
    }
    /*
        Set the concentration of the pilot.
        @param concentration The Concentration of the Pilot as a enum concentration.
     */
    public void setConcentration(Concentration concentration) {
        this.concentration = concentration;
    }
    /*
        Check and show if the Pilot is disqualified, so that shows in console that he is disqualified.
        @param neglect The limited numbers of neglect that a pilot can do during the Championship.
     */
    public void isDisqualifyPilot(int neglect) {
        if (disqualifyPilot) {
            System.out.println("@@@\n¡¡¡" + getNamePilot() + " es DESCALIFICADO del campeonato por alcanzar el límite de abandonos(" + neglect + ") !!!\n@@@");
        }
    }
    /*
        Set the state if the pilot is qualified or not.
        @param disqualifyPilot The state of the Pilot as a boolean.
     */
    public void setDisqualifyPilot(boolean disqualifyPilot) {
        this.disqualifyPilot = disqualifyPilot;
    }
    /*
        Get the state of a pilot if he is qualified or not to keep going into the championship.
        @return True if he is qualified and False if not.
     */
    public boolean getDisqualifyPilot() {
        return this.disqualifyPilot;
    }
    /*
        Get the Map of results of a Pilot..
        @return The maps as a Map.
     */
    public Map<String, Result> getResults() {
        return results;
    }
    /*
        Set the map of results of a Pilot.
        @param results The collection Map of results.
     */
    public void setResults(Map<String, Result> results) {
        this.results = results;
    }
    /*
        Get the name of the actual track where the pilot will compete.
        @return The name of the track.
     */
    public String getActualTrack() { return actualTrack; }
    /*
        Set the name of the track where the pilot will compete.
        @param actualTrack The name of the track where he will compete as a String.
     */
    public void setActualTrack(String actualTrack) { this.actualTrack = actualTrack; }
    /*
        Get the times that the pilot has given up during the championship.
        @return The times as a Int.
     */
    public int getNumbersGiveUp() { return numbersGiveUp; }
    /*
        Increment the times given up by the pilots in one more time. If the times given up is greater than the limit,
        set the disqualifiedPilot true.
        @param neglect The limited numbers of neglect that a pilot can do during the Championship.
     */
    public void incrementNumbersGiveUp(int neglect){
        this.numbersGiveUp++;
        if( getNumbersGiveUp() == neglect){
            setDisqualifyPilot(true);
        }
    }
    /*
        Override the equals method to compare if two pilots are identical(with their fields).
         return True if both cars are identical, and False if they aren't identical.
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
        @return The code of a pilot as a Int.
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
        Find the track's result of a pilot and return the time and points got it.
        @param track The name of the track where a pilot competed.
        @return The Result of the pilot competed in the track.
     */
    public Result specificResultTrack(String track) {
        return getResults().get(track);
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
        Calculate total of races completed by a pilot.
        @return Int the total of races completed.
     */
    public int numberRacesCompleted(){
        int total = 0;
        for(Result result: getResults().values()){
            if(result.getTime() >= 0){
                total++;
            }
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
        The pilot drives in the track depending on his car's fuel and his concentration. So that there will be many different
        situations in which the pilot will tend to do things.
        @param track The track where the pilot will run.
    */
    public void drivePilot(ITrack track) {
        if(canCompetePilot()){
            boolean nothing;
            double minutesToFinish = Math.round(minutesToFinishRace(track)*100d)/100d;
            System.out.println("+++ Con estas condiciones es capaz de correr a " + getCarPilot().getrealSpeed() + " km/hour +++");
            setActualTrack(track.getNameTrack());       //Añado el nombre del circuito donde corre al piloto. Me ayuda a comparar pilotos y poder ordenarlos para mostrar la clasificacion de una carrera

            if(!isConcentrationEnough(track, minutesToFinish)){
                 //nothing = reduceFuelOfCar(getConcentration().getConcentrationPilot());
                 if(!reduceFuelOfCar(getConcentration().getConcentrationPilot())){      // Si al reducir el combustible el coche rapido tiene reserva,entonces usa la reserva y vuelve a comprobar las condiciones.
                     drivePilot(track);
                 }
                 else{
                     double timeNeededToFinish = Math.round((minutesToFinish - getConcentration().getConcentrationPilot())*100d)/100d;
                     System.out.println("¡¡¡ " + getNamePilot() + " perdió la concentración a falta de " + timeNeededToFinish + " minutos para terminar !!!");
                     storeResult(track, getConcentration().getConcentrationPilot() - minutesToFinish);
                     System.out.println("¡¡¡ En el momento del despiste llevaba en la carrera " + getConcentration().getConcentrationPilot() + " minutos !!!");
                     incrementNumbersGiveUp(Organization.getInstance().getNeglectLimited());
                 }
             }
             else if(!isFuelEnough(track, minutesToFinish)){
                 if(!reduceFuelOfCar(minutesToFinish)) {
                     drivePilot(track);
                 }
                 else{
                     double timeNeededToFinish = minutesToFinish - getCarPilot().getFuelLeftOver();
                     System.out.println("¡¡¡ " + getCarPilot().getNameCar() + " se quedó sin combustible a falta de " + timeNeededToFinish + " minutos para terminar !!!");
                     storeResult(track, getCarPilot().getFuelLeftOver() - minutesToFinish);
                     nothing = reduceFuelOfCar(getCarPilot().getFuelLeftOver());
                     System.out.println("¡¡¡ " + getCarPilot().getFuelLeftOver() + " minutos !!!");
                     incrementNumbersGiveUp(Organization.getInstance().getNeglectLimited());
                 }
             }
             else{
                 nothing = reduceFuelOfCar(minutesToFinish);
                 storeResult(track,minutesToFinish);
                System.out.println("+++ " + getNamePilot() + " termina la carrera en " + minutesToFinish + " minutos +++");
             }
             System.out.println("+++ El combustible del " + getCarPilot().getNameCar() + " tras la carrera es " + getCarPilot().getFuelLeftOver() + " +++\n" + "@@@");
             isDisqualifyPilot(Organization.getInstance().getNeglectLimited());
             getCarPilot().setrealSpeed(0);
        }
    }
    /*
        Check if the pilot's concentration is enough to finish the race.
        @param track The track where the pilot will run as a Track.
        @return True(concentration >= minutesToFinishRace) if he can finish the race and False
        (concentration < minutesToFinishRace) if he can't finish the race.
     */
    public boolean isConcentrationEnough(ITrack track, double minutesToFinishRace) {
        double concentration = getConcentration().getConcentrationPilot();
        //double minutesToFinishRace = minutesToFinishRace(track);
        return (concentration >= minutesToFinishRace);
    }
    /*
        Check if the fuel of the pilot's car is enough to finish the race.
        @param track The track where the pilot will run as a Track.
        @return True if he can finish it (fuel of car >= minutesToFinishRace) and False
        (fuel of car < minutesToFinishRace) if he can't finish the race.
     */
    public boolean isFuelEnough(ITrack track, double minutesToFinishRace) {
        double fuel = getCarPilot().getFuelLeftOver();
        //double minutesToFinishRace = minutesToFinishRace(track);
        return (fuel >= minutesToFinishRace);
    }
    /*
        Calculate the minutes needed to finish the race by a pilot with a car in a track.
        @param track The track where the pilot will run.
        @return The minutes to finish the race as a Double.
     */
    public double minutesToFinishRace(ITrack track){
        return getCarPilot().getTimeRace(track.getDistance(),getCarPilot().getRealSpeed(calculateSkills(),track.getComplexity()));
    }
    /*
        Save in the collection results a new result with the name of the track as a key and a new Result
        as a value.
        @param track The track where the pilot run.
        @param time The time to save in the result.
     */
    public void storeResult(ITrack track,double time){
        Result result = new Result();
        result.setTime(Math.round(time*100d)/100d);
        results.put(track.getNameTrack(),result);
    }
    /*
        Reduce the fuel of a car using the minutes that the pilot has been running in the race.
        @param minutesRunning The minutes run by the pilot.
     */
    public boolean reduceFuelOfCar(double minutesRunning){
        return getCarPilot().reduceFuel(minutesRunning);
    }
    /*
        Assign points to the result of a pilot in the track.
        @param nameTrack The name of the track to find the result and points The points that will be assigned.
     */
    public void assignPointsPilot(String nameTrack,int points){
            getResults().get(nameTrack).setPoints(points);
    }
    /*
        Show the result of the pilot in console. First of all, it shows the total of points scored, and after that,
        the results in all races.
        @param ranking The ranking of the pilot that i want to show.
     */
    public void showResult(int ranking){
        if(getDisqualifyPilot()){
            System.out.println("--- Piloto descalificado: " + getNamePilot() + " - Puntos totales anulados: " + totalPointsStored() + " ---");
            Iterator<Map.Entry<String,Result>> it = getResults().entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,Result> aux = it.next();
                System.out.println("Carrera(" + aux.getKey() + ") - Puntos: " + aux.getValue().getPoints() + " - Tiempo: " + aux.getValue().getTime() + " minutos");
            }
        }
        else{
            System.out.println("@@@ Posicion(" + ranking + "): " +  getNamePilot() + " - Puntos totales: " + totalPointsStored() + " @@@");
            Iterator<Map.Entry<String,Result>> it = getResults().entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,Result> aux = it.next();
                System.out.println("Carrera(" + aux.getKey() + ") - Puntos: " + aux.getValue().getPoints() + " - Tiempo: " + aux.getValue().getTime() + " minutos");
            }
        }
    }
}
