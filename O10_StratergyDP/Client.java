package O10_StratergyDP;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("A","B",TravelMode.CAR);
    }
}
