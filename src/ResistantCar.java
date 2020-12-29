/*
    This class represents the resistant Cars. This class extends the normalCar's class bs some methods have the same implementation.
    The difference btw a resistant car and a normal car is that the first one has an extra fuel.
 */
public class ResistantCar extends NormalCar{
    //extra fuel 100litres to use at only one race when they weren't able to finish it for not having enough fuel.
    private double extraFuel = 100;

    /*
        Parameterized Constructor. Initialize the name of the car, his theory speed and fuel calling
        the constructor from the superclass Car.
        @param nameCar The name of the car.
        @param speed The theory speed.
        @param fuel The original fuel.
     */
    public ResistantCar(String nameCar, Speed speed, Fuel fuel) {
        super(nameCar, speed, fuel);
    }
    /*
        Set the extraFuel to an amount of fuel.
        @param  extraFuel The extraFuel is the fuel added.
     */
    public void setExtraFuel(double extraFuel) { this.extraFuel = extraFuel;}
    /*
        Get the extra fuel of a resistant car.
        @return The extra fuel as a Double
     */
    public double getExtraFuel(){return this.extraFuel;}
    /*
        This method override the method reduceFuel from the superClass Car depending on the minutesCompeted.
        If the car has extraFuel and minutesCompeted > car's fuel -> increase the amount of fuel and update
        the extraFuel to 0 (no more extra)
        In the rest of cases, apply the reduction of fuel like a traditional car.
        @param minutesCompeted The minutes competed by a car to reduce the fuel as a Double.
     */
    @Override
    public void reduceFuel(double minutesCompeted) {
        if(getExtraFuel() != 0 && minutesCompeted > super.getFuelLeftOver()){
            increaseFuelLeftOver(extraFuel);
            setExtraFuel(0);
        }
         else{
        super.reduceFuel(minutesCompeted);
         }
    }
    /*
        Increase the fuel of the ResistantCar adding an increase.
        @param increase The increase that will be added to the fuel of a resistant car as a Double.
     */
    public void increaseFuelLeftOver(double increase){
        this.fuelLeftOver += increase;}

    /*
        Override the method toString returning the Name, Speed, initial fuel, and fuelLeftOver from a car.
        @return The information of a fast Car.
    */
    @Override
    public String toString() {
        return "Car's name: " + getNameCar() + ", Type: ResistantCar, " + speedCar.toString() + ", "+ initialFuel.toString() + "(Current:" + getFuelLeftOver() + "), " + "reserve: " + getExtraFuel();
    }
    /*
        Override the equals method to compare if two ResistantCars are identical(with their fields).
        @param obj The obj that will be compared if both are equals.
        @return True if both cars are identical, and False if they aren't identical.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //Both refer to the same car
        }
        if (!(obj instanceof ICar)) {
            return false; //They have different types
        }
        ResistantCar other = (ResistantCar) obj;
        return super.equals(other) && getExtraFuel() == other.getExtraFuel();
    }
    /*
       Override the method hashCode
       @return Code of ResistantCar a as Int
    */
    @Override
    public int hashCode() {
        int result = 17;
        result = 13*result + super.hashCode();
        result = (int) (11*result + getExtraFuel());
        return result;
    }
}
