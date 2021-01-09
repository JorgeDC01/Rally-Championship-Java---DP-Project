/*
    The interface of a Car with his methods.
 */
public interface ICar {
    /*
        Return the name of the car
        @return String Name of a car
    */
    String getNameCar();
    /*
        Return the theory speed of a car
        @return Speed speed of a car
    */
    Speed getSpeedCar();
    /*
       Return the theory fuel of a car
       @return Initial fuel of a car
    */
    Fuel getInitialFuel();
    /*
       Return the fuel that is left over from a car
       @return fuel leftover as a Double from a car
    */
    double getFuelLeftOver();
    /*
        Calculate the real speed of a car given the skill from de pilot who drives it
        and the complexity of the track where the car is running.
        @param skills The pilot's skills.
        @param complexity The track's complexity.
        @return double the real speed of a car as a Float.
    */
    double getRealSpeed(double skills,double complexity);
    /*
        Calculate the time (minutes) needed to finish a race by a specific pilot in a
        specific track.
        @param distance The distance of the track.
        @param realSpeed The car's realSpeed.
        @return a Double. The time needed to finish a race.
    */
    double getTimeRace(double distance,double realSpeed);
    /*
        Refresh the new car's fuel (fuelLeftOver) depending of the minutes played in the track by a pilot.
        @param minutesCompeted The pilot's competed with the car in a race.
        The fuel reduced depends on the minutes competed.
    */
    boolean reduceFuel(double minutesCompeted);
    /*
        This method return True if the car has fuel and false if not.
        @return Boolean: True if the car has fuel and false in the other case.
     */
    boolean hasFuelCar();
    /*
        Get the real speed from the field. This method let me have the real speed calculating it only once.
        @return The real speed of the car depending on the pilot.
     */
    double getrealSpeed();
    /*
        Set the real speed of the car from the field
        @param realSpeed The real speed to set to the car.
     */
    void setrealSpeed(double realSpeed);
}
