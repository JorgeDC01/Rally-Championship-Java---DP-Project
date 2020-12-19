import java.util.Map;
/*
    The interface of a Pilot with his methods.
 */
public interface IPilot {
    String getNamePilot();
    void setNamePilot(String namePilot);
    ICar getCarPilot();
    void setCarPilot(ICar carPilot);
    Concentration getConcentration();
    void setConcentration(Concentration concentration);
    void isDisqualifyPilot();
    void setDisqualifyPilot(boolean disqualifyPilot);
    boolean getDisqualifyPilot();
    Map<String, Result> getResults();
    void setResults(Map<String, Result> results);
    void specificResultTrack(String track);
    int totalPointsStored();
    int numberRacesCompeted();
    boolean canCompetePilot();
    double calculateSkills();
    void funcionalidadPilot(Track track);
    boolean isConcentrationEnough(Track track);
    boolean isFuelEnough(Track track);
    double minutesToFinishRace(Track track);
    void storeResult(Track track,double time);
    void reduceFuelOfCar(double minutesRunning);
}
