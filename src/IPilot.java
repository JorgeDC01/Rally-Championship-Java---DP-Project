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
    void isDisqualifyPilot(int neglect);
    void setDisqualifyPilot(boolean disqualifyPilot);
    boolean getDisqualifyPilot();
    int getNumbersGiveUp();
    void incrementNumbersGiveUp(int neglect);
    Map<String, Result> getResults();
    void setResults(Map<String, Result> results);
    String getActualTrack();
    void setActualTrack(String actualTrack);
    Result specificResultTrack(String track);
    int totalPointsStored();
    int numberRacesCompeted();
    boolean canCompetePilot();
    double calculateSkills();
    void drivePilot(ITrack track);
    boolean isConcentrationEnough(ITrack track, double minutesToFinishRace);
    boolean isFuelEnough(ITrack track, double minutesToFinishRace);
    double minutesToFinishRace(ITrack track);
    void storeResult(ITrack track,double time);
    boolean reduceFuelOfCar(double minutesRunning);
    void assignPointsPilot(String nameTrack,int points);
    void showResult(int ranking);
}
