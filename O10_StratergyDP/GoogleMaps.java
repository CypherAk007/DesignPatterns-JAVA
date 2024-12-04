package O10_StratergyDP;

public class GoogleMaps {
    public void findPath(String source,String destination,TravelMode mode ){
        PathCalculatorFactory pathCalculatorFactory = new PathCalculatorFactory();
        pathCalculatorFactory
                .getPathCalculator(mode)
                .findPath(source,destination);
    }
}
