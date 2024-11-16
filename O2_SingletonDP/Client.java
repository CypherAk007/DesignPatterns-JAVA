package O2_SingletonDP;

public class Client {
    public static void main(String[] args) {
//        DBC dbc1 = new DBC();
//        DBC dbc2 = new DBC();

        DBC dbc1 = DBC.createDbConn();
        DBC dbc2 = DBC.createDbConn();

        if (dbc1 == dbc2) {
            System.out.println("Objects are same : " + dbc1 + " " + dbc2);

        } else {
            System.out.println("Objects are different: " + dbc1 + " " + dbc2);
        }

//        dbc1.makeCon();
    }

}
