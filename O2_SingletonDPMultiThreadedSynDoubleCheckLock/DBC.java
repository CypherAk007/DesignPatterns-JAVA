package O2_SingletonDPMultiThreadedSynDoubleCheckLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBC {
    private static  DBC dbc = null;

    private String url;
    private String username;
    private String password;

    private static Lock lock = new ReentrantLock();

    private DBC(){

    }
    private DBC(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;

    }
//    DOUBLE CHECKING LOCK
    public static DBC createDbConn(){
        if (dbc==null){
            lock.lock();
            if (dbc==null) {
                dbc = new DBC();
            }
            lock.unlock();
        }
        return dbc;
    }

    public void makeCon(){
        System.out.println("Connection established!!");
    }
}
