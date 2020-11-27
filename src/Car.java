/*
    The class Car represents distinct cars which will be driven by pilots in tracks.
    The difference btw cars are the theory speed and fuel. Both traits will have influence
    in the pilot's efficiency and the car.
    @author Jorge del Castillo Gomez
 */
public class Car {
    String nameCar;
    Speed speedCar;
    Fuel initialFuel;
    double fuelLeftOver;

    public Car(String nameCar,Speed speed, Fuel fuel){
        this.fuelLeftOver = fuel.getAmountFuel();
        this.nameCar = nameCar;
        this.initialFuel = fuel;
        this.speedCar = speed;
    }
    /*
        Return the name of the car
        @return String Name of a car
    */
    public String getNameCar(){return nameCar;};
    /*
        Return the theory speed of a car
        @return Speed speed of a car
    */
    public Speed getSpeedCar(){return speedCar;};
    /*
       Return the theory fuel of a car
       @return Initial fuel of a car
    */
    public Fuel getInitialFuel() {return initialFuel;}

    /*
       Return the fuel that is left over from a car
       @return fuel leftover as a Double from a car
    */
    public double getFuelLeftOver(){return fuelLeftOver;};
    /*
        Calculate the real speed of a car given the skill from de pilot who drives it
        and the complexity of the track where the car is running.
        @param skills The pilot's skills as a float. complexity The track's complexity as a double
        @return double the real speed of a car as a Float
    */
    public double getRealSpeed(double skills,double complexity){
        return (getSpeedCar().getSpeed() * skills)/complexity;
    }
    /*
        Calculate the time (minutes) needed to finish a race by a specific pilot in a
        specific track.
        @param distance The distance of the track. realSpeed The car's realSpeed.
        @return a Double. The time needed to finish a race.
    */
    public double getTimeRace(double distance,double realSpeed){
        return (distance/realSpeed)*60;
    }
    /*
        Refresh the new car's fuel (fuelLeftOver) depending of the minutes played in the track by a pilot.
        @param minutesCompeted The pilot's competed with the car in a race.
        The fuel reduced depends on the minutes competed.
    */
    public void reduceFuel(double minutesCompeted){this.fuelLeftOver = this.fuelLeftOver - minutesCompeted; }

    /*
       Override the method toString returning the Name, Speed, initial fuel, and fuelLeftOver from a car
       @return the information of a traditional car as a String
    */
    @Override
    public String toString() {
        return "Car's name: " + nameCar + ", tipo: CocheNormal, " + speedCar.toString() + ", "+ initialFuel.toString() + "(actual:" + fuelLeftOver + ")";

    }
}
