/*
    The interface of a Car with his methods.
 */
public interface ICar {
    String getNameCar();
    Speed getSpeedCar();
    Fuel getInitialFuel();
    double getFuelLeftOver();
    double getRealSpeed(double skills,double complexity);
    double getTimeRace(double distance,double realSpeed);
    boolean reduceFuel(double minutesCompeted);
    boolean hasFuelCar();
    double getrealSpeed();
    void setrealSpeed(double realSpeed);
}
