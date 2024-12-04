package O10_StratergyDP;

public class PathCalculatorFactory {
    public PathCalculator getPathCalculator(TravelMode mode){
//        switch(mode){
//            case CAR:
//                CarPathCalculatorStrategy carPathCalculatorStrategy = new CarPathCalculatorStrategy();
//                carPathCalculatorStrategy.findPath(source,destination);
//                break;
//            case BIKE:
//                BikePathCalculatorStrategy bikePathCalculatorStrategy = new BikePathCalculatorStrategy();
//                bikePathCalculatorStrategy.findPath(source,destination);
//                break;
//
//
//        }
        return switch (mode){
            case CAR -> new CarPathCalculatorStrategy();
            case BIKE -> new BikePathCalculatorStrategy();
            case WALK -> new WalkPathCalculatorStrategy();

        };
    }
}
