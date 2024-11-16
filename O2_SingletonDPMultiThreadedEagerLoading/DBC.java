package O2_SingletonDPMultiThreadedEagerLoading;

public class DBC {
//    private static  DBC dbc = null;
//    Replaced with this EAGER LOADING
    private static  DBC dbc = new DBC();


    private String url;
    private String username;
    private String password;

    private DBC(){

    }
    private DBC(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;

    }

    public static DBC createDbConn(){
        return dbc;
    }

    public void makeCon(){
        System.out.println("Connection established!!");
    }
}
