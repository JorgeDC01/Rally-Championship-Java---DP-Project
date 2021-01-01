/*
    This class FastCar represents the fast cars that extends NormalCar. The difference btw both kind of cars is that
    a fast car includes a nitro (80) which can be used to increase the speed of the car. So this car calculates the
    speed depending on the nitro.
    @author Jorge del Castillo Gomez
 */
public class FastCar extends NormalCar {

    private  double nitro = 80;
    /*
        Parameterized Constructor. Initialize the name of the car, his original speed and fuel calling
        the constructor from the superclass fast Car.
        @param nameCar The name of the fast car.
        @param speed The original speed.
        @param fuel The original fuel of the fast car.
     */
    public FastCar(String nameCar, Speed speed, Fuel fuel) {
        super(nameCar, speed, fuel);
    }
    /*
        Set the nitro of a fast car
        @param nitro The amount of nitro.
     */
    public void setNitro(double nitro){this.nitro = nitro;}
    /*
        Get resistant car's nitro
        @return The nitro from a resistant car as a Double
     */
    public double getNitro(){return Math.round(this.nitro*100d)/100d;}
    /*
        Calculate the real speed of a car given the skill from de pilot who drives it
        and the complexity of the track where the car is running, bearing the amount of nitro
        in mind. This method override the getRealSpeed from the superclass Car
        @param skills The pilot's skills.
        @param complexity The track's complexity
        @return The realSpeed of a car as a Float depending of the nitro.
     */
    @Override
    public double getRealSpeed(double skills, double complexity) {
        double realSpeedInitial = super.getRealSpeed(skills,complexity);
        if(getNitro() == 0){
            setrealSpeed(realSpeedInitial);
            return realSpeedInitial;
        }
         else{
             //Case that nitro is enough to increase the realSpeed of the car to 20%
             if(nitro >= 0.2*realSpeedInitial) {
                 setrealSpeed(realSpeedInitial);
                 double nitroUsed = Math.round(0.2*realSpeedInitial*100d)/100d;
                 setNitro(getNitro() - 0.2 * realSpeedInitial);
                 realSpeedInitial += 0.2 * realSpeedInitial;
                 System.out.println("+++ El " + getNameCar() + " usa " + nitroUsed + " de nitro para alcanzar " + realSpeedInitial + " km/hora y el nitro restante es " + getNitro() + " +++");
             }
             //Case that nitro isn't enough to increase the realSpeed of the car up to 20%
            else{
                 realSpeedInitial += getNitro();
                 setrealSpeed(realSpeedInitial);
                 System.out.println("+++ El " + getNameCar() + " usa " +getNitro() + " de nitro para alcanzar " + getrealSpeed() + " km/hora y el nitro restante es " + 0 + " +++");
                 setNitro(0);
             }
            return Math.round(realSpeedInitial*100d)/100d;
        }
    }
    /*
       Override the method toString returning the Name, Speed, initial fuel, and fuelLeftOver from a car
       @return the information of a fast Car
    */
    @Override
    public String toString() {
        return "Car's name: " + getNameCar() + ", type: FastCar, " + speedCar.toString() + ", "+ initialFuel.toString() + "(current:" + getFuelLeftOver() + "), " + "nitropending: " + getNitro();
    }
    /*
        Override the equals method to compare if two FastCars are identical(with their fields).
        This equals needs to call the superclass' equals method to make sure that the car is the same.
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
        FastCar other = (FastCar) obj; // We do casting bs the compiler doesn't know
                                       //the type of obj
        return super.equals(other) && getNitro() == other.getNitro();
    }
    /*
        Override the method hashCode
        @return Code of FastCar a as Int
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 13*result + super.hashCode();
        result = (int) (11*result + getNitro());
        return result;
    }

    @Override
    public double getTimeRace(double distance, double realSpeed) {
        return super.getTimeRace(distance, realSpeed);
    }
}
