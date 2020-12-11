/*
    The interface of a Track and the decorator. This interface will declare the comom methods
    that will be used at decorator and at track.
    @author: Jorge del Castillo Gómez
 */

public interface ITrack {
     double getComplexity();
     double getDistance();
     String getNoumExtras();
     String getNameTrack();
     DistanceTrack getOriginalDistance();
     ComplexityTrack getOriginalComplexity();
}

