package O2_SingletonDPMultiThreaded;

import java.util.HashMap;
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
//        OUTPUT: Size of the Database Connections : 3
//        THOUGH ITS SINGLETON AS WE ARE GETTING MULTIPLE INSTANCE AS
//                MULTIPLE THREADS ENTER THE(CRITICAL SECTION)  if (dbc==null){
//            SIMULTAINOUSLY
        executorService.shutdown();

    }
}
