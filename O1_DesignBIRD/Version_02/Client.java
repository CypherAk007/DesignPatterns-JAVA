package O1_DesignBIRD.Version_02;

public class Client {
    public static void main(String[] args) {
//        Implemented Abstract methods in Bird Class
//                so all classes extending the Bird
//                must implement the abstract methods

//        BUT ISSUE: if non flyable bird - Penguin is there
//                we have to still implement fly

//        We can seprate out flyable and non flyable
//        if we do that then for new class like dance
//                flyabledance, flyablenon-dance, non flyable dance, non flyable non dance.
//        PROBLEMS:
//        1->CLASS EXPLOSION
//        2-> Find out the list of flyable birds
//        List<flyabledance | flyablenon-dance>  only one type list excepts

        Bird sparrow = new Sparrow();
        sparrow.fly();

        Bird egle = new Egle();
        egle.fly();

    }
}
