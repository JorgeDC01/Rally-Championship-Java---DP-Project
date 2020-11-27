public class FastCar extends Car {

    private  double nitro = 80;
    /*
        Parameterized Constructor. Initialize the name of the car, his original speed and fuel calling
        the constructor from the superclass Car.
        @param  nameCar The name of the car. speed The original speed. fuel The original fuel
     */
    public FastCar(String nameCar, Speed speed, Fuel fuel) {
        super(nameCar, speed, fuel);
    }
    /*
        Calculate the real speed of a car given the skill from de pilot who drives it
        and the complexity of the track where the car is running, bearing the amount of nitro
        in mind. This method override the getRealSpeed from the superclass Car
        @param skills The pilot's skills. complexity The track's complexity
        @return realSpeedInitial  The realSpeed of a car as a Float depending of the nitro
     */
    @Override
    public double getRealSpeed(double skills, double complexity) {
        double realSpeedInitial = super.getRealSpeed(skills,complexity);
        if(nitro == 0){
            return realSpeedInitial;
        }
         else{
             //Case that nitro is enough to increase the realSpeed of the car to 20%
             if(nitro >= 0.2*realSpeedInitial){
                 nitro = nitro - 0.2*realSpeedInitial;
                 realSpeedInitial += 0.2 * realSpeedInitial;
                 return realSpeedInitial;}
             //Case that nitro isn't enough to increase the realSpeed of the car up to 20%
            else{
                 realSpeedInitial += nitro;
                 nitro = 0;
                 return realSpeedInitial;
            }
        }
    }
    /*
       Override the method toString returning the Name, Speed, initial fuel, and fuelLeftOver from a car
       @return the information of a fast Car
    */
    @Override
    public String toString() {
        return "Car's name: " + nameCar + ", tipo: CocheRapido, " + speedCar.toString() + ", "+ initialFuel.toString() + "(actual:" + fuelLeftOver + "), " + "nitroPendiente: " + nitro;

    }
}
