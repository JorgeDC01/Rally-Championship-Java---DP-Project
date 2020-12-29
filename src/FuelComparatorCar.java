/*
    Java class that implements the interface Comparator to Cars.
    This class implements the compare method. It is a strategy that will be chosen by the client.
 */
import java.util.Comparator;
public class FuelComparatorCar implements Comparator<ICar>{
    /*
        Override the method compare of the interface Comparator of Java. If the fuel left over of both cars are equal, they will be compared
        by their names.
        @param c1 The first car that will be compared
        @param c2 The second car that will be compared
        @return 1 if c1 > c2;0 if c1 = c2 and -1 if c1<c2
     */
    @Override
    public int compare(ICar c1, ICar c2) {
        if(c1.getFuelLeftOver() == c2.getFuelLeftOver()){
            return c1.getNameCar().compareTo(c2.getNameCar());
        }
        else if(c1.getFuelLeftOver() > c2.getFuelLeftOver()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
