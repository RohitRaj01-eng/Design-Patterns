import java.util.*;

public class DBConnectionPool {
    private final Queue<DBConnection> availableDbConnections=new LinkedList<>();
    private final Set<DBConnection> inUseDbConnections=new HashSet<>();
    private final int maxsize;

    public DBConnectionPool(int maxsize) {
        this.maxsize = maxsize;
    }

    public DBConnection borrow(){
        DBConnection dbConnection;
        if(!availableDbConnections.isEmpty()){
            dbConnection=availableDbConnections.poll();
        }
        else if(inUseDbConnections.size()<maxsize){
            dbConnection=new DBConnection();
        }
        else{
            throw new RuntimeException("No connectional available");
        }
        inUseDbConnections.add(dbConnection);
        return dbConnection;
    }

    public void release(DBConnection dbConnection){
        if(!inUseDbConnections.remove(dbConnection)){
            throw new IllegalArgumentException("Unknown connection");
        }
        dbConnection.reset();
        availableDbConnections.offer(dbConnection);
    }
}
