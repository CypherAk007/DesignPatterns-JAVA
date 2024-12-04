package O2_SingletonDPMultiThreadedSynDoubleCheckSync;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Set<DBC> databaseConnections = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0;i<1000;i++){
            executorService.submit(()->databaseConnections.add(DBC.createDbConn()));
        }

        Thread.sleep(3000);
        System.out.println("Size of the Database Connections : "+databaseConnections.size());
//        OUTPUT: Size of the Database Connections : 2 // WITHOUT SYNC
//        With SYNC -> Size of the Database Connections : 1 as locks -> synchronized
//        is implemented on the critical section

        executorService.shutdown();

    }
}
