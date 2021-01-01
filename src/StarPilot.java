/*
    The class Pilot who is a star. The skills will be calculated in a different way in relation with
    other pilots.
    Override the method calculateSkills that is abstract in the class Pilot
 */
import java.math.*;
public class StarPilot extends Pilot{
    /*
        Initialize the beginner pilot. This Parameterized constructor calls the super constructor
        which is protected.
        @param namePilot of the star pilot.
        @param carPilot The car assigned to a star pilot.
        @param concentration The concentration of the star pilot.
     */
    protected StarPilot(String namePilot, ICar carPilot, Concentration concentration) { super(namePilot, carPilot, concentration); }
    /*
        This method is override from Pilot. Calculate the skills of the pilot with
        specific constant.
        @return The skills of a star pilot.
    */
    @Override
    public double calculateSkills() {
        double v = Math.round( ((((getConcentration().getConcentrationPilot() + 6) / 140)*1.06) + 0.05)*100d)/100d;
        return v;
    }
    /*
       Override the toString method.
       @return The output of a star pilot as a String.
    */
    @Override
    public String toString() {
        return "Pilot: " + getNamePilot() + ", Tipo: Star" + ", Skills: " + calculateSkills() + ", Conc: " + getConcentration().getName() + "("+ getConcentration().getConcentrationPilot() + ")" + ", Descalificado: " + getDisqualifyPilot();
    }
}
