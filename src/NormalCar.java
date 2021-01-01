/*
    The class Car represents normal cars which will be driven by pilots in tracks.
    The difference btw cars are the theory speed and fuel. Both traits will have influence
    in the pilot's efficiency and the car. This class implements the interface of Car.
    @author Jorge del Castillo Gomez
 */
public class NormalCar implements ICar{
    String nameCar;
    Speed speedCar;
    Fuel initialFuel;
    double fuelLeftOver;
    double realSpeed;

    public NormalCar(String nameCar,Speed speed, Fuel fuel){
        this.fuelLeftOver = fuel.getAmountFuel();
        this.nameCar = nameCar;
        this.initialFuel = fuel;
        this.speedCar = speed;
        this.realSpeed = 0;
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
    public double getFuelLeftOver(){return Math.round(fuelLeftOver*100d)/100d;}
    /*
        Set the real speed of the car.
        @param realSpeed The real speed to set to the car.
     */
    public void setrealSpeed(double realSpeed){this.realSpeed = realSpeed;}
    /*
        Get the real speed from the field.
        @return The real speed of the car depending on the pilot.
     */
    public double getrealSpeed(){return this.realSpeed; }
    /*
        Calculate the real speed of a car given the skill from de pilot who drives it
        and the complexity of the track where the car is running.
        @param skills The pilot's skills.
        @param complexity The track's complexity.
        @return double the real speed of a car as a Float.
    */
    public double getRealSpeed(double skills,double complexity){
        double realSpeed = Math.round( ((getSpeedCar().getSpeed() * skills)/complexity)*100d)/100d;
        setrealSpeed(realSpeed);
        return realSpeed;
    }
    /*
        Calculate the time (minutes) needed to finish a race by a specific pilot in a
        specific track.
        @param distance The distance of the track.
        @param realSpeed The car's realSpeed.
        @return a Double. The time needed to finish a race.
    */
    public double getTimeRace(double distance,double realSpeed){
        return Math.round(((distance/realSpeed)*60)*100d)/100d;
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
        return "Car's name: " + getNameCar() + ", type: TraditionalCar, " + speedCar.toString() + ", "+ initialFuel.toString() + "(current:" + getFuelLeftOver() + ")";

    }
    /*
        Override the equals method to compare if two cars are identical(with their fields)
        @param obj The obj that will be compared to the first one if both are equals.
        @return True if both cars are identical, and False if they aren't identical
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //Both refer to the same car
        }
        if (!(obj instanceof ICar)) {
            return false; //They have different types
        }
        NormalCar other = (NormalCar) obj;
        return getNameCar().equals(other.getNameCar()) && getSpeedCar().getName().equals(other.getSpeedCar().getName()) &&
                getInitialFuel().getName().equals(other.getInitialFuel().getName()) && getFuelLeftOver() == other.getFuelLeftOver();
    }
    /*
        Override the method hashCode
        @return Code of car a as Int
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 7*result + getNameCar().hashCode();
        result = 13*result + ((getSpeedCar() == null) ? 0 : getSpeedCar().getName().hashCode());
        result = 11*result + ((getInitialFuel() == null) ? 0 : getInitialFuel().getName().hashCode());
        result = (int) (19*result + getFuelLeftOver());
        return result;
    }
    /*
        This method return True if the car has fuel and false if not.
        @return Boolean: True if the car has fuel and false in the other case.
     */
    public boolean hasFuelCar(){
        return getFuelLeftOver() > 0;
    }
}
