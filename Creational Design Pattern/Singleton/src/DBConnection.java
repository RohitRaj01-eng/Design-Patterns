public class DBConnection {
    private final String dbName;
    private String dummyDbName;
    private static DBConnection INSTANCE;
    private DBConnection(String dbName){
        this.dbName=dbName;
    }

    public static void init(String dbName){
        if(INSTANCE!=null)throw new IllegalStateException("Already initialised");
        INSTANCE=new DBConnection(dbName);
    }
    public static DBConnection getDbConnection(){
        if(INSTANCE==null){
            throw  new IllegalStateException("DB not initialised");
        }
        return INSTANCE;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDummyDbName(String dbName){
        this.dummyDbName=dbName;
    }

    public String getDummyDbName() {
        return dummyDbName;
    }

    public void updateDB(){
        System.out.println("DB updated");
    }

}
