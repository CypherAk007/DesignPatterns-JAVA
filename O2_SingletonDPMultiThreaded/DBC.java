package O2_SingletonDPMultiThreaded;

public class DBC {
    private static  DBC dbc = null;

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
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        if (dbc==null){
            dbc = new DBC();

        }
        return dbc;
    }

    public void makeCon(){
        System.out.println("Connection established!!");
    }
}
