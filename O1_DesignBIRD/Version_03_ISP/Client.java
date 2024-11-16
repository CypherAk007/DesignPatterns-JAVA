package O1_DesignBIRD.Version_03_ISP;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Implemented Seprate

        Sparrow sparrow = new Sparrow();
        sparrow.fly();

        Egle egle = new Egle();
        egle.fly();

        Swan swan = new Swan();
        swan.fly();

        List<Flyable> flyableList = List.of(new Egle(),new Swan());
        for(Flyable bird:flyableList){
            bird.fly();
        }

//        Error if you put penguin in the Flyable list
//        List<Flyable> flyableList = List.of(new Egle(),new Swan(),new Penguin());
//        Required type:
//        List
//                <Flyable>
//        Provided:
//        List
//                <Object>


//        IF SWAN AND SPARROW WANTS TO FLY THE SMAE WAY
//                WE HAVE TO COPY THE CODE FROM ONE FLY TO
//                ANOTHER
//        SOL: we have to create a  function for not duplicating the code
//        BUT THE ISSUE IS IF WE HAVE TO CHANGE THE BEHAVIOUR TO FFB THEN WE HAVE TO CHANGE THE CODE

    }


}
